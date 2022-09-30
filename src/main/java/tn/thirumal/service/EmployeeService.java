/**
 * 
 */
package tn.thirumal.service;

import java.util.Map;

import org.apache.tinkerpop.gremlin.structure.T;
import org.apache.tinkerpop.gremlin.structure.Transaction;
import org.apache.tinkerpop.gremlin.structure.util.TransactionException;
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
	
	public boolean transactionExample() {
		System.out.println("Begin Transaction");
		Transaction tx = g.tx();
		String id = "123321";
		EmployeeTraversalSource gtx = tx.begin(EmployeeTraversalSource.class);
		try {
		    gtx.addV("T").property(T.id, id).next();
		    System.out.println("Searching before commit ==> " + gtx.V().hasId(id).elementMap().next());
		    if (2/0 == 0) {
		    	throw new TransactionException("throwing exception");
		    }
		    tx.commit();
		    System.out.println("Committed Transaction");
		} catch (Exception ex) {
			System.out.println("Catching exception " + ex);
			System.out.println(gtx);
		    tx.rollback();
		    System.out.println("Rollbacked Transaction");
		   
		}
		System.out.println(gtx.tx().isOpen());
		
		return true;
	}

}
