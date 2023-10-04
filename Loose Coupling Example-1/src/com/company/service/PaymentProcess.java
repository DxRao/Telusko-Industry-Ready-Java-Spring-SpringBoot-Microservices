package com.company.service;

public class PaymentProcess {
	
	IPay pay;
	
	public PaymentProcess() {
		super();
	}
	
	// parameterized constructor injection
	public PaymentProcess(IPay pay) {
		super();
		this.pay = pay;
	} 

	// setter injection
	public void setPay(IPay pay) {
		this.pay = pay;
	}
	
	public boolean doPayment(double amount)
	{
		boolean status = pay.payBill(amount);
		
		if(status)
		{
			System.out.println("Payment success");
		}
		else
		{
			System.out.println("Payment Failed");
		}
		return true;
	}
}
