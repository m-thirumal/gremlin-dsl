/**
 * 
 */
package tn.thirumal.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Thirumal
 *
 */
@Getter@Setter
@NoArgsConstructor@AllArgsConstructor
@Builder@ToString
public class Employee implements Serializable {

	private static final long serialVersionUID = -2495166234538717156L;
	
	private String id;
	private String name;

}
