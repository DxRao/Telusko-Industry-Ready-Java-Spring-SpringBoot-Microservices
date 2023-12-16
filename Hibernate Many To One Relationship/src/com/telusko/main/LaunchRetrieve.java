package com.telusko.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.telusko.entity.Branch;
//import com.telusko.entity.Student;
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
			Branch branch = session.get(Branch.class, "T44");
			System.out.println(branch);
		     
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
