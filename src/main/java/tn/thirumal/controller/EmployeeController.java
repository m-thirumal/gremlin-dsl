/**
 * 
 */
package tn.thirumal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.thirumal.model.Employee;
import tn.thirumal.service.EmployeeService;

/**
 * @author Thirumal
 *
 */
@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService; 
	
	@PostMapping
	public Employee appoint() {
		return employeeService.appoint();
	}

}
