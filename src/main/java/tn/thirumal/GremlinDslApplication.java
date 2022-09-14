package tn.thirumal;

import org.apache.tinkerpop.gremlin.driver.Cluster;
import org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.GraphTraversalSource;
import org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.__;
import org.apache.tinkerpop.gremlin.structure.T;
import org.apache.tinkerpop.gremlin.structure.Vertex;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GremlinDslApplication implements CommandLineRunner {

	Logger logger = LoggerFactory.getLogger(GremlinDslApplication.class);
	
	@Autowired
    Cluster cluster;

    @Autowired
    GraphTraversalSource g;
    	
	public static void main(String[] args) {
		SpringApplication.run(GremlinDslApplication.class, args);
	}
	
	@SuppressWarnings("unchecked")
	@Override
    public void run(String... args) {
		try {
			Long totalVertex = g.V().count().next();
			logger.info("Total number of vertex in the database is {}", totalVertex);
			String employerId = "Galaxy00001"; 
			Vertex employeer = g.V().hasLabel("Employer").hasId(employerId).fold().coalesce(
					__.unfold(), __.addV("Employer").property(T.id, employerId).property("name", "Galaxy Corp")).next();
			System.out.println("Employeer details ->" + employeer);
			
		} catch (Exception e) {
			var errorMessage = ".......Not able to connect to database....";
			System.err.println(errorMessage);
			logger.error(errorMessage);
		}
    }

}
