package com.cognizant.springlearn.service;

import java.util.List;

//import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.springlearn.Department;
import com.cognizant.springlearn.dao.DepartmentDAO;

@Service
public class DepartmentService {
	
private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentService.class);
	
	public DepartmentService() {
		LOGGER.info("Inside Department Service Constructor");
	}
	
	@Autowired
	DepartmentDAO departmentDAO;
	
	//@Transactional
	public List<Department> getAllDepartments(){
		LOGGER.info("START");
		LOGGER.info("END");
		return departmentDAO.getAllDepartments();
	}

}
