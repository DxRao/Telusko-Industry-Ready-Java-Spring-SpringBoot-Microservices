package com.telusko.main;

import java.io.FileInputStream;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.telusko.entity.Profiles;

public class LaunchApp {

	public static void main(String[] args) throws IOException 
	{
		SessionFactory sessionFactory = new Configuration().configure().
				addAnnotatedClass(Profiles.class).buildSessionFactory();

		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		Profiles p=new Profiles();
		p.setPid(6);
		p.setName("Jay");
		FileInputStream fis=new FileInputStream("D:\\Images\\DRao1.jpg");
		byte img[]=new byte[fis.available()];
		fis.read(img);
		p.setImg(img);
		
		String text="This data is replica of text file";
		char ar[]=text.toCharArray();
		p.setCharfile(ar);
		
		session.save(p);
		System.out.println("Data saved");
		
		transaction.commit();
		session.close();
		
	}

}
