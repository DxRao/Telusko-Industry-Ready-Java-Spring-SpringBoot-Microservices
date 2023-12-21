package com.telusko.main;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.telusko.entity.Course;
import com.telusko.entity.Student;
import com.telusko.util.HibernateUtil;

public class LaunchApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session session=null;
		Transaction transaction=null;
		boolean flag=false;
		
		try
		{
		session = HibernateUtil.getSession();
		if(session!=null)
		{
			 transaction = session.beginTransaction();
			 Course c1=new Course(1, "Java", 14542);
			 Course c2=new Course(2, "Spring", 15542);
			 Course c3=new Course(3, "Hibernate", 4542);
			 
			 Set<Course> set1=new HashSet<>();
			 set1.add(c1);
			 set1.add(c2);
			 
			 Set<Course> set2=new HashSet<>();
			 set2.add(c1);
			 set2.add(c2);
			 set2.add(c3);
			 
			 Set<Course> set3=new HashSet<>();

			 set3.add(c2);
			 set3.add(c3);
			 
			 Student st1=new Student("Rohan", "Pune",set1);
			 Student st2=new Student("Rohit", "Bengaluru",set3);
			 Student st3=new Student("Ramesh", "Mumbai",set2);
			 
			 session.save(st1);
			 session.save(st2);
			 session.save(st3);
			
			 flag=true;
		}
		
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(flag)
			{
				transaction.commit();
				System.out.println("Data is saved");
			}
			else
			{
				transaction.rollback();
				System.out.println("Not able to store data in db");
			}
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}

	}

}
