package tn.thirumal.dsl;

import java.util.Date;
import java.util.UUID;

import org.apache.tinkerpop.gremlin.process.traversal.dsl.GremlinDsl;
import org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.GraphTraversal;
import org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.__;
import org.apache.tinkerpop.gremlin.structure.T;
import org.apache.tinkerpop.gremlin.structure.Vertex;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.constraints.NotBlank;
import tn.thirumal.model.Employee;

/**
 * 
 * @author Thirumal
 *
 * @param <S>
 * @param <E>
 */
@GremlinDsl(traversalSource = "tn.thirumal.dsl.EmployeeTraversalSourceDsl")
public interface EmployeeTraversalDsl<S, E> extends GraphTraversal.Admin<S, E> {

	Logger logger = LoggerFactory.getLogger(EmployeeTraversalDsl.class);
	
	
	@SuppressWarnings("unchecked")
	default GraphTraversal<S, Vertex> getEmployer(@NotBlank String employerId) {
		 return hasId(employerId).fold().coalesce(
					__.unfold(), __.addV("Employer").property(T.id, employerId).property("name", "Galaxy Corp"));
    }
	
	
	@SuppressWarnings("unchecked")
	default  GraphTraversal<S, Vertex> appoint(@NotBlank Employee employee) {
		String id = UUID.randomUUID().toString();
		return as("employer").hasId(id).fold().coalesce(
					__.unfold(), __.addV("employee").property(T.id, id).property("name", employee.getName())
					);
	}
	
}
