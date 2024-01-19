package com.telusko;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.bo.CustomerDetails;
import com.telusko.service.CustomerServiceImpl;

@SpringBootApplication
public class SpringBootDateAndTimeSpringDataJpaMySqlApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootDateAndTimeSpringDataJpaMySqlApplication.class, args);
	
		CustomerServiceImpl service = context.getBean(CustomerServiceImpl.class);
		
		CustomerDetails customer = new CustomerDetails("Rao", "Hyderabad", LocalDateTime.of(1975, 05, 04, 7, 11, 44), 
				LocalTime.of(18, 22), LocalDate.of(2024, 01, 19));
	
		String status=service.registerCustomer(customer);
		System.out.println(status);
		
		service.getAllCustomer().forEach(c->System.out.println(c));		
		
		context.close();
	}

}
