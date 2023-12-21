package com.telusko.beans;

public class FedEx implements CourierService
{

//	static
//	{
//		System.out.println("FedEX class loaded");
//	}
	
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