package com.telusko.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.bo.Customer;
import com.telusko.dao.ICustomerRepo;
import com.telusko.dto.CustomerDTO;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private ICustomerRepo repo;
	
	@Override
	public String registerCustomer(CustomerDTO dto) 
	{
		System.out.println("Implementing of Mongo repo :"+ repo.getClass().getName());
		Customer cusDocument=new Customer();
		BeanUtils.copyProperties(dto, cusDocument);
		
		Customer c = repo.save(cusDocument);
		return "Data stored as Document in Mongo DB "+ c.getCusNo();
	}

	@Override
	public List<Customer> findAllCustomers() {
		
		return repo.findAll();
	}

	@Override
	public String removeDocument(String id) {
		Optional<Customer> doc = repo.findById(id);
		if(doc.isPresent())
		{
			//repo.delete(doc.get());
			repo.deleteById(id);
			return "Document deleted...";
		}
		return "Unable to delete the document";
	}

}
