package com.cognizant.springlearn.dao;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import com.cognizant.springlearn.Employee;
import com.cognizant.springlearn.service.exception.EmployeeNotFoundException;

@Repository
public class EmployeeDAO {
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeDAO.class);

	private static List<Employee> EMPLOYEE_LIST;
	
	public EmployeeDAO() {
		LOGGER.info("Inside EmployeeDAO Constructor");
		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		EMPLOYEE_LIST = context.getBean("employeeList", ArrayList.class);
	}
	
	public List<Employee> getAllEmployees(){
		return EMPLOYEE_LIST;
	}
	
	public void updateEmployee(String id, Employee employee)throws EmployeeNotFoundException{
		for(Employee emp: EMPLOYEE_LIST) {
			if(emp.getId().equals(id)) {
				emp.setId(employee.getId());
				emp.setName(employee.getName());
				emp.setSalary(employee.getSalary());
				emp.setPermanent(employee.isPermanent());
				emp.setDepartment(employee.getDepartment());
				emp.setSkills(employee.getSkills());
				return;
			}
		}
		throw new EmployeeNotFoundException("Employee not found with the given id");
	}
	
	public void deleteEmployee(String id)throws EmployeeNotFoundException{
		for(Employee emp: EMPLOYEE_LIST) {
			if(emp.getId().equals(id)) {
				EMPLOYEE_LIST.remove(emp);
				return;
			}
		}
		throw new EmployeeNotFoundException("Employee not found with the given id");
	}

}
