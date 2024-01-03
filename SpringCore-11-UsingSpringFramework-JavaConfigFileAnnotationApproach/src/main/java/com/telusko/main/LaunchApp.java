package com.telusko.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.telusko.beans.GreetMe;
import com.telusko.config.JavaConfiguration;

public class LaunchApp {

	public static void main(String[] args) {
		
		ApplicationContext ac=new AnnotationConfigApplicationContext(JavaConfiguration.class);
         
		GreetMe greet=ac.getBean(GreetMe.class);
		String greetings=greet.generateGreeting("Rao");
		System.out.println(greetings);
	}

}
