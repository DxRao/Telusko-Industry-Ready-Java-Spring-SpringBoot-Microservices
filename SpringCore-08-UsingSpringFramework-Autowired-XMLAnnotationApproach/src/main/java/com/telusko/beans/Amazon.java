package com.telusko.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Amazon 
{
//	@Autowired
//	@Qualifier("fedEx")
  private CourierService service;
 

  public Amazon()
  {
  	System.out.println("Amazon obj is created");
  }
  
  @Autowired
  public Amazon(@Qualifier("ff")CourierService service)
  {
  	this.service = service;
  	System.out.println("Constructor");
  }
  
	/*
	 * @Autowired
	 * 
	 * @Qualifier("bd") public void setService(CourierService service) {
	 * this.service = service;
	 * System.out.println("Setter is invoked to perform injection"); }
	 */



	public boolean initiateDelivery(double amount)
	{
		
		return service.courierService(amount);
	}

}
