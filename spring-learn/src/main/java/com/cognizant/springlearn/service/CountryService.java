package com.cognizant.springlearn.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.springlearn.Country;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;

@Service
public class CountryService {
	private static final Logger LOGGER = LoggerFactory.getLogger(CountryService.class);
	
	public Country getCountry(String code)throws CountryNotFoundException {
		LOGGER.info("START");
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		List<Country> countryList = context.getBean("countryList", ArrayList.class);
		for(Country country: countryList) {
			if(country.getCode().equalsIgnoreCase(code)) {
				LOGGER.info("END");
				return country;
			}
		}
		throw new CountryNotFoundException("Country not found with the given Id");
	}

}
