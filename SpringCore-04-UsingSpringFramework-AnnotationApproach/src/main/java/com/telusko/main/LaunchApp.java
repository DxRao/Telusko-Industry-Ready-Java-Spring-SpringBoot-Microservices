package com.telusko.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.telusko.util.Password;

public class LaunchApp {

	public static void main(String[] args) 
	{          
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		/*
		 * Password p=context.getBean(Password.class); p.disp();
		 */

	}

}
