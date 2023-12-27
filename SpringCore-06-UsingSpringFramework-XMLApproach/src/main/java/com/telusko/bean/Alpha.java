package com.telusko.bean;

public class Alpha 
{
	private Beta beta;


//	public Alpha(Beta beta)
//    {
//		this.beta=beta;
//    	System.out.println("Alpha bean created");
//    }
	public Alpha()
    {
	
    	System.out.println("Alpha bean created");
    }
	
	  public void setBeta(Beta beta) 
	  {
			this.beta = beta;
			System.out.println("setBeta() invoked and injected Beta into Alpha obj");
	}
    
    
}
