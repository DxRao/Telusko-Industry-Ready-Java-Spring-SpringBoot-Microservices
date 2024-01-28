package com.telusko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import com.telusko.services.Courses;
import com.telusko.services.Mockito;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMultipleProfilesApplication implements CommandLineRunner  {
	@Value("${myproject.name}")
	private String projectName;
	
	@Autowired
	private Courses course;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootMultipleProfilesApplication.class, args);
	
	}
	@Override
	public void run(String... args) throws Exception 
	{
		System.out.println("Run method");
		System.out.println("Project name "+ projectName);
		boolean status=course.registerToCourse(999.0);
		if(status)
			System.out.println("Registered successfully");
		else
			System.out.println("Failed to register");
		
	}
	
//	@Profile("mockito")
//	@Bean
//	public Mockito mockitoObj()
//	{
//		return new Mockito();
//	}
	
}
