package com.example.rest;

import static org.mockito.Mockito.when;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.service.WelcomeService;

@WebMvcTest(value = WelcomeRestController.class)
public class WelcomeRestControllerTest {

	@MockBean
	private WelcomeService welcomeService;
	
	@Autowired
	private MockMvc mockMvc;
	
	public void testWelcomeMsg() {
		
		when(welcomeService.getWelcomeMsg()).thenReturn("GoodMorning..!");
		
		MockHttpServletRequestBuilder reqBuilder = MockMvcRequestBuilders.get("/welcome"); 
	}
	
}
