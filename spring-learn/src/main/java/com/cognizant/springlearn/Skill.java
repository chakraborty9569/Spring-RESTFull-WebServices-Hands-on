package com.cognizant.springlearn;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Skill {
	private static final Logger LOGGER = LoggerFactory.getLogger(Skill.class);
	
	@NotNull
	@Pattern(regexp="^[0-9]*$")
	private String id;
	@NotNull
	@NotBlank
	@Size(min = 1, max = 30)
	private String name;
	
	public Skill() {
		LOGGER.info("Inside Skill Constructor");
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

	@Override
	public String toString() {
		return "Skill [id=" + id + ", name=" + name + "]";
	}

}
