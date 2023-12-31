package com.company.springprojects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SpringBootHelloWorldProjectApplication {

	public static void main(String[] args) {
		
		System.out.println("Hello World And Welcome To The World Of Spring Boot");
		ApplicationContext context = SpringApplication.run(SpringBootHelloWorldProjectApplication.class, args);
		Student_For_Lifetime student = context.getBean(Student_For_Lifetime.class);
		student.learning();
	}

}
