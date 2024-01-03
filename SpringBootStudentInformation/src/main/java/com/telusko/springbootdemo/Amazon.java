package com.telusko.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Amazon 
{
  private CourierService service;

  private int shippingCost;

  public Amazon()
  {
  	System.out.println("Amazon obj is created");
  }
  
  @Autowired
  public Amazon(@Qualifier("blueDart") CourierService service) // Spring names the Bean object same as class except that first letter is in small case
  																// ex... blueDart for class BlueDart
  {
  	this.service = service;
  	System.out.println("Constructor");
  }


	public boolean initiateDelivery(double amount)
	{
		
		return service.courierService(amount);
	}

}
