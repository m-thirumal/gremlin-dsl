package tn.thirumal.dsl;

import java.lang.Comparable;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Number;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import org.apache.tinkerpop.gremlin.process.computer.VertexProgram;
import org.apache.tinkerpop.gremlin.process.traversal.Order;
import org.apache.tinkerpop.gremlin.process.traversal.P;
import org.apache.tinkerpop.gremlin.process.traversal.Path;
import org.apache.tinkerpop.gremlin.process.traversal.Pop;
import org.apache.tinkerpop.gremlin.process.traversal.Scope;
import org.apache.tinkerpop.gremlin.process.traversal.Traversal;
import org.apache.tinkerpop.gremlin.process.traversal.Traverser;
import org.apache.tinkerpop.gremlin.process.traversal.step.util.Tree;
import org.apache.tinkerpop.gremlin.process.traversal.traverser.util.TraverserSet;
import org.apache.tinkerpop.gremlin.process.traversal.util.TraversalMetrics;
import org.apache.tinkerpop.gremlin.structure.Column;
import org.apache.tinkerpop.gremlin.structure.Direction;
import org.apache.tinkerpop.gremlin.structure.Edge;
import org.apache.tinkerpop.gremlin.structure.Element;
import org.apache.tinkerpop.gremlin.structure.Property;
import org.apache.tinkerpop.gremlin.structure.T;
import org.apache.tinkerpop.gremlin.structure.Vertex;
import org.apache.tinkerpop.gremlin.structure.VertexProperty;
import tn.thirumal.model.Employee;

public interface EmployeeTraversal<S, E> extends EmployeeTraversalDsl<S, E> {
  @Override
  default EmployeeTraversal<S, Vertex> getEmployer(String employerId) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.getEmployer(employerId);
  }

  @Override
  default EmployeeTraversal<S, Vertex> appoint(Employee employee) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.appoint(employee);
  }

  @Override
  default EmployeeTraversal<S, Vertex> V(Object... vertexIdsOrElements) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.V(vertexIdsOrElements);
  }

  @Override
  default EmployeeTraversal<S, Edge> addE(String edgeLabel) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.addE(edgeLabel);
  }

  @Override
  default EmployeeTraversal<S, Edge> addE(Traversal<?, String> edgeLabelTraversal) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.addE(edgeLabelTraversal);
  }

  @Override
  default EmployeeTraversal<S, Vertex> addV() {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.addV();
  }

  @Override
  default EmployeeTraversal<S, Vertex> addV(String vertexLabel) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.addV(vertexLabel);
  }

  @Override
  default EmployeeTraversal<S, Vertex> addV(Traversal<?, String> vertexLabelTraversal) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.addV(vertexLabelTraversal);
  }

  @Override
  default EmployeeTraversal<S, E> aggregate(String sideEffectKey) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.aggregate(sideEffectKey);
  }

  @Override
  default EmployeeTraversal<S, E> aggregate(Scope scope, String sideEffectKey) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.aggregate(scope,sideEffectKey);
  }

  @Override
  default EmployeeTraversal<S, E> and(Traversal<?, ?>... andTraversals) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.and(andTraversals);
  }

  @Override
  default EmployeeTraversal<S, E> as(String stepLabel, String... stepLabels) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.as(stepLabel,stepLabels);
  }

  @Override
  default EmployeeTraversal<S, E> barrier() {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.barrier();
  }

  @Override
  default EmployeeTraversal<S, E> barrier(int maxBarrierSize) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.barrier(maxBarrierSize);
  }

  @Override
  default EmployeeTraversal<S, E> barrier(Consumer<TraverserSet<Object>> barrierConsumer) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.barrier(barrierConsumer);
  }

  @Override
  default EmployeeTraversal<S, Vertex> both(String... edgeLabels) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.both(edgeLabels);
  }

  @Override
  default EmployeeTraversal<S, Edge> bothE(String... edgeLabels) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.bothE(edgeLabels);
  }

  @Override
  default EmployeeTraversal<S, Vertex> bothV() {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.bothV();
  }

  @Override
  default <M, E2> EmployeeTraversal<S, E2> branch(Traversal<?, M> branchTraversal) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.branch(branchTraversal);
  }

  @Override
  default <M, E2> EmployeeTraversal<S, E2> branch(Function<Traverser<E>, M> function) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.branch(function);
  }

  @Override
  default EmployeeTraversal<S, E> by() {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.by();
  }

  @Override
  default EmployeeTraversal<S, E> by(Traversal<?, ?> traversal) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.by(traversal);
  }

  @Override
  default EmployeeTraversal<S, E> by(T token) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.by(token);
  }

  @Override
  default EmployeeTraversal<S, E> by(String key) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.by(key);
  }

  @Override
  default <V> EmployeeTraversal<S, E> by(Function<V, Object> function) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.by(function);
  }

  @Override
  default EmployeeTraversal<S, E> by(Comparator<E> comparator) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.by(comparator);
  }

  @Override
  default EmployeeTraversal<S, E> by(Order order) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.by(order);
  }

  @Override
  default <V> EmployeeTraversal<S, E> by(Traversal<?, ?> traversal, Comparator<V> comparator) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.by(traversal,comparator);
  }

  @Override
  default <V> EmployeeTraversal<S, E> by(String key, Comparator<V> comparator) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.by(key,comparator);
  }

  @Override
  default <U> EmployeeTraversal<S, E> by(Function<U, Object> function, Comparator comparator) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.by(function,comparator);
  }

  @Override
  default <E> EmployeeTraversal<S, E> call(String service) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.call(service);
  }

  @Override
  default <E> EmployeeTraversal<S, E> call(String service, Map params) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.call(service,params);
  }

  @Override
  default <E> EmployeeTraversal<S, E> call(String service, Traversal<?, Map<?, ?>> childTraversal) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.call(service,childTraversal);
  }

  @Override
  default <E> EmployeeTraversal<S, E> call(String service, Map params,
      Traversal<?, Map<?, ?>> childTraversal) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.call(service,params,childTraversal);
  }

  @Override
  default <E2> EmployeeTraversal<S, E2> cap(String sideEffectKey, String... sideEffectKeys) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.cap(sideEffectKey,sideEffectKeys);
  }

  @Override
  default <M, E2> EmployeeTraversal<S, E2> choose(Traversal<?, M> choiceTraversal) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.choose(choiceTraversal);
  }

  @Override
  default <M, E2> EmployeeTraversal<S, E2> choose(Function<E, M> choiceFunction) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.choose(choiceFunction);
  }

  @Override
  default <E2> EmployeeTraversal<S, E2> choose(Traversal<?, ?> traversalPredicate,
      Traversal<?, E2> trueChoice) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.choose(traversalPredicate,trueChoice);
  }

  @Override
  default <E2> EmployeeTraversal<S, E2> choose(Predicate<E> choosePredicate,
      Traversal<?, E2> trueChoice) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.choose(choosePredicate,trueChoice);
  }

  @Override
  default <E2> EmployeeTraversal<S, E2> choose(Traversal<?, ?> traversalPredicate,
      Traversal<?, E2> trueChoice, Traversal<?, E2> falseChoice) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.choose(traversalPredicate,trueChoice,falseChoice);
  }

  @Override
  default <E2> EmployeeTraversal<S, E2> choose(Predicate<E> choosePredicate,
      Traversal<?, E2> trueChoice, Traversal<?, E2> falseChoice) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.choose(choosePredicate,trueChoice,falseChoice);
  }

  @Override
  default <E2> EmployeeTraversal<S, E2> coalesce(Traversal<?, E2>... coalesceTraversals) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.coalesce(coalesceTraversals);
  }

  @Override
  default EmployeeTraversal<S, E> coin(double probability) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.coin(probability);
  }

  @Override
  default EmployeeTraversal<S, E> connectedComponent() {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.connectedComponent();
  }

  @Override
  default <E2> EmployeeTraversal<S, E2> constant(E2 e) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.constant(e);
  }

  @Override
  default EmployeeTraversal<S, Long> count() {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.count();
  }

  @Override
  default EmployeeTraversal<S, Long> count(Scope scope) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.count(scope);
  }

  @Override
  default EmployeeTraversal<S, E> cyclicPath() {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.cyclicPath();
  }

  @Override
  default EmployeeTraversal<S, E> dedup(String... dedupLabels) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.dedup(dedupLabels);
  }

  @Override
  default EmployeeTraversal<S, E> dedup(Scope scope, String... dedupLabels) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.dedup(scope,dedupLabels);
  }

  @Override
  default EmployeeTraversal<S, E> drop() {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.drop();
  }

  @Override
  default EmployeeTraversal<S, Element> element() {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.element();
  }

  @Override
  default <E2> EmployeeTraversal<S, Map<Object, E2>> elementMap(String... propertyKeys) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.elementMap(propertyKeys);
  }

  @Override
  default EmployeeTraversal<S, E> emit() {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.emit();
  }

  @Override
  default EmployeeTraversal<S, E> emit(Traversal<?, ?> emitTraversal) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.emit(emitTraversal);
  }

  @Override
  default EmployeeTraversal<S, E> emit(Predicate<Traverser<E>> emitPredicate) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.emit(emitPredicate);
  }

  @Override
  default EmployeeTraversal<S, E> fail() {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.fail();
  }

  @Override
  default EmployeeTraversal<S, E> fail(String message) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.fail(message);
  }

  @Override
  default EmployeeTraversal<S, E> filter(Predicate<Traverser<E>> predicate) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.filter(predicate);
  }

  @Override
  default EmployeeTraversal<S, E> filter(Traversal<?, ?> filterTraversal) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.filter(filterTraversal);
  }

  @Override
  default <E2> EmployeeTraversal<S, E2> flatMap(Function<Traverser<E>, Iterator<E2>> function) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.flatMap(function);
  }

  @Override
  default <E2> EmployeeTraversal<S, E2> flatMap(Traversal<?, E2> flatMapTraversal) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.flatMap(flatMapTraversal);
  }

  @Override
  default EmployeeTraversal<S, List<E>> fold() {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.fold();
  }

  @Override
  default <E2> EmployeeTraversal<S, E2> fold(E2 seed, BiFunction<E2, E, E2> foldFunction) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.fold(seed,foldFunction);
  }

  @Override
  default EmployeeTraversal<S, E> from(String fromStepLabel) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.from(fromStepLabel);
  }

  @Override
  default EmployeeTraversal<S, E> from(Traversal<?, Vertex> fromVertex) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.from(fromVertex);
  }

  @Override
  default EmployeeTraversal<S, E> from(Vertex fromVertex) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.from(fromVertex);
  }

  @Override
  default <K, V> EmployeeTraversal<S, Map<K, V>> group() {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.group();
  }

  @Override
  default EmployeeTraversal<S, E> group(String sideEffectKey) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.group(sideEffectKey);
  }

  @Override
  default <K> EmployeeTraversal<S, Map<K, Long>> groupCount() {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.groupCount();
  }

  @Override
  default EmployeeTraversal<S, E> groupCount(String sideEffectKey) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.groupCount(sideEffectKey);
  }

  @Override
  default EmployeeTraversal<S, E> has(String propertyKey) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.has(propertyKey);
  }

  @Override
  default EmployeeTraversal<S, E> has(String propertyKey, P<?> predicate) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.has(propertyKey,predicate);
  }

  @Override
  default EmployeeTraversal<S, E> has(T accessor, P<?> predicate) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.has(accessor,predicate);
  }

  @Override
  default EmployeeTraversal<S, E> has(String propertyKey, Object value) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.has(propertyKey,value);
  }

  @Override
  default EmployeeTraversal<S, E> has(T accessor, Object value) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.has(accessor,value);
  }

  @Override
  default EmployeeTraversal<S, E> has(T accessor, Traversal<?, ?> propertyTraversal) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.has(accessor,propertyTraversal);
  }

  @Override
  default EmployeeTraversal<S, E> has(String propertyKey, Traversal<?, ?> propertyTraversal) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.has(propertyKey,propertyTraversal);
  }

  @Override
  default EmployeeTraversal<S, E> has(String label, String propertyKey, P<?> predicate) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.has(label,propertyKey,predicate);
  }

  @Override
  default EmployeeTraversal<S, E> has(String label, String propertyKey, Object value) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.has(label,propertyKey,value);
  }

  @Override
  default EmployeeTraversal<S, E> hasId(P<Object> predicate) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.hasId(predicate);
  }

  @Override
  default EmployeeTraversal<S, E> hasId(Object id, Object... otherIds) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.hasId(id,otherIds);
  }

  @Override
  default EmployeeTraversal<S, E> hasKey(P<String> predicate) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.hasKey(predicate);
  }

  @Override
  default EmployeeTraversal<S, E> hasKey(String label, String... otherLabels) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.hasKey(label,otherLabels);
  }

  @Override
  default EmployeeTraversal<S, E> hasLabel(P<String> predicate) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.hasLabel(predicate);
  }

  @Override
  default EmployeeTraversal<S, E> hasLabel(String label, String... otherLabels) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.hasLabel(label,otherLabels);
  }

  @Override
  default EmployeeTraversal<S, E> hasNot(String propertyKey) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.hasNot(propertyKey);
  }

  @Override
  default EmployeeTraversal<S, E> hasValue(P<Object> predicate) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.hasValue(predicate);
  }

  @Override
  default EmployeeTraversal<S, E> hasValue(Object value, Object... otherValues) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.hasValue(value,otherValues);
  }

  @Override
  default EmployeeTraversal<S, Object> id() {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.id();
  }

  @Override
  default EmployeeTraversal<S, E> identity() {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.identity();
  }

  @Override
  default EmployeeTraversal<S, Vertex> in(String... edgeLabels) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.in(edgeLabels);
  }

  @Override
  default EmployeeTraversal<S, Edge> inE(String... edgeLabels) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.inE(edgeLabels);
  }

  @Override
  default EmployeeTraversal<S, Vertex> inV() {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.inV();
  }

  @Override
  default <E2> EmployeeTraversal<S, E2> index() {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.index();
  }

  @Override
  default EmployeeTraversal<S, E> inject(E... injections) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.inject(injections);
  }

  @Override
  default EmployeeTraversal<S, E> is(P<E> predicate) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.is(predicate);
  }

  @Override
  default EmployeeTraversal<S, E> is(Object value) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.is(value);
  }

  @Override
  default EmployeeTraversal<S, String> key() {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.key();
  }

  @Override
  default EmployeeTraversal<S, String> label() {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.label();
  }

  @Override
  default EmployeeTraversal<S, E> limit(long limit) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.limit(limit);
  }

  @Override
  default <E2> EmployeeTraversal<S, E2> limit(Scope scope, long limit) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.limit(scope,limit);
  }

  @Override
  default <E2> EmployeeTraversal<S, E2> local(Traversal<?, E2> localTraversal) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.local(localTraversal);
  }

  @Override
  default EmployeeTraversal<S, Integer> loops() {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.loops();
  }

  @Override
  default EmployeeTraversal<S, Integer> loops(String loopName) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.loops(loopName);
  }

  @Override
  default <E2> EmployeeTraversal<S, E2> map(Function<Traverser<E>, E2> function) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.map(function);
  }

  @Override
  default <E2> EmployeeTraversal<S, E2> map(Traversal<?, E2> mapTraversal) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.map(mapTraversal);
  }

  @Override
  default <E2> EmployeeTraversal<S, Map<String, E2>> match(Traversal<?, ?>... matchTraversals) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.match(matchTraversals);
  }

  @Override
  default EmployeeTraversal<S, Double> math(String expression) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.math(expression);
  }

  @Override
  default <E2 extends Comparable> EmployeeTraversal<S, E2> max() {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.max();
  }

  @Override
  default <E2 extends Comparable> EmployeeTraversal<S, E2> max(Scope scope) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.max(scope);
  }

  @Override
  default <E2 extends Number> EmployeeTraversal<S, E2> mean() {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.mean();
  }

  @Override
  default <E2 extends Number> EmployeeTraversal<S, E2> mean(Scope scope) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.mean(scope);
  }

  @Override
  default EmployeeTraversal<S, Edge> mergeE() {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.mergeE();
  }

  @Override
  default EmployeeTraversal<S, Edge> mergeE(Map<Object, Object> searchCreate) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.mergeE(searchCreate);
  }

  @Override
  default EmployeeTraversal<S, Edge> mergeE(Traversal<?, Map<Object, Object>> searchCreate) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.mergeE(searchCreate);
  }

  @Override
  default EmployeeTraversal<S, Vertex> mergeV() {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.mergeV();
  }

  @Override
  default EmployeeTraversal<S, Vertex> mergeV(Map<Object, Object> searchCreate) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.mergeV(searchCreate);
  }

  @Override
  default EmployeeTraversal<S, Vertex> mergeV(Traversal<?, Map<Object, Object>> searchCreate) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.mergeV(searchCreate);
  }

  @Override
  default <E2 extends Comparable> EmployeeTraversal<S, E2> min() {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.min();
  }

  @Override
  default <E2 extends Comparable> EmployeeTraversal<S, E2> min(Scope scope) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.min(scope);
  }

  @Override
  default EmployeeTraversal<S, E> none() {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.none();
  }

  @Override
  default EmployeeTraversal<S, E> not(Traversal<?, ?> notTraversal) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.not(notTraversal);
  }

  @Override
  default <E2> EmployeeTraversal<S, E> option(Traversal<?, E2> traversalOption) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.option(traversalOption);
  }

  @Override
  default <M, E2> EmployeeTraversal<S, E> option(M token, Traversal<?, E2> traversalOption) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.option(token,traversalOption);
  }

  @Override
  default <M, E2> EmployeeTraversal<S, E> option(M token, Map<Object, Object> m) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.option(token,m);
  }

  @Override
  default <E2> EmployeeTraversal<S, E2> optional(Traversal<?, E2> optionalTraversal) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.optional(optionalTraversal);
  }

  @Override
  default EmployeeTraversal<S, E> or(Traversal<?, ?>... orTraversals) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.or(orTraversals);
  }

  @Override
  default EmployeeTraversal<S, E> order() {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.order();
  }

  @Override
  default EmployeeTraversal<S, E> order(Scope scope) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.order(scope);
  }

  @Override
  default EmployeeTraversal<S, Vertex> otherV() {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.otherV();
  }

  @Override
  default EmployeeTraversal<S, Vertex> out(String... edgeLabels) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.out(edgeLabels);
  }

  @Override
  default EmployeeTraversal<S, Edge> outE(String... edgeLabels) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.outE(edgeLabels);
  }

  @Override
  default EmployeeTraversal<S, Vertex> outV() {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.outV();
  }

  @Override
  default EmployeeTraversal<S, E> pageRank() {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.pageRank();
  }

  @Override
  default EmployeeTraversal<S, E> pageRank(double alpha) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.pageRank(alpha);
  }

  @Override
  default EmployeeTraversal<S, Path> path() {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.path();
  }

  @Override
  default EmployeeTraversal<S, E> peerPressure() {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.peerPressure();
  }

  @Override
  default EmployeeTraversal<S, TraversalMetrics> profile() {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.profile();
  }

  @Override
  default EmployeeTraversal<S, E> profile(String sideEffectKey) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.profile(sideEffectKey);
  }

  @Override
  default EmployeeTraversal<S, E> program(VertexProgram<?> vertexProgram) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.program(vertexProgram);
  }

  @Override
  default <E2> EmployeeTraversal<S, Map<String, E2>> project(String projectKey,
      String... otherProjectKeys) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.project(projectKey,otherProjectKeys);
  }

  @Override
  default <E2> EmployeeTraversal<S, ? extends Property<E2>> properties(String... propertyKeys) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.properties(propertyKeys);
  }

  @Override
  default EmployeeTraversal<S, E> property(Map<Object, Object> value) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.property(value);
  }

  @Override
  default EmployeeTraversal<S, E> property(Object key, Object value, Object... keyValues) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.property(key,value,keyValues);
  }

  @Override
  default EmployeeTraversal<S, E> property(VertexProperty.Cardinality cardinality, Object key,
      Object value, Object... keyValues) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.property(cardinality,key,value,keyValues);
  }

  @Override
  default <E2> EmployeeTraversal<S, Map<String, E2>> propertyMap(String... propertyKeys) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.propertyMap(propertyKeys);
  }

  @Override
  default EmployeeTraversal<S, E> range(long low, long high) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.range(low,high);
  }

  @Override
  default <E2> EmployeeTraversal<S, E2> range(Scope scope, long low, long high) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.range(scope,low,high);
  }

  @Override
  default EmployeeTraversal<S, E> read() {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.read();
  }

  @Override
  default EmployeeTraversal<S, E> repeat(Traversal<?, E> repeatTraversal) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.repeat(repeatTraversal);
  }

  @Override
  default EmployeeTraversal<S, E> repeat(String loopName, Traversal<?, E> repeatTraversal) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.repeat(loopName,repeatTraversal);
  }

  @Override
  default <E2> EmployeeTraversal<S, E2> sack() {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.sack();
  }

  @Override
  default <V, U> EmployeeTraversal<S, E> sack(BiFunction<V, U, V> sackOperator) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.sack(sackOperator);
  }

  @Override
  default EmployeeTraversal<S, E> sample(int amountToSample) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.sample(amountToSample);
  }

  @Override
  default EmployeeTraversal<S, E> sample(Scope scope, int amountToSample) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.sample(scope,amountToSample);
  }

  @Override
  default <E2> EmployeeTraversal<S, E2> select(String selectKey) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.select(selectKey);
  }

  @Override
  default <E2> EmployeeTraversal<S, E2> select(Traversal<S, E2> keyTraversal) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.select(keyTraversal);
  }

  @Override
  default <E2> EmployeeTraversal<S, Collection<E2>> select(Column column) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.select(column);
  }

  @Override
  default <E2> EmployeeTraversal<S, E2> select(Pop pop, String selectKey) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.select(pop,selectKey);
  }

  @Override
  default <E2> EmployeeTraversal<S, E2> select(Pop pop, Traversal<S, E2> keyTraversal) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.select(pop,keyTraversal);
  }

  @Override
  default <E2> EmployeeTraversal<S, Map<String, E2>> select(String selectKey1, String selectKey2,
      String... otherSelectKeys) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.select(selectKey1,selectKey2,otherSelectKeys);
  }

  @Override
  default <E2> EmployeeTraversal<S, Map<String, E2>> select(Pop pop, String selectKey1,
      String selectKey2, String... otherSelectKeys) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.select(pop,selectKey1,selectKey2,otherSelectKeys);
  }

  @Override
  default EmployeeTraversal<S, Path> shortestPath() {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.shortestPath();
  }

  @Override
  default EmployeeTraversal<S, E> sideEffect(Consumer<Traverser<E>> consumer) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.sideEffect(consumer);
  }

  @Override
  default EmployeeTraversal<S, E> sideEffect(Traversal<?, ?> sideEffectTraversal) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.sideEffect(sideEffectTraversal);
  }

  @Override
  default EmployeeTraversal<S, E> simplePath() {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.simplePath();
  }

  @Override
  default EmployeeTraversal<S, E> skip(long skip) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.skip(skip);
  }

  @Override
  default <E2> EmployeeTraversal<S, E2> skip(Scope scope, long skip) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.skip(scope,skip);
  }

  @Override
  default EmployeeTraversal<S, E> store(String sideEffectKey) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.store(sideEffectKey);
  }

  @Override
  default EmployeeTraversal<S, Edge> subgraph(String sideEffectKey) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.subgraph(sideEffectKey);
  }

  @Override
  default <E2 extends Number> EmployeeTraversal<S, E2> sum() {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.sum();
  }

  @Override
  default <E2 extends Number> EmployeeTraversal<S, E2> sum(Scope scope) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.sum(scope);
  }

  @Override
  default EmployeeTraversal<S, E> tail() {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.tail();
  }

  @Override
  default EmployeeTraversal<S, E> tail(long limit) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.tail(limit);
  }

  @Override
  default <E2> EmployeeTraversal<S, E2> tail(Scope scope) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.tail(scope);
  }

  @Override
  default <E2> EmployeeTraversal<S, E2> tail(Scope scope, long limit) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.tail(scope,limit);
  }

  @Override
  default EmployeeTraversal<S, E> timeLimit(long timeLimit) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.timeLimit(timeLimit);
  }

  @Override
  default EmployeeTraversal<S, E> times(int maxLoops) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.times(maxLoops);
  }

  @Override
  default EmployeeTraversal<S, E> to(String toStepLabel) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.to(toStepLabel);
  }

  @Override
  default EmployeeTraversal<S, E> to(Traversal<?, Vertex> toVertex) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.to(toVertex);
  }

  @Override
  default EmployeeTraversal<S, E> to(Vertex toVertex) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.to(toVertex);
  }

  @Override
  default EmployeeTraversal<S, Vertex> to(Direction direction, String... edgeLabels) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.to(direction,edgeLabels);
  }

  @Override
  default EmployeeTraversal<S, Edge> toE(Direction direction, String... edgeLabels) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.toE(direction,edgeLabels);
  }

  @Override
  default EmployeeTraversal<S, Vertex> toV(Direction direction) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.toV(direction);
  }

  @Override
  default EmployeeTraversal<S, Tree> tree() {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.tree();
  }

  @Override
  default EmployeeTraversal<S, E> tree(String sideEffectKey) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.tree(sideEffectKey);
  }

  @Override
  default <E2> EmployeeTraversal<S, E2> unfold() {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.unfold();
  }

  @Override
  default <E2> EmployeeTraversal<S, E2> union(Traversal<?, E2>... unionTraversals) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.union(unionTraversals);
  }

  @Override
  default EmployeeTraversal<S, E> until(Traversal<?, ?> untilTraversal) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.until(untilTraversal);
  }

  @Override
  default EmployeeTraversal<S, E> until(Predicate<Traverser<E>> untilPredicate) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.until(untilPredicate);
  }

  @Override
  default <E2> EmployeeTraversal<S, E2> value() {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.value();
  }

  @Override
  default <E2> EmployeeTraversal<S, Map<Object, E2>> valueMap(String... propertyKeys) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.valueMap(propertyKeys);
  }

  @Override
  default <E2> EmployeeTraversal<S, Map<Object, E2>> valueMap(boolean includeTokens,
      String... propertyKeys) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.valueMap(includeTokens,propertyKeys);
  }

  @Override
  default <E2> EmployeeTraversal<S, E2> values(String... propertyKeys) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.values(propertyKeys);
  }

  @Override
  default EmployeeTraversal<S, E> where(P<String> predicate) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.where(predicate);
  }

  @Override
  default EmployeeTraversal<S, E> where(Traversal<?, ?> whereTraversal) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.where(whereTraversal);
  }

  @Override
  default EmployeeTraversal<S, E> where(String startKey, P<String> predicate) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.where(startKey,predicate);
  }

  @Override
  default EmployeeTraversal<S, E> with(String key) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.with(key);
  }

  @Override
  default EmployeeTraversal<S, E> with(String key, Object value) {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.with(key,value);
  }

  @Override
  default EmployeeTraversal<S, E> write() {
    return (EmployeeTraversal) EmployeeTraversalDsl.super.write();
  }

  @Override
  default EmployeeTraversal<S, E> iterate() {
    EmployeeTraversalDsl.super.iterate();
    return this;
  }
}
