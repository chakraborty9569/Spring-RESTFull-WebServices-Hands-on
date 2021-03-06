package com.cognizant.springlearn;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cognizant.springlearn.controller.CountryController;
import com.cognizant.springlearn.controller.EmployeeController;

@SpringBootTest
@AutoConfigureMockMvc
class SpringLearnApplicationTests {
	
	@Autowired
	CountryController countryCountroller;
	
	@Autowired
	EmployeeController employeeController;
	
	@Autowired
	MockMvc mvc;

	@Test
	void contextLoads() {
		assertNotNull(countryCountroller);
	}
	
	@Test
	void testGetCountry() throws Exception{
		ResultActions actions = mvc.perform(get("/countries/in"));
		actions.andExpect(status().isOk());
		actions.andExpect(jsonPath("$.code").exists());
		actions.andExpect(jsonPath("$.code").value("IN"));
		actions.andExpect(jsonPath("$.name").exists());
		actions.andExpect(jsonPath("$.name").value("India"));
	}
	
	@Test
	void testGetCountryException() throws Exception{
		ResultActions actions = mvc.perform(get("/countries/az"));
		actions.andExpect(status().isNotFound());
		actions.andExpect(status().reason("Country Not found"));
	}
	
	@Test
	void testGetEmployeeException() throws Exception{
		ResultActions actions = mvc.perform(put("/employees/6"));
		actions.andExpect(status().isBadRequest());
	}

}
