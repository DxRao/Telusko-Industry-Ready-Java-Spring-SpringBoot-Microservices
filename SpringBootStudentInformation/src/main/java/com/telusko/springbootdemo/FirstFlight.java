package com.telusko.springbootdemo;

import org.springframework.stereotype.Component;

@Component
public class FirstFlight implements CourierService
{

	public FirstFlight()
	{
		System.out.println("FF obj is created");
	}
	
	public boolean courierService(double amount) 
	{
		System.out.println("Courier delivered through FirstFlight and amount paid is " +amount);
		return true;
	}
}
