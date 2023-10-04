package com.company.dao;

import com.company.service.CourseList;

public class Java implements CourseList{
	
	@Override
	public boolean courseChoice(double amount) 
	{
	    System.out.println("Java Course is purchased with amount : " + amount );
	    
		return true;
	}

}
