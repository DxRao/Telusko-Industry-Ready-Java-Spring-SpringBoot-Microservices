package com.telusko.main;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.telusko.entity.Profiles;

public class LaunchRet {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure().
				addAnnotatedClass(Profiles.class).buildSessionFactory();

		Session session = sessionFactory.openSession();
		System.out.println("Session object also fine");
		Profiles p=session.get(Profiles.class, 6);
		System.out.println(p);
		System.out.println("Profile id is :"+ p.getPid());
		
		System.out.println("Profile name is :"+ p.getName());
		
		byte img[]=p.getImg();
		FileOutputStream fos=new FileOutputStream("Java.jpg");
		fos.write(img);
		
		char text[]=p.getCharfile();
		fos.flush();
		
		FileWriter fw=new FileWriter("Java.txt");
		fw.write(text);
		
		fw.flush();
		
		
	
		
		fos.close();
		fw.close();
		session.close();

	}

}
