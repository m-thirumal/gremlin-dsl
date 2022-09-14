/**
 * 
 */
package tn.thirumal.controller;

import java.util.Map;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import tn.thirumal.service.EmployeeService;

/**
 * @author Thirumal
 *
 */
@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService; 
	
	@GetMapping(value = {"appoint", "appoint/{name}"}) //Make it POST for real project
	public Map<Object, Object> appoint(@PathVariable(value = "name", required = false) String name) {
		if (Objects.isNull(name)) {
			name = "Thirumal";
		}
		return employeeService.appoint(name);
	}

}
