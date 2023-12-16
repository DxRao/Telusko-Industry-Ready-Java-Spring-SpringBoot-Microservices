package com.telusko.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.telusko.entity.Department;
import com.telusko.util.HibernateUtil;

public class LaunchRetrieve {

	public static void main(String[] args) 
	{
		
		Session session=null;
	
		

		
		try
		{
		session = HibernateUtil.getSession();
		if(session!=null)
		{
			Department dep=session.get(Department.class, "T01");
			System.out.println(dep);
		     
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
