package com.telusko.beans;


public class Amazon 
{
    private CourierService service; // Interface's object reference variable defined 
    //which holds the obj ref address of its implementing child class object. ie.. bd,ff,fe
    
//    static 
//    {
//    	System.out.println("Amazon class is loaded");
//    }
    
//    public Amazon() // No Argument constructor()
//    {
//    	System.out.println("Amazon obj is created");
//    }
    
    //Dependency Injection done either through Constructor Injection or Setter Injection 
    	//depending on instructions given in Configuration XML file.
    
    public Amazon(CourierService service) // Used during Constructor Injection
    {
    	this.service = service;
    }
    
	public void setService(CourierService service) // Used during Setter Injection
	{
		this.service = service;
	}

	public boolean initiateDelivery(double amount) // invoked in main() class with actual amount
	{
		
		return service.courierService(amount); // courierService(amount) is an abstract method defined in Interface and implemented by bd, ff, fe classes. 
	}
}