package com.telusko;

import java.util.Iterator;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.dao.Employee;
import com.telusko.dao.EmployeeDaoImpl;



@SpringBootApplication
public class SpringBootJdbcApItoMySqlApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootJdbcApItoMySqlApplication.class, args);
	
		EmployeeDaoImpl emp = context.getBean(EmployeeDaoImpl.class);

		//		List<Employee> list = emp.getTheEmployee();
//		Iterator<Employee> itr = list.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
//		List<Employee> list = emp.getTheEmployee();
//		list.forEach(em->System.out.println(em));
		emp.getTheEmployee().forEach(em->System.out.println(em));
		
	
		context.close();
	
	}

}
