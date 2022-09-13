/**
 * 
 */
package tn.thirumal.config;

import static org.apache.tinkerpop.gremlin.process.traversal.AnonymousTraversalSource.traversal;

import org.apache.tinkerpop.gremlin.driver.Cluster;
import org.apache.tinkerpop.gremlin.driver.remote.DriverRemoteConnection;
import org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.GraphTraversalSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import tn.thirumal.dsl.EmployeeTraversalSource;

/**
 * @author Thirumal
 *
 */
@Configuration
public class DatabaseConfig {

	@Value("${database.url}")
	String dbUrl;
	
	@Value("${database.port}")
	int dbPort;
	
	@Bean
    public Cluster cluster() {
        return Cluster.build()
                .addContactPoint(dbUrl)
                .port(dbPort)
                .enableSsl(true)
               // .keyCertChainFile("./cert/SFSRootCAG2.pem") // download it from https://www.amazontrust.com/repository/SFSRootCAG2.pem and place it at /tinkerpop-neptune-example/cert/SFSRootCAG2.pem
                .maxConnectionPoolSize(5)
                .maxInProcessPerConnection(1)
                .maxSimultaneousUsagePerConnection(10)
                .create();
    }

    @Bean
    public GraphTraversalSource g(Cluster cluster) {
        return traversal().withRemote(DriverRemoteConnection.using(cluster));
    }

    @Bean
    public EmployeeTraversalSource auction(Cluster cluster) {
        return traversal(EmployeeTraversalSource.class).withRemote(DriverRemoteConnection.using(cluster));
    }
    
}
