package com.cognizant.springlearn.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.Employee;
import com.cognizant.springlearn.service.EmployeeService;
import com.cognizant.springlearn.service.exception.EmployeeNotFoundException;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);
	
	public EmployeeController() {
		LOGGER.info("Inside Emplyee Controller Constructor");
	}
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping
	public @ResponseBody List<Employee> getAllEmployees(){
		LOGGER.info("START");
		LOGGER.info("END");
		return employeeService.getAllEmployees();
	}
	
	@PutMapping("/{id}")
	public void updateEmployee(@PathVariable String id, @RequestBody @Valid Employee employee)throws EmployeeNotFoundException{
		LOGGER.info("START");
		LOGGER.info("END");
		employeeService.updateEmployee(id, employee);
	}
	
	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable String id)throws EmployeeNotFoundException{
		LOGGER.info("START");
		LOGGER.info("END");
		employeeService.deleteEmployee(id);
	}

}
