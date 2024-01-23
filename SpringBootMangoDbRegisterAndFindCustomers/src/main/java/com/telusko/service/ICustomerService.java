package com.telusko.service;

import java.util.List;

import com.telusko.bo.Customer;
import com.telusko.dto.CustomerDTO;

public interface ICustomerService 
{
	public String registerCustomer(CustomerDTO dto);
	public List<Customer> findAllCustomers();
	public String removeDocument(String id);

}
