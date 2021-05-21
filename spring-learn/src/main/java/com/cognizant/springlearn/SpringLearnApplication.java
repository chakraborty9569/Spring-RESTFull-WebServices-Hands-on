package com.cognizant.springlearn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class SpringLearnApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void main(String[] args) {
		LOGGER.info("Start");
		SpringApplication.run(SpringLearnApplication.class, args);
		/*displayDate();
		displayCountry();
		displayCountries();*/
	}
	
	/*private static void displayDate() {
		LOGGER.info("START");
		ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
		SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
		Date date=null;
		try {
			date = format.parse("31/12/2018");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		//System.out.println(date);
		LOGGER.debug("Date: {}", date);
		LOGGER.info("END");
	}
	
	private static void displayCountry() {
		LOGGER.info("START");
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country country = context.getBean("country", Country.class);
		Country anotherCountry = context.getBean("country", Country.class);
		LOGGER.debug("Country: {}", country.toString());
		LOGGER.debug("Country: {}", anotherCountry.toString());
		LOGGER.info("END");
	}
	
	private static void displayCountries() {
		LOGGER.info("START");
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		List<Country> countryList = context.getBean("countryList", ArrayList.class);
		LOGGER.debug("Countries: {}", countryList);
		LOGGER.info("END");
	}*/

}
