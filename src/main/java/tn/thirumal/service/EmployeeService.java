/**
 * 
 */
package tn.thirumal.service;

import java.util.Map;

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
	
	
	public Employee appoint() {
		Map<Object, Object> employer = g.employer().getEmployer(EMPLOYER_ID).elementMap().next();
		System.out.println(employer);
		return null;
	}

}
