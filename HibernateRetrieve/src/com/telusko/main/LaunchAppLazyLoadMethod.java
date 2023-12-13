package com.telusko.main;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.telusko.entity.Student;

public class LaunchAppLazyLoadMethod {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Configuration config = new Configuration();
		
		config.configure("/hibernate.config.xml");
		
		SessionFactory sessionFactory = config.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		System.out.println("Name of class implementing session factory : "+sessionFactory.getClass().getName());
     
		
		Student st=session.load(Student.class, 1);		
		
		System.out.println("ID : "+ st.getId());
		System.in.read();
		System.out.println("Name : "+ st.getName());
		System.out.println("AGE: "+ st.getAge());
		System.out.println("City : "+ st.getCity());
	     
		
		Student st1=session.load(Student.class, 1);	// gets values from Session cache without running query again
		
		System.out.println("ID : "+ st1.getId());
		System.in.read();
		System.out.println("Name : "+ st1.getName());
		System.out.println("AGE: "+ st1.getAge());
		System.out.println("City : "+ st1.getCity());
		
		session.close();
		sessionFactory.close();
		
	}

}
