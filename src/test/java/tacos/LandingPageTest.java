package tacos;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

//@RunWith(TacoCloudApplication.class)
@WebMvcTest(LandingPageTest.class)
public class LandingPageTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void testHomePage() throws Exception {
	mockMvc.perform(get("/"))
	.andExpect(status().isOk())
	.andExpect(view().name("home"))
	.andExpect(content().string(
	containsString("Welcome to...")));
	}

}
