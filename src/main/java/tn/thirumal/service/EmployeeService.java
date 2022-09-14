/**
 * 
 */
package tn.thirumal.service;

import java.util.Map;

import org.apache.tinkerpop.gremlin.structure.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.thirumal.dsl.EmployeeTraversalSource;
import tn.thirumal.model.Employee;

/**
 * @author Thirumal
 *
 */
@Service
public class EmployeeService {

	static final String EMPLOYER_ID = "Galaxy00001";
	
	@Autowired
	EmployeeTraversalSource g;
	
	
	public Map<Object, Object> appoint(String name) {
		Map<Object, Object> employer = g.employer().getEmployer(EMPLOYER_ID).elementMap().next();
		System.out.println("Appointing " + name + " in " + employer + " Company");
		return g.employer(employer.get(T.id).toString()).appoint(Employee.builder().name(name).build()).elementMap().next();
	}

}
