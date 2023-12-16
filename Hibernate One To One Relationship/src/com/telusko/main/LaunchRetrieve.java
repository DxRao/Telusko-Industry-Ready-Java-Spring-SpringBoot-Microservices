package com.telusko.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.telusko.entity.Account;
import com.telusko.entity.Employee2;
import com.telusko.util.HibernateUtil;

public class LaunchRetrieve {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Session session=null;
		

		
		try
		{
		session = HibernateUtil.getSession();
		if(session!=null)
		{
			Employee2 emp=session.get(Employee2.class, 1);
			System.out.println(emp);
		     
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

