package com.telusko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.dto.CustomerDTO;
import com.telusko.generator.IdGenerator;
import com.telusko.service.CustomerServiceImpl;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMangoDbRegisterAndFindCustomersApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootMangoDbRegisterAndFindCustomersApplication.class, args);
	
		CustomerServiceImpl service = context.getBean(CustomerServiceImpl.class);
		
		
//		String status=service.registerCustomer(new CustomerDTO(102, "Rahul", "Chennai"));
//		System.out.println(status);
//		CustomerDTO dto=new CustomerDTO();
//		dto.setId(IdGenerator.generateId());
//		dto.setCusNo(105);dto.setName("Sushil");
//		dto.setCity("Mumbai");
//		String status=service.registerCustomer(dto);
//		System.out.println(status);
		
//		service.findAllCustomers().forEach(cus->System.out.println(cus));
//		String status=service.removeDocument("1fd95da29f");
//		System.out.println(status);
		service.findAllCustomers().forEach(cus->System.out.println(cus));
		
		context.close();

	}

}
