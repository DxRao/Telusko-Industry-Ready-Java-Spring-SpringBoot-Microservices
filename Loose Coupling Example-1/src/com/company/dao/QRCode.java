package com.company.dao;

import com.company.service.IPay;

public class QRCode implements IPay
{
	 public QRCode()
	    {
	    	System.out.println("QR Code is instantiated");
	    }
	    public boolean payBill(double amount)
	    {
	    	System.out.println("Payment is processed through QR Code and amount paid is : "+ amount);
	    	return true;
	    }

}