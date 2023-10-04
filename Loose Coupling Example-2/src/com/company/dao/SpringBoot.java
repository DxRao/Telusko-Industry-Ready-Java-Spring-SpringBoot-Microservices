package com.company.dao;

import com.company.service.CourseList;

public class SpringBoot implements CourseList{
	
	@Override
	public boolean courseChoice(double amount) 
	{
	    System.out.println("SpringBoot Course is purchased with amount : " + amount );
	    
		return true;
	}

}
