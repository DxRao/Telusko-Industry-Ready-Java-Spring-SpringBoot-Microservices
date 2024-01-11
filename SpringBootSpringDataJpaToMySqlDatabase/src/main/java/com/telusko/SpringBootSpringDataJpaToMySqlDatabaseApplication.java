package com.telusko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.persistence.IStudentDao;
import com.telusko.persistence.StudentTable;


import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootSpringDataJpaToMySqlDatabaseApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootSpringDataJpaToMySqlDatabaseApplication.class, args);
		
		IStudentDao dao=context.getBean(IStudentDao.class);
		
		StudentTable st=new StudentTable();
		st.setSid(5);
		st.setSname("Srinivas");
		st.setScity("Hyderabad");		
		
		dao.save(st);		
	
	context.close();
	
	}

}
