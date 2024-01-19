package com.telusko.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.bo.CustomerDetails;
import com.telusko.dao.ICustomerDao;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	ICustomerDao repo;
	
	@Override
	public String registerCustomer(CustomerDetails customer) {
		
		 Integer id=repo.save(customer).getCid();
		 return "Customer details saved with id"+ id;
		 
	}

	@Override
	public List<CustomerDetails> getAllCustomer() {
		
		List<CustomerDetails> list=(List<CustomerDetails>) repo.findAll();
		return list;
	}

}
