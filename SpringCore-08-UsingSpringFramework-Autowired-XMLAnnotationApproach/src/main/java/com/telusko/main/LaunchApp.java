package com.telusko.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.telusko.beans.Amazon;

public class LaunchApp 
{

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Amazon amazon = context.getBean( Amazon.class);
		
		boolean status=amazon.initiateDelivery(45);
		
		if(status)
			System.out.println("Delivered Successfully!");
		else
			System.out.println("Failed to deliver");

	}

}
