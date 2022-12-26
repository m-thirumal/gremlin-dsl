package tn.thirumal.dsl;

import java.lang.Comparable;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import org.apache.tinkerpop.gremlin.process.traversal.P;
import org.apache.tinkerpop.gremlin.process.traversal.Path;
import org.apache.tinkerpop.gremlin.process.traversal.Pop;
import org.apache.tinkerpop.gremlin.process.traversal.Scope;
import org.apache.tinkerpop.gremlin.process.traversal.Traversal;
import org.apache.tinkerpop.gremlin.process.traversal.Traverser;
import org.apache.tinkerpop.gremlin.process.traversal.step.util.Tree;
import org.apache.tinkerpop.gremlin.process.traversal.traverser.util.TraverserSet;
import org.apache.tinkerpop.gremlin.structure.Column;
import org.apache.tinkerpop.gremlin.structure.Direction;
import org.apache.tinkerpop.gremlin.structure.Edge;
import org.apache.tinkerpop.gremlin.structure.Element;
import org.apache.tinkerpop.gremlin.structure.Property;
import org.apache.tinkerpop.gremlin.structure.T;
import org.apache.tinkerpop.gremlin.structure.Vertex;
import org.apache.tinkerpop.gremlin.structure.VertexProperty;
import tn.thirumal.model.Employee;

public final class __ {
  private __() {
  }

  public static <A> EmployeeTraversal<A, A> start() {
    return new DefaultEmployeeTraversal<>();
  }

  public static <S> EmployeeTraversal<S, Vertex> getEmployer(String employerId) {
    return __.<S>start().getEmployer(employerId);
  }

  public static <S> EmployeeTraversal<S, Vertex> appoint(Employee employee) {
    return __.<S>start().appoint(employee);
  }

  public static <A> EmployeeTraversal<A, Vertex> V(Object... vertexIdsOrElements) {
    return __.<A>start().V(vertexIdsOrElements);
  }

  public static <A> EmployeeTraversal<A, A> __(A... starts) {
    return inject(starts);
  }

  public static <A> EmployeeTraversal<A, Edge> addE(String edgeLabel) {
    return __.<A>start().addE(edgeLabel);
  }

  public static <A> EmployeeTraversal<A, Edge> addE(Traversal<?, String> edgeLabelTraversal) {
    return __.<A>start().addE(edgeLabelTraversal);
  }

  public static <A> EmployeeTraversal<A, Vertex> addV() {
    return __.<A>start().addV();
  }

  public static <A> EmployeeTraversal<A, Vertex> addV(String vertexLabel) {
    return __.<A>start().addV(vertexLabel);
  }

  public static <A> EmployeeTraversal<A, Vertex> addV(Traversal<?, String> vertexLabelTraversal) {
    return __.<A>start().addV(vertexLabelTraversal);
  }

  public static <A> EmployeeTraversal<A, A> aggregate(String sideEffectKey) {
    return __.<A>start().aggregate(sideEffectKey);
  }

  public static <A> EmployeeTraversal<A, A> aggregate(Scope scope, String sideEffectKey) {
    return __.<A>start().aggregate(scope,sideEffectKey);
  }

  public static <A> EmployeeTraversal<A, A> and(Traversal<?, ?>... andTraversals) {
    return __.<A>start().and(andTraversals);
  }

  public static <A> EmployeeTraversal<A, A> as(String label, String... labels) {
    return __.<A>start().as(label,labels);
  }

  public static <A> EmployeeTraversal<A, A> barrier() {
    return __.<A>start().barrier();
  }

  public static <A> EmployeeTraversal<A, A> barrier(int maxBarrierSize) {
    return __.<A>start().barrier(maxBarrierSize);
  }

  public static <A> EmployeeTraversal<A, A> barrier(
      Consumer<TraverserSet<Object>> barrierConsumer) {
    return __.<A>start().barrier(barrierConsumer);
  }

  public static EmployeeTraversal<Vertex, Vertex> both(String... edgeLabels) {
    return __.<Vertex>start().both(edgeLabels);
  }

  public static EmployeeTraversal<Vertex, Edge> bothE(String... edgeLabels) {
    return __.<Vertex>start().bothE(edgeLabels);
  }

  public static EmployeeTraversal<Edge, Vertex> bothV() {
    return __.<Edge>start().bothV();
  }

  public static <A, M, B> EmployeeTraversal<A, B> branch(Function<Traverser<A>, M> function) {
    return __.<A>start().branch(function);
  }

  public static <A, M, B> EmployeeTraversal<A, B> branch(Traversal<?, M> traversalFunction) {
    return __.<A>start().branch(traversalFunction);
  }

  public static <A, B> EmployeeTraversal<A, B> call(String service) {
    return __.<A>start().call(service);
  }

  public static <A, B> EmployeeTraversal<A, B> call(String service, Map params) {
    return __.<A>start().call(service,params);
  }

  public static <A, B> EmployeeTraversal<A, B> call(String service,
      Traversal<?, Map<?, ?>> childTraversal) {
    return __.<A>start().call(service,childTraversal);
  }

  public static <A, B> EmployeeTraversal<A, B> call(String service, Map params,
      Traversal<?, Map<?, ?>> childTraversal) {
    return __.<A>start().call(service,params,childTraversal);
  }

  public static <A, B> EmployeeTraversal<A, B> cap(String sideEffectKey, String... sideEffectKeys) {
    return __.<A>start().cap(sideEffectKey,sideEffectKeys);
  }

  public static <A, M, B> EmployeeTraversal<A, B> choose(Function<A, M> choiceFunction) {
    return __.<A>start().choose(choiceFunction);
  }

  public static <A, M, B> EmployeeTraversal<A, B> choose(Traversal<?, M> traversalFunction) {
    return __.<A>start().choose(traversalFunction);
  }

  public static <A, B> EmployeeTraversal<A, B> choose(Predicate<A> choosePredicate,
      Traversal<?, B> trueChoice) {
    return __.<A>start().choose(choosePredicate,trueChoice);
  }

  public static <A, M, B> EmployeeTraversal<A, B> choose(Traversal<?, M> traversalPredicate,
      Traversal<?, B> trueChoice) {
    return __.<A>start().choose(traversalPredicate,trueChoice);
  }

  public static <A, B> EmployeeTraversal<A, B> choose(Predicate<A> choosePredicate,
      Traversal<?, B> trueChoice, Traversal<?, B> falseChoice) {
    return __.<A>start().choose(choosePredicate,trueChoice,falseChoice);
  }

  public static <A, M, B> EmployeeTraversal<A, B> choose(Traversal<?, M> traversalPredicate,
      Traversal<?, B> trueChoice, Traversal<?, B> falseChoice) {
    return __.<A>start().choose(traversalPredicate,trueChoice,falseChoice);
  }

  public static <A, B> EmployeeTraversal<A, B> coalesce(Traversal<?, B>... traversals) {
    return __.<A>start().coalesce(traversals);
  }

  public static <A> EmployeeTraversal<A, A> coin(double probability) {
    return __.<A>start().coin(probability);
  }

  public static <A> EmployeeTraversal<A, A> constant(A a) {
    return __.<A>start().constant(a);
  }

  public static <A> EmployeeTraversal<A, Long> count() {
    return __.<A>start().count();
  }

  public static <A> EmployeeTraversal<A, Long> count(Scope scope) {
    return __.<A>start().count(scope);
  }

  public static <A> EmployeeTraversal<A, A> cyclicPath() {
    return __.<A>start().cyclicPath();
  }

  public static <A> EmployeeTraversal<A, A> dedup(String... dedupLabels) {
    return __.<A>start().dedup(dedupLabels);
  }

  public static <A> EmployeeTraversal<A, A> dedup(Scope scope, String... dedupLabels) {
    return __.<A>start().dedup(scope,dedupLabels);
  }

  public static <A> EmployeeTraversal<A, A> drop() {
    return __.<A>start().drop();
  }

  public static <A, B> EmployeeTraversal<A, Element> element() {
    return __.<A>start().element();
  }

  public static <A extends Element, B> EmployeeTraversal<A, Map<Object, B>> elementMap(
      String... propertyKeys) {
    return __.<A>start().elementMap(propertyKeys);
  }

  public static <A> EmployeeTraversal<A, A> emit() {
    return __.<A>start().emit();
  }

  public static <A> EmployeeTraversal<A, A> emit(Traversal<?, ?> emitTraversal) {
    return __.<A>start().emit(emitTraversal);
  }

  public static <A> EmployeeTraversal<A, A> emit(Predicate<Traverser<A>> emitPredicate) {
    return __.<A>start().emit(emitPredicate);
  }

  public static <A> EmployeeTraversal<A, A> fail() {
    return __.<A>start().fail();
  }

  public static <A> EmployeeTraversal<A, A> fail(String message) {
    return __.<A>start().fail(message);
  }

  public static <A> EmployeeTraversal<A, A> filter(Predicate<Traverser<A>> predicate) {
    return __.<A>start().filter(predicate);
  }

  public static <A> EmployeeTraversal<A, A> filter(Traversal<?, ?> filterTraversal) {
    return __.<A>start().filter(filterTraversal);
  }

  public static <A, B> EmployeeTraversal<A, B> flatMap(
      Function<Traverser<A>, Iterator<B>> function) {
    return __.<A>start().flatMap(function);
  }

  public static <A, B> EmployeeTraversal<A, B> flatMap(Traversal<?, B> flatMapTraversal) {
    return __.<A>start().flatMap(flatMapTraversal);
  }

  public static <A> EmployeeTraversal<A, List<A>> fold() {
    return __.<A>start().fold();
  }

  public static <A, B> EmployeeTraversal<A, B> fold(B seed, BiFunction<B, A, B> foldFunction) {
    return __.<A>start().fold(seed,foldFunction);
  }

  public static <A, K, V> EmployeeTraversal<A, Map<K, V>> group() {
    return __.<A>start().group();
  }

  public static <A> EmployeeTraversal<A, A> group(String sideEffectKey) {
    return __.<A>start().group(sideEffectKey);
  }

  public static <A, K> EmployeeTraversal<A, Map<K, Long>> groupCount() {
    return __.<A>start().groupCount();
  }

  public static <A> EmployeeTraversal<A, A> groupCount(String sideEffectKey) {
    return __.<A>start().groupCount(sideEffectKey);
  }

  public static <A> EmployeeTraversal<A, A> has(String propertyKey) {
    return __.<A>start().has(propertyKey);
  }

  public static <A> EmployeeTraversal<A, A> has(String propertyKey, P<?> predicate) {
    return __.<A>start().has(propertyKey,predicate);
  }

  public static <A> EmployeeTraversal<A, A> has(T accessor, P<?> predicate) {
    return __.<A>start().has(accessor,predicate);
  }

  public static <A> EmployeeTraversal<A, A> has(String propertyKey, Object value) {
    return __.<A>start().has(propertyKey,value);
  }

  public static <A> EmployeeTraversal<A, A> has(T accessor, Object value) {
    return __.<A>start().has(accessor,value);
  }

  public static <A> EmployeeTraversal<A, A> has(T accessor, Traversal<?, ?> propertyTraversal) {
    return __.<A>start().has(accessor,propertyTraversal);
  }

  public static <A> EmployeeTraversal<A, A> has(String propertyKey,
      Traversal<?, ?> propertyTraversal) {
    return __.<A>start().has(propertyKey,propertyTraversal);
  }

  public static <A> EmployeeTraversal<A, A> has(String label, String propertyKey, Object value) {
    return __.<A>start().has(label,propertyKey,value);
  }

  public static <A> EmployeeTraversal<A, A> has(String label, String propertyKey, P<?> predicate) {
    return __.<A>start().has(label,propertyKey,predicate);
  }

  public static <A> EmployeeTraversal<A, A> hasId(P<Object> predicate) {
    return __.<A>start().hasId(predicate);
  }

  public static <A> EmployeeTraversal<A, A> hasId(Object id, Object... otherIds) {
    return __.<A>start().hasId(id,otherIds);
  }

  public static <A> EmployeeTraversal<A, A> hasKey(P<String> predicate) {
    return __.<A>start().hasKey(predicate);
  }

  public static <A> EmployeeTraversal<A, A> hasKey(String label, String... otherLabels) {
    return __.<A>start().hasKey(label,otherLabels);
  }

  public static <A> EmployeeTraversal<A, A> hasLabel(P<String> predicate) {
    return __.<A>start().hasLabel(predicate);
  }

  public static <A> EmployeeTraversal<A, A> hasLabel(String label, String... otherLabels) {
    return __.<A>start().hasLabel(label,otherLabels);
  }

  public static <A> EmployeeTraversal<A, A> hasNot(String propertyKey) {
    return __.<A>start().hasNot(propertyKey);
  }

  public static <A> EmployeeTraversal<A, A> hasValue(P<Object> predicate) {
    return __.<A>start().hasValue(predicate);
  }

  public static <A> EmployeeTraversal<A, A> hasValue(Object value, Object... values) {
    return __.<A>start().hasValue(value,values);
  }

  public static <A extends Element> EmployeeTraversal<A, Object> id() {
    return __.<A>start().id();
  }

  public static <A> EmployeeTraversal<A, A> identity() {
    return __.<A>start().identity();
  }

  public static EmployeeTraversal<Vertex, Vertex> in(String... edgeLabels) {
    return __.<Vertex>start().in(edgeLabels);
  }

  public static EmployeeTraversal<Vertex, Edge> inE(String... edgeLabels) {
    return __.<Vertex>start().inE(edgeLabels);
  }

  public static EmployeeTraversal<Edge, Vertex> inV() {
    return __.<Edge>start().inV();
  }

  public static <A, B> EmployeeTraversal<A, B> index() {
    return __.<A>start().index();
  }

  public static <A> EmployeeTraversal<A, A> inject(A... injections) {
    return __.<A>start().inject(injections);
  }

  public static <A> EmployeeTraversal<A, A> is(P<A> predicate) {
    return __.<A>start().is(predicate);
  }

  public static <A> EmployeeTraversal<A, A> is(Object value) {
    return __.<A>start().is(value);
  }

  public static <A extends Property> EmployeeTraversal<A, String> key() {
    return __.<A>start().key();
  }

  public static <A extends Element> EmployeeTraversal<A, String> label() {
    return __.<A>start().label();
  }

  public static <A> EmployeeTraversal<A, A> limit(long limit) {
    return __.<A>start().limit(limit);
  }

  public static <A> EmployeeTraversal<A, A> limit(Scope scope, long limit) {
    return __.<A>start().limit(scope,limit);
  }

  public static <A, B> EmployeeTraversal<A, B> local(Traversal<?, B> localTraversal) {
    return __.<A>start().local(localTraversal);
  }

  public static <A> EmployeeTraversal<A, Integer> loops() {
    return __.<A>start().loops();
  }

  public static <A> EmployeeTraversal<A, Integer> loops(String loopName) {
    return __.<A>start().loops(loopName);
  }

  public static <A, B> EmployeeTraversal<A, B> map(Function<Traverser<A>, B> function) {
    return __.<A>start().map(function);
  }

  public static <A, B> EmployeeTraversal<A, B> map(Traversal<?, B> mapTraversal) {
    return __.<A>start().map(mapTraversal);
  }

  public static <A, B> EmployeeTraversal<A, Map<String, B>> match(
      Traversal<?, ?>... matchTraversals) {
    return __.<A>start().match(matchTraversals);
  }

  public static <A> EmployeeTraversal<A, Double> math(String expression) {
    return __.<A>start().math(expression);
  }

  public static <A, B extends Comparable> EmployeeTraversal<A, B> max() {
    return __.<A>start().max();
  }

  public static <A, B extends Comparable> EmployeeTraversal<A, B> max(Scope scope) {
    return __.<A>start().max(scope);
  }

  public static <A> EmployeeTraversal<A, Double> mean() {
    return __.<A>start().mean();
  }

  public static <A> EmployeeTraversal<A, Double> mean(Scope scope) {
    return __.<A>start().mean(scope);
  }

  public static <A> EmployeeTraversal<A, Edge> mergeE() {
    return __.<A>start().mergeE();
  }

  public static <A> EmployeeTraversal<A, Edge> mergeE(Map<Object, Object> searchCreate) {
    return __.<A>start().mergeE(searchCreate);
  }

  public static <A> EmployeeTraversal<A, Edge> mergeE(
      Traversal<?, Map<Object, Object>> searchCreate) {
    return __.<A>start().mergeE(searchCreate);
  }

  public static <A> EmployeeTraversal<A, Vertex> mergeV() {
    return __.<A>start().mergeV();
  }

  public static <A> EmployeeTraversal<A, Vertex> mergeV(Map<Object, Object> searchCreate) {
    return __.<A>start().mergeV(searchCreate);
  }

  public static <A> EmployeeTraversal<A, Vertex> mergeV(
      Traversal<?, Map<Object, Object>> searchCreate) {
    return __.<A>start().mergeV(searchCreate);
  }

  public static <A, B extends Comparable> EmployeeTraversal<A, B> min() {
    return __.<A>start().min();
  }

  public static <A, B extends Comparable> EmployeeTraversal<A, B> min(Scope scope) {
    return __.<A>start().min(scope);
  }

  public static <A> EmployeeTraversal<A, A> not(Traversal<?, ?> notTraversal) {
    return __.<A>start().not(notTraversal);
  }

  public static <A> EmployeeTraversal<A, A> optional(Traversal<?, A> optionalTraversal) {
    return __.<A>start().optional(optionalTraversal);
  }

  public static <A> EmployeeTraversal<A, A> or(Traversal<?, ?>... orTraversals) {
    return __.<A>start().or(orTraversals);
  }

  public static <A> EmployeeTraversal<A, A> order() {
    return __.<A>start().order();
  }

  public static <A> EmployeeTraversal<A, A> order(Scope scope) {
    return __.<A>start().order(scope);
  }

  public static EmployeeTraversal<Edge, Vertex> otherV() {
    return __.<Edge>start().otherV();
  }

  public static EmployeeTraversal<Vertex, Vertex> out(String... edgeLabels) {
    return __.<Vertex>start().out(edgeLabels);
  }

  public static EmployeeTraversal<Vertex, Edge> outE(String... edgeLabels) {
    return __.<Vertex>start().outE(edgeLabels);
  }

  public static EmployeeTraversal<Edge, Vertex> outV() {
    return __.<Edge>start().outV();
  }

  public static <A> EmployeeTraversal<A, Path> path() {
    return __.<A>start().path();
  }

  public static <A, B> EmployeeTraversal<A, Map<String, B>> project(String projectKey,
      String... projectKeys) {
    return __.<A>start().project(projectKey,projectKeys);
  }

  public static <A extends Element, B> EmployeeTraversal<A, ? extends Property<B>> properties(
      String... propertyKeys) {
    return __.<A>start().properties(propertyKeys);
  }

  public static <A> EmployeeTraversal<A, A> property(Map<Object, Object> value) {
    return __.<A>start().property(value);
  }

  public static <A> EmployeeTraversal<A, A> property(Object key, Object value,
      Object... keyValues) {
    return __.<A>start().property(key,value,keyValues);
  }

  public static <A> EmployeeTraversal<A, A> property(VertexProperty.Cardinality cardinality,
      Object key, Object value, Object... keyValues) {
    return __.<A>start().property(cardinality,key,value,keyValues);
  }

  public static <A extends Element, B> EmployeeTraversal<A, Map<String, B>> propertyMap(
      String... propertyKeys) {
    return __.<A>start().propertyMap(propertyKeys);
  }

  public static <A> EmployeeTraversal<A, A> range(long low, long high) {
    return __.<A>start().range(low,high);
  }

  public static <A> EmployeeTraversal<A, A> range(Scope scope, long low, long high) {
    return __.<A>start().range(scope,low,high);
  }

  public static <A> EmployeeTraversal<A, A> repeat(Traversal<?, A> traversal) {
    return __.<A>start().repeat(traversal);
  }

  public static <A> EmployeeTraversal<A, A> repeat(String loopName, Traversal<?, A> traversal) {
    return __.<A>start().repeat(loopName,traversal);
  }

  public static <A, B> EmployeeTraversal<A, B> sack() {
    return __.<A>start().sack();
  }

  public static <A, V, U> EmployeeTraversal<A, A> sack(BiFunction<V, U, V> sackOperator) {
    return __.<A>start().sack(sackOperator);
  }

  public static <A> EmployeeTraversal<A, A> sample(int amountToSample) {
    return __.<A>start().sample(amountToSample);
  }

  public static <A> EmployeeTraversal<A, A> sample(Scope scope, int amountToSample) {
    return __.<A>start().sample(scope,amountToSample);
  }

  public static <A, B> EmployeeTraversal<A, Collection<B>> select(Column column) {
    return __.<A>start().select(column);
  }

  public static <A, B> EmployeeTraversal<A, B> select(String selectKey) {
    return __.<A>start().select(selectKey);
  }

  public static <A, B> EmployeeTraversal<A, B> select(Traversal<A, B> keyTraversal) {
    return __.<A>start().select(keyTraversal);
  }

  public static <A, B> EmployeeTraversal<A, B> select(Pop pop, String selectKey) {
    return __.<A>start().select(pop,selectKey);
  }

  public static <A, B> EmployeeTraversal<A, B> select(Pop pop, Traversal<A, B> keyTraversal) {
    return __.<A>start().select(pop,keyTraversal);
  }

  public static <A, B> EmployeeTraversal<A, Map<String, B>> select(String selectKey1,
      String selectKey2, String... otherSelectKeys) {
    return __.<A>start().select(selectKey1,selectKey2,otherSelectKeys);
  }

  public static <A, B> EmployeeTraversal<A, Map<String, B>> select(Pop pop, String selectKey1,
      String selectKey2, String... otherSelectKeys) {
    return __.<A>start().select(pop,selectKey1,selectKey2,otherSelectKeys);
  }

  public static <A> EmployeeTraversal<A, A> sideEffect(Consumer<Traverser<A>> consumer) {
    return __.<A>start().sideEffect(consumer);
  }

  public static <A> EmployeeTraversal<A, A> sideEffect(Traversal<?, ?> sideEffectTraversal) {
    return __.<A>start().sideEffect(sideEffectTraversal);
  }

  public static <A> EmployeeTraversal<A, A> simplePath() {
    return __.<A>start().simplePath();
  }

  public static <A> EmployeeTraversal<A, A> skip(long skip) {
    return __.<A>start().skip(skip);
  }

  public static <A> EmployeeTraversal<A, A> skip(Scope scope, long skip) {
    return __.<A>start().skip(scope,skip);
  }

  public static <A> EmployeeTraversal<A, A> store(String sideEffectKey) {
    return __.<A>start().store(sideEffectKey);
  }

  public static <A> EmployeeTraversal<A, Edge> subgraph(String sideEffectKey) {
    return __.<A>start().subgraph(sideEffectKey);
  }

  public static <A> EmployeeTraversal<A, Double> sum() {
    return __.<A>start().sum();
  }

  public static <A> EmployeeTraversal<A, Double> sum(Scope scope) {
    return __.<A>start().sum(scope);
  }

  public static <A> EmployeeTraversal<A, A> tail() {
    return __.<A>start().tail();
  }

  public static <A> EmployeeTraversal<A, A> tail(long limit) {
    return __.<A>start().tail(limit);
  }

  public static <A> EmployeeTraversal<A, A> tail(Scope scope) {
    return __.<A>start().tail(scope);
  }

  public static <A> EmployeeTraversal<A, A> tail(Scope scope, long limit) {
    return __.<A>start().tail(scope,limit);
  }

  public static <A> EmployeeTraversal<A, A> timeLimit(long timeLimit) {
    return __.<A>start().timeLimit(timeLimit);
  }

  public static <A> EmployeeTraversal<A, A> times(int maxLoops) {
    return __.<A>start().times(maxLoops);
  }

  public static EmployeeTraversal<Vertex, Vertex> to(Direction direction, String... edgeLabels) {
    return __.<Vertex>start().to(direction,edgeLabels);
  }

  public static EmployeeTraversal<Vertex, Edge> toE(Direction direction, String... edgeLabels) {
    return __.<Vertex>start().toE(direction,edgeLabels);
  }

  public static EmployeeTraversal<Edge, Vertex> toV(Direction direction) {
    return __.<Edge>start().toV(direction);
  }

  public static <A> EmployeeTraversal<A, Tree> tree() {
    return __.<A>start().tree();
  }

  public static <A> EmployeeTraversal<A, A> tree(String sideEffectKey) {
    return __.<A>start().tree(sideEffectKey);
  }

  public static <A> EmployeeTraversal<A, A> unfold() {
    return __.<A>start().unfold();
  }

  public static <A, B> EmployeeTraversal<A, B> union(Traversal<?, B>... traversals) {
    return __.<A>start().union(traversals);
  }

  public static <A> EmployeeTraversal<A, A> until(Traversal<?, ?> untilTraversal) {
    return __.<A>start().until(untilTraversal);
  }

  public static <A> EmployeeTraversal<A, A> until(Predicate<Traverser<A>> untilPredicate) {
    return __.<A>start().until(untilPredicate);
  }

  public static <A extends Property, B> EmployeeTraversal<A, B> value() {
    return __.<A>start().value();
  }

  public static <A extends Element, B> EmployeeTraversal<A, Map<Object, B>> valueMap(
      String... propertyKeys) {
    return __.<A>start().valueMap(propertyKeys);
  }

  public static <A extends Element, B> EmployeeTraversal<A, Map<Object, B>> valueMap(
      boolean includeTokens, String... propertyKeys) {
    return __.<A>start().valueMap(includeTokens,propertyKeys);
  }

  public static <A extends Element, B> EmployeeTraversal<A, B> values(String... propertyKeys) {
    return __.<A>start().values(propertyKeys);
  }

  public static <A> EmployeeTraversal<A, A> where(P<String> predicate) {
    return __.<A>start().where(predicate);
  }

  public static <A> EmployeeTraversal<A, A> where(Traversal<?, ?> whereTraversal) {
    return __.<A>start().where(whereTraversal);
  }

  public static <A> EmployeeTraversal<A, A> where(String startKey, P<String> predicate) {
    return __.<A>start().where(startKey,predicate);
  }
}
