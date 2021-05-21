package com.cognizant.springlearn.service;

import java.util.List;

//import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.cognizant.springlearn.Employee;
import com.cognizant.springlearn.dao.EmployeeDAO;
import com.cognizant.springlearn.service.exception.EmployeeNotFoundException;

@Service
public class EmployeeService {
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeService.class);
	
	public EmployeeService() {
		LOGGER.info("Inside Employee Service Constructor");
	}
	
	@Autowired
	EmployeeDAO employeeDAO;
	
	//@Transactional
	public List<Employee> getAllEmployees(){
		LOGGER.info("START");
		LOGGER.info("END");
		return employeeDAO.getAllEmployees();
	}
	
	public void updateEmployee(String id, Employee employee)throws EmployeeNotFoundException{
		LOGGER.info("START");
		LOGGER.info("END");
		employeeDAO.updateEmployee(id, employee);
	}
	
	public void deleteEmployee(String id)throws EmployeeNotFoundException{
		LOGGER.info("START");
		LOGGER.info("END");
		employeeDAO.deleteEmployee(id);
	}

}
