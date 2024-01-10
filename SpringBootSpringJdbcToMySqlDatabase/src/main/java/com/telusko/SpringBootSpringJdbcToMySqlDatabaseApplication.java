package com.telusko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.telusko.dao.StudentDaoImpl;
import com.telusko.dao.StudentTableBo;

@SpringBootApplication
public class SpringBootSpringJdbcToMySqlDatabaseApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(SpringBootSpringJdbcToMySqlDatabaseApplication.class, args);
		
		StudentDaoImpl dao=context.getBean(StudentDaoImpl.class);
		   
		StudentTableBo bo=dao.getStudentById(1);
		   
		System.out.println(bo); 		   
		   
		dao.getStudents().forEach(data->System.out.println(data));
		
	}

}



