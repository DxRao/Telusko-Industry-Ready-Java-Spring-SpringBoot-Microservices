package com.telusko.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.telusko.entity.Student2;
import com.telusko.util.HibernateUtil;

public class LaunchApp {

	public static void main(String[] args) {
		
		Session session=null;
		 Transaction transaction=null;
		 boolean flag=false;
		
		try
		{
		    session = HibernateUtil.getSession();
		   
			if(session!=null)
		    	transaction=session.beginTransaction();
			if(transaction!=null)
			{
				Student2 st=new Student2();
				
				st.setId(1);
				st.setName("Rahul");
				st.setAge(19);
				st.setCity("Bengaluru");
				
				session.save(st);
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
