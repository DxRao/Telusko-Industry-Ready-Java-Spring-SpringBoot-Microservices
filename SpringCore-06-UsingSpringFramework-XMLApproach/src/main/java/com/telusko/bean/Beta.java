package com.telusko.bean;

public class Beta 
{
	private Alpha alpha;
	
   public Beta(Alpha alpha)
   {
	   this.alpha=alpha;
	   System.out.println("Beta bean created");
   }
	
//	  public void setAlpha(Alpha alpha) 
//	  {
//			this.alpha = alpha;
//			System.out.println("setAlpha() invoked and injected Alpha into beta obj");
//	  }
}
