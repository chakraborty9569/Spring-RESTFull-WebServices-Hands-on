package com.cognizant.springlearn.dao;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import com.cognizant.springlearn.Department;

@Repository
public class DepartmentDAO {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentDAO.class);

	private static List<Department> DEPARTMENT_LIST;
	
	public DepartmentDAO() {
		LOGGER.info("Inside DepartmentDAO Constructor");
		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		DEPARTMENT_LIST = context.getBean("departmentList", ArrayList.class);
	}
	
	public List<Department> getAllDepartments(){
		return DEPARTMENT_LIST;
	}

}
