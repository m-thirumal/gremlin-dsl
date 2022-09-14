package tn.thirumal.dsl;

import org.apache.tinkerpop.gremlin.process.traversal.dsl.GremlinDsl;
import org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.GraphTraversal;

/**
 * 
 * @author Thirumal
 *
 * @param <S>
 * @param <E>
 */
@GremlinDsl(traversalSource = "tn.thirumal.dsl.EmployeeTraversalSourceDsl")
public interface EmployeeTraversalDsl<S, E> extends GraphTraversal.Admin<S, E> {

	
}
