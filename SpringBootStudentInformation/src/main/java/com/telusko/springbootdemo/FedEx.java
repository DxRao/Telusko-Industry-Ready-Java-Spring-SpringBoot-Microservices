package com.telusko.springbootdemo;

import org.springframework.stereotype.Component;

@Component
public class FedEx implements CourierService
{

	
	public FedEx()
	{
		System.out.println("Fe obj is created");
	}
	
	public boolean courierService(double amount) 
	{
		System.out.println("Courier delivered through FedEx and amount paid is " +amount);
		return true;
	}
}
