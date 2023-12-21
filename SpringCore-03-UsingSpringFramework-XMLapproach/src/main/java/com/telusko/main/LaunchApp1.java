package com.telusko.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.telusko.beans.Amazon;

public class LaunchApp1 
{

	public static void main(String[] args) 
	{
		
			ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			
//			Amazon amz=context.getBean("amazon", Amazon.class);
//			Amazon amz=(Amazon) context.getBean("amazon");
			
			Amazon amz=context.getBean(Amazon.class);
			
			boolean status=amz.initiateDelivery(4545.4);
			
			if(status)
				System.out.println("Order delivered");
			else
			System.out.println("Failed to deliver");
			
	}

}
