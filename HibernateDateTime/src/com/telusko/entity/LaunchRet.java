package com.telusko.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LaunchRet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sessionFactory = new Configuration().configure().
		addAnnotatedClass(Implementers.class).buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		Integer id = 2;
		Implementers imp = session.get(Implementers.class, id);
		
		if(imp!=null)
			System.out.println(imp);
		else
			System.out.println("Data not present with id : "+ id);

	}

}
