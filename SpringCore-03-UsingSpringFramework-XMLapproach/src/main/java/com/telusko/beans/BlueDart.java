package com.telusko.beans;

public class BlueDart implements CourierService
{

//	static
//	{
//		System.out.println("Blue dart class loaded");
//	}
	
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
