package com.telusko.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootStudentInformationApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(SpringBootStudentInformationApplication.class, args);
		
		Amazon amazon = context.getBean(Amazon.class);

		boolean status=amazon.initiateDelivery(45);

		if(status)
			System.out.println("Delivered Successfully!");
		else
			System.out.println("Failed to deliver");
	}

}

