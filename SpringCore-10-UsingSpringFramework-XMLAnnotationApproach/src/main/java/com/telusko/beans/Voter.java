package com.telusko.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component(value="voter")
@PropertySource(value="com/telusko/commons/application.properties")
public class Voter 
{
	@Value("${voter.info.name}")
	private String name;
	
	@Value("${voter.info.age}")
	private int age;
	
	static
	{
		System.out.println("Voter class loading..");
		
	}
	public Voter()
	{
		System.out.println("Voter is Instantiated");
	}
	
	@PostConstruct
	public void myInit()
	{
		System.out.println("Init");
	}
	
	//Business logic
	public String checkEligibility()
	{
		System.out.println("Method call with business logic");
		if(age>=18)
			return "Hello! " + name+" You're Eligible for voting";
		else
			return "Hello! " + name+"You're not Eligible for Voting";
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println(" Bean Destroyed...");
	}

}
