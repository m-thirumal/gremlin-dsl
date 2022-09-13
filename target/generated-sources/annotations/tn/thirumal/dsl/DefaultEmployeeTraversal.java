package tn.thirumal.dsl;

import java.lang.Override;
import org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.GraphTraversal;
import org.apache.tinkerpop.gremlin.process.traversal.util.DefaultTraversal;
import org.apache.tinkerpop.gremlin.structure.Graph;

public class DefaultEmployeeTraversal<S, E> extends DefaultTraversal<S, E> implements EmployeeTraversal<S, E> {
  public DefaultEmployeeTraversal() {
    super();
  }

  public DefaultEmployeeTraversal(Graph graph) {
    super(graph);
  }

  public DefaultEmployeeTraversal(EmployeeTraversalSource traversalSource) {
    super(traversalSource);
  }

  public DefaultEmployeeTraversal(EmployeeTraversalSource traversalSource,
      GraphTraversal.Admin traversal) {
    super(traversalSource, traversal.asAdmin());
  }

  @Override
  public EmployeeTraversal<S, E> iterate() {
    return (EmployeeTraversal) super.iterate();
  }

  @Override
  public GraphTraversal.Admin<S, E> asAdmin() {
    return (GraphTraversal.Admin) super.asAdmin();
  }

  @Override
  public DefaultEmployeeTraversal<S, E> clone() {
    return (DefaultEmployeeTraversal) super.clone();
  }
}
