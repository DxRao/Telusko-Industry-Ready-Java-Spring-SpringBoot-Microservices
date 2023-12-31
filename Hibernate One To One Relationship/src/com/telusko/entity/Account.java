package com.telusko.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account 
{
  
	@Id
	private String accNo;
	
	private String name;
	
	private String accType;
	
	public Account()
	{
		System.out.println("Account zero param Constructor for hibernate");
	}

	public String getAccNo() {
		return accNo;
	}


	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAccType() {
		return accType;
	}


	public void setAccType(String accType) {
		this.accType = accType;
	}


	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", accType=" + accType + "]";
	}
}
