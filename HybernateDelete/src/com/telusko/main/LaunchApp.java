package com.telusko.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.telusko.entity.Student;

public class LaunchApp 
{

	public static void main(String[] args) 
	{
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		
		Integer id=2;
		Student st = session.get(Student.class, id);
		if(st!=null)
		{
			System.out.println("if block");
			Transaction transaction = session.beginTransaction();
			session.delete(st);
			transaction.commit();
		}
		else
		{
			System.out.println("Record not available with id "+ id);
		}
		
		session.close();
		sessionFactory.close();
		
		
		

	}

}
