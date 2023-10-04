package com.company.main;

import com.company.dao.CreditCard;
import com.company.dao.DebitCard;
import com.company.dao.QRCode;
import com.company.service.PaymentProcess;

public class LaunchApp {

	public static void main(String[] args) {
		
		// ********** Payment Through Debit Card *************
		
		//PaymentProcess pp = new PaymentProcess(); // default constructor to create pp Object		
		//pp.setPay(new DebitCard()); // setter injection
		
		PaymentProcess pp = new PaymentProcess(new DebitCard()); // Alternatively, through parameterized constructor injection
		pp.doPayment(99.9);
		
		// ********** Payment Through Credit Card *************
		
		//PaymentProcess pp = new PaymentProcess();		
		//pp.setPay(new CreditCard());
		
		//PaymentProcess pp = new PaymentProcess(new CreditCard());
		//pp.doPayment(99.9);
		
		// ********** Payment Through QR Code ***********

		//PaymentProcess pp = new PaymentProcess();		
		//pp.setPay(new QRCode());
		
		//PaymentProcess pp = new PaymentProcess(new QRCode());
		//pp.doPayment(99.9);
	}
}
