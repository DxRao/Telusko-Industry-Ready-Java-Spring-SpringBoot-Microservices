package com.company.springprojects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootCalculatorApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(SpringBootCalculatorApplication.class, args);
		MyCalculator mycalc = context.getBean(MyCalculator.class);
		System.out.println(mycalc.add(5, 10));
	
	}

}
