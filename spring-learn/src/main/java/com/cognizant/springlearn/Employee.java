package com.cognizant.springlearn;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Employee {
	private static final Logger LOGGER = LoggerFactory.getLogger(Employee.class);
	
	@NotNull
	@Pattern(regexp="^[0-9]*$")
	private String id;
	@NotNull
	@NotBlank
	@Size(min = 1, max = 30)
	private String name;
	@NotNull
	@Min(value = 0)
	private int salary;
	@NotNull
	private boolean permanent;
	private Department department;
	private List<Skill> skills;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
	private Date dateOfBirth;
	
	public Employee() {
		LOGGER.info("Inside Employee Constructor");
	}

	public String getId() {
		LOGGER.info("Inside Id Getter");
		return id;
	}

	public void setId(String id) {
		LOGGER.info("Inside Id Setter");
		this.id = id;
	}

	public String getName() {
		LOGGER.info("Inside Name Getter");
		return name;
	}

	public void setName(String name) {
		LOGGER.info("Inside Name Setter");
		this.name = name;
	}

	public int getSalary() {
		LOGGER.info("Inside Salary Getter");
		return salary;
	}

	public void setSalary(int salary) {
		LOGGER.info("Inside Salary Setter");
		this.salary = salary;
	}

	public boolean isPermanent() {
		LOGGER.info("Inside Permanent Getter");
		return permanent;
	}

	public void setPermanent(boolean permanent) {
		LOGGER.info("Inside Permanent Setter");
		this.permanent = permanent;
	}

	public Department getDepartment() {
		LOGGER.info("Inside Department Getter");
		return department;
	}

	public void setDepartment(Department department) {
		LOGGER.info("Inside Department Setter");
		this.department = department;
	}
	
	public List<Skill> getSkills() {
		LOGGER.info("Inside Skills Getter");
		return skills;
	}

	public void setSkills(List<Skill> skills) {
		LOGGER.info("Inside Skills Setter");
		this.skills = skills;
	}

	public Date getDateOfBirth() {
		LOGGER.info("Inside DOB Getter");
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		LOGGER.info("Inside DOB Setter");
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", permanent=" + permanent
				+ ", department=" + department + ", skills=" + skills + ", dateOfBirth=" + dateOfBirth + "]";
	}

}
