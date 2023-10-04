package com.company.dao;

import com.company.service.IPay;

public class DebitCard implements IPay
{
	 public DebitCard()
	    {
	    	System.out.println("Debit card is instantiated");
	    }
	    public boolean payBill(double amount)
	    {
	    	System.out.println("Payment is processed through Debit card and amount paid is : "+ amount);
	    	return true;
	    }

}
