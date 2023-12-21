package com.telusko.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.telusko.entity.Student;
import com.telusko.util.HibernateUtil;

public class LaunchFetch 
{

	public static void main(String[] args) 
	{
Session session=null;
	
		

		
		try
		{
		session = HibernateUtil.getSession();
		if(session!=null)
		{
			Student st1 = session.get(Student.class, 1);
			System.out.println(st1);
			System.out.println("******************");
			Student st2 = session.get(Student.class, 2);
			System.out.println(st2);
			System.out.println("******************");
			Student st3 = session.get(Student.class, 3);
			System.out.println(st3);
			System.out.println("******************");
		     
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
			
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}


	}

}
