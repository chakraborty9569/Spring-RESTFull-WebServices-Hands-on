package com.cognizant.springlearn.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.Department;
import com.cognizant.springlearn.service.DepartmentService;

@RestController
public class DepartmentController {
	
private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);
	
	public DepartmentController() {
		LOGGER.info("Inside Department Controller Constructor");
	}
	
	@Autowired
	DepartmentService departmentService;
	
	@GetMapping("/departments")
	public @ResponseBody List<Department> getAllDepartments(){
		LOGGER.info("START");
		LOGGER.info("END");
		return departmentService.getAllDepartments();
	}

}
