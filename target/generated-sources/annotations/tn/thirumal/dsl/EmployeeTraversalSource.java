package tn.thirumal.dsl;

import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import org.apache.tinkerpop.gremlin.process.computer.Computer;
import org.apache.tinkerpop.gremlin.process.computer.GraphComputer;
import org.apache.tinkerpop.gremlin.process.remote.RemoteConnection;
import org.apache.tinkerpop.gremlin.process.traversal.Traversal;
import org.apache.tinkerpop.gremlin.process.traversal.TraversalStrategies;
import org.apache.tinkerpop.gremlin.process.traversal.TraversalStrategy;
import org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.GraphTraversal;
import org.apache.tinkerpop.gremlin.process.traversal.step.map.AddEdgeStartStep;
import org.apache.tinkerpop.gremlin.process.traversal.step.map.AddVertexStartStep;
import org.apache.tinkerpop.gremlin.process.traversal.step.map.GraphStep;
import org.apache.tinkerpop.gremlin.process.traversal.step.sideEffect.InjectStep;
import org.apache.tinkerpop.gremlin.structure.Edge;
import org.apache.tinkerpop.gremlin.structure.Graph;
import org.apache.tinkerpop.gremlin.structure.Vertex;

public class EmployeeTraversalSource extends EmployeeTraversalSourceDsl {
  public EmployeeTraversalSource(Graph graph) {
    super(graph);
  }

  public EmployeeTraversalSource(Graph graph, TraversalStrategies strategies) {
    super(graph, strategies);
  }

  public EmployeeTraversalSource(RemoteConnection connection) {
    super(connection);
  }

  @Override
  public EmployeeTraversalSource clone() {
    return (EmployeeTraversalSource) super.clone();
  }

  @Override
  public EmployeeTraversalSource with(String key) {
    return (EmployeeTraversalSource) super.with(key);
  }

  @Override
  public EmployeeTraversalSource with(String key, Object value) {
    return (EmployeeTraversalSource) super.with(key,value);
  }

  @Override
  public EmployeeTraversalSource withBulk(boolean useBulk) {
    return (EmployeeTraversalSource) super.withBulk(useBulk);
  }

  @Override
  public EmployeeTraversalSource withComputer() {
    return (EmployeeTraversalSource) super.withComputer();
  }

  @Override
  public EmployeeTraversalSource withComputer(Computer computer) {
    return (EmployeeTraversalSource) super.withComputer(computer);
  }

  @Override
  public EmployeeTraversalSource withComputer(Class<? extends GraphComputer> graphComputerClass) {
    return (EmployeeTraversalSource) super.withComputer(graphComputerClass);
  }

  @Override
  public EmployeeTraversalSource withPath() {
    return (EmployeeTraversalSource) super.withPath();
  }

  @Override
  public <A> EmployeeTraversalSource withSack(A initialValue) {
    return (EmployeeTraversalSource) super.withSack(initialValue);
  }

  @Override
  public <A> EmployeeTraversalSource withSack(Supplier<A> initialValue) {
    return (EmployeeTraversalSource) super.withSack(initialValue);
  }

  @Override
  public <A> EmployeeTraversalSource withSack(Supplier<A> initialValue,
      UnaryOperator<A> splitOperator) {
    return (EmployeeTraversalSource) super.withSack(initialValue,splitOperator);
  }

  @Override
  public <A> EmployeeTraversalSource withSack(A initialValue, UnaryOperator<A> splitOperator) {
    return (EmployeeTraversalSource) super.withSack(initialValue,splitOperator);
  }

  @Override
  public <A> EmployeeTraversalSource withSack(Supplier<A> initialValue,
      BinaryOperator<A> mergeOperator) {
    return (EmployeeTraversalSource) super.withSack(initialValue,mergeOperator);
  }

  @Override
  public <A> EmployeeTraversalSource withSack(A initialValue, BinaryOperator<A> mergeOperator) {
    return (EmployeeTraversalSource) super.withSack(initialValue,mergeOperator);
  }

  @Override
  public <A> EmployeeTraversalSource withSack(Supplier<A> initialValue,
      UnaryOperator<A> splitOperator, BinaryOperator<A> mergeOperator) {
    return (EmployeeTraversalSource) super.withSack(initialValue,splitOperator,mergeOperator);
  }

  @Override
  public <A> EmployeeTraversalSource withSack(A initialValue, UnaryOperator<A> splitOperator,
      BinaryOperator<A> mergeOperator) {
    return (EmployeeTraversalSource) super.withSack(initialValue,splitOperator,mergeOperator);
  }

  @Override
  public <A> EmployeeTraversalSource withSideEffect(String key, A initialValue) {
    return (EmployeeTraversalSource) super.withSideEffect(key,initialValue);
  }

  @Override
  public <A> EmployeeTraversalSource withSideEffect(String key, Supplier<A> initialValue) {
    return (EmployeeTraversalSource) super.withSideEffect(key,initialValue);
  }

  @Override
  public <A> EmployeeTraversalSource withSideEffect(String key, Supplier<A> initialValue,
      BinaryOperator<A> reducer) {
    return (EmployeeTraversalSource) super.withSideEffect(key,initialValue,reducer);
  }

  @Override
  public <A> EmployeeTraversalSource withSideEffect(String key, A initialValue,
      BinaryOperator<A> reducer) {
    return (EmployeeTraversalSource) super.withSideEffect(key,initialValue,reducer);
  }

  @Override
  public EmployeeTraversalSource withStrategies(TraversalStrategy... traversalStrategies) {
    return (EmployeeTraversalSource) super.withStrategies(traversalStrategies);
  }

  @Override
  public EmployeeTraversalSource withoutStrategies(
      Class<? extends TraversalStrategy>... traversalStrategyClasses) {
    return (EmployeeTraversalSource) super.withoutStrategies(traversalStrategyClasses);
  }

  @Override
  public EmployeeTraversal<Vertex, Vertex> employer(String... properties) {
    EmployeeTraversalSource clone = this.clone();
    return new DefaultEmployeeTraversal (clone, super.employer(properties).asAdmin());
  }

  @Override
  public EmployeeTraversal<Vertex, Vertex> addV() {
    EmployeeTraversalSource clone = this.clone();
    clone.getBytecode().addStep(GraphTraversal.Symbols.addV);
    DefaultEmployeeTraversal traversal = new DefaultEmployeeTraversal(clone);
    return (EmployeeTraversal) traversal.asAdmin().addStep(new AddVertexStartStep(traversal, (String) null));
  }

  @Override
  public EmployeeTraversal<Vertex, Vertex> addV(String label) {
    EmployeeTraversalSource clone = this.clone();
    clone.getBytecode().addStep(GraphTraversal.Symbols.addV, label);
    DefaultEmployeeTraversal traversal = new DefaultEmployeeTraversal(clone);
    return (EmployeeTraversal) traversal.asAdmin().addStep(new AddVertexStartStep(traversal, label));
  }

  @Override
  public EmployeeTraversal<Vertex, Vertex> addV(Traversal vertexLabelTraversal) {
    EmployeeTraversalSource clone = this.clone();
    clone.getBytecode().addStep(GraphTraversal.Symbols.addV, vertexLabelTraversal);
    DefaultEmployeeTraversal traversal = new DefaultEmployeeTraversal(clone);
    return (EmployeeTraversal) traversal.asAdmin().addStep(new AddVertexStartStep(traversal, vertexLabelTraversal));
  }

  @Override
  public EmployeeTraversal<Edge, Edge> addE(String label) {
    EmployeeTraversalSource clone = this.clone();
    clone.getBytecode().addStep(GraphTraversal.Symbols.addE, label);
    DefaultEmployeeTraversal traversal = new DefaultEmployeeTraversal(clone);
    return (EmployeeTraversal) traversal.asAdmin().addStep(new AddEdgeStartStep(traversal, label));
  }

  @Override
  public EmployeeTraversal<Edge, Edge> addE(Traversal edgeLabelTraversal) {
    EmployeeTraversalSource clone = this.clone();
    clone.getBytecode().addStep(GraphTraversal.Symbols.addE, edgeLabelTraversal);
    DefaultEmployeeTraversal traversal = new DefaultEmployeeTraversal(clone);
    return (EmployeeTraversal) traversal.asAdmin().addStep(new AddEdgeStartStep(traversal, edgeLabelTraversal));
  }

  @Override
  public EmployeeTraversal<Vertex, Vertex> V(Object... vertexIds) {
    EmployeeTraversalSource clone = this.clone();
    clone.getBytecode().addStep(GraphTraversal.Symbols.V, vertexIds);
    DefaultEmployeeTraversal traversal = new DefaultEmployeeTraversal(clone);
    return (EmployeeTraversal) traversal.asAdmin().addStep(new GraphStep(traversal, Vertex.class, true, vertexIds));
  }

  @Override
  public EmployeeTraversal<Edge, Edge> E(Object... edgeIds) {
    EmployeeTraversalSource clone = this.clone();
    clone.getBytecode().addStep(GraphTraversal.Symbols.E, edgeIds);
    DefaultEmployeeTraversal traversal = new DefaultEmployeeTraversal(clone);
    return (EmployeeTraversal) traversal.asAdmin().addStep(new GraphStep(traversal, Edge.class, true, edgeIds));
  }

  @Override
  public <S> EmployeeTraversal<S, S> inject(S... starts) {
    EmployeeTraversalSource clone = this.clone();
    clone.getBytecode().addStep(GraphTraversal.Symbols.inject, starts);
    DefaultEmployeeTraversal traversal = new DefaultEmployeeTraversal(clone);
    return (EmployeeTraversal) traversal.asAdmin().addStep(new InjectStep(traversal, starts));
  }

  @Override
  public Optional<Class<?>> getAnonymousTraversalClass() {
    return Optional.of(__.class);
  }
}
