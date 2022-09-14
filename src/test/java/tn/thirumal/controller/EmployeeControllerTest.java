/**
 * 
 */
package tn.thirumal.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

/**
 * @author Thirumal
 *
 */
@WebMvcTest
public class EmployeeControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void greetingShouldReturnMessageFromService() throws Exception {
		this.mockMvc.perform(get("/appoint")).andDo(print()).andExpect(status().isOk());
	}
}