package com.telusko.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


@Component
@Profile("micro")

public class Microservices implements Courses {

	@Override
	public boolean registerToCourse(Double cost) 
	{
		System.out.println("Microservices course registered amount paid "+cost);
		return true;
	}

}
