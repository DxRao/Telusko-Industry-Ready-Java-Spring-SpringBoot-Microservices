package com.telusko.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.telusko.entity.Student;

public class LaunchApp1 {

	public static void main(String[] args) 
	{
		//Inform JVM to activate Hibernate
		Configuration config = new Configuration();
		config.configure();
		
		//Creating SessionFactory to hold all other required objects for hibernate
        SessionFactory sessionFactory = config.buildSessionFactory();
        
        //Persistence operation
       Session session = sessionFactory.openSession();
       //Only for non select operation transaction must be there
       Transaction transaction = session.beginTransaction();
       
       //Create Persistence Object
       Student st=new Student();
       st.setId(1);
       st.setName("Sharmik");
       st.setAge(22);
       st.setCity("Pune");
       
       //Perform persistence operation
       session.save(st);
       
       //commit the operation
       transaction.commit();
       
       session.close();
       sessionFactory.close();
       
       
       
       
	}

}
