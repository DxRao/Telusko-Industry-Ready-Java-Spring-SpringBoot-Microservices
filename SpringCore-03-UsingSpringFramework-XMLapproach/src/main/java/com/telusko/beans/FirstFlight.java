package com.telusko.beans;

public class FirstFlight implements CourierService
{

//	static
//	{
//		System.out.println("First Flight class loaded");
//	}
	
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
