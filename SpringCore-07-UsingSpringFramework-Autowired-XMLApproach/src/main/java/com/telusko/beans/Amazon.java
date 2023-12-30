package com.telusko.beans;

public class Amazon 
{
  private CourierService service;
  
  private Trial trial;
 
  public void setTrial(Trial trial) {
	this.trial = trial;
}

public Amazon()
  {
  	System.out.println("Amazon obj is created");
  }
  
//  public Amazon(CourierService service)
//  {
//  	this.service = service;
//  	System.out.println("Constructor");
//  }
  
	public void setService(CourierService service) 
	{
		this.service = service;
		System.out.println("Setter is invoked to perform injection");
	}



	public boolean initiateDelivery(double amount)
	{
		
		return service.courierService(amount);
	}

}
