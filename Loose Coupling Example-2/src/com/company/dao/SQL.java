package com.company.dao;

import com.company.service.CourseList;

public class SQL implements CourseList{
	
	@Override
	public boolean courseChoice(double amount) 
	{
	    System.out.println("SQL Course is purchased with amount : " + amount );
	    
		return true;
	}

}
