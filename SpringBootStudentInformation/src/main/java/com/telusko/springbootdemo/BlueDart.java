package com.telusko.springbootdemo;

import org.springframework.stereotype.Component;

@Component
public class BlueDart implements CourierService
{
	public BlueDart()
	{
		System.out.println("BD obj is created");
	}
	
	public boolean courierService(double amount) 
	{
		System.out.println("Courier delivered through BlueDart and amount paid is " +amount);
		return true;
	}

}
