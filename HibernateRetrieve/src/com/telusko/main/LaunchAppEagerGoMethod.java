package com.telusko.main;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.telusko.entity.Student;

public class LaunchAppEagerGoMethod {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Configuration config = new Configuration();
		
		config.configure("/hibernate.config.xml");
		
		SessionFactory sessionFactory = config.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		System.out.println("Name of class implementing session factory : "+sessionFactory.getClass().getName());
		
		Student st=session.get(Student.class, 1);
		
		System.out.println("Student id :"+st.getId());
		System.out.println("Student name :"+st.getName());
		System.out.println("Student age :"+st.getAge());
		System.out.println("Student city :"+st.getCity());

		//		System.in.read();

		//		Student st1=session.get(Student.class, 1); // gets values from Session cache without running query again

		//		System.out.println("Student id :"+st1.getId());
		//		System.out.println("Student name :"+st1.getName());
		//		System.out.println("Student age :"+st1.getAge());
		//		System.out.println("Student city :"+st1.getCity());
		
		session.close();
		sessionFactory.close();
		
	}

}
