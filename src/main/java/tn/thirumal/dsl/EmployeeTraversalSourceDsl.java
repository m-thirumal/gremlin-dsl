/**
 * 
 */
package tn.thirumal.dsl;

import org.apache.tinkerpop.gremlin.process.remote.RemoteConnection;
import org.apache.tinkerpop.gremlin.process.traversal.TraversalStrategies;
import org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.DefaultGraphTraversal;
import org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.GraphTraversal;
import org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.GraphTraversalSource;
import org.apache.tinkerpop.gremlin.process.traversal.step.map.GraphStep;
import org.apache.tinkerpop.gremlin.structure.Graph;
import org.apache.tinkerpop.gremlin.structure.Vertex;

/**
 * @author Thirumal
 *
 */
public class EmployeeTraversalSourceDsl extends GraphTraversalSource {

	public EmployeeTraversalSourceDsl(final Graph graph) {
		super(graph);
	}
	
	public EmployeeTraversalSourceDsl(final Graph graph, final TraversalStrategies traversalStrategies) {
		super(graph, traversalStrategies);
	}
	
	public EmployeeTraversalSourceDsl(RemoteConnection connection) {
        super(connection);
    }
	
	public GraphTraversal<Vertex, Vertex> auction(String... properties) {
        GraphTraversalSource clone = this.clone();

        // Manually add a "start" step for the traversal in this case the equivalent of V(). GraphStep is marked
        // as a "start" step by passing "true" in the constructor.
        clone.getBytecode().addStep(GraphTraversal.Symbols.V);
        GraphTraversal<Vertex, Vertex> traversal = new DefaultGraphTraversal<>(clone);
        traversal.asAdmin().addStep(new GraphStep<>(traversal.asAdmin(), Vertex.class, true));

        traversal = traversal.hasLabel("employee");
        if (properties.length > 0) {
        	traversal = traversal.hasId(properties);
        }
        return traversal;
    }
	
}
