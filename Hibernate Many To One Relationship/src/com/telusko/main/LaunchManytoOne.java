package com.telusko.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.telusko.entity.Branch;
import com.telusko.entity.Student;
import com.telusko.util.HibernateUtil;

public class LaunchManytoOne {

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
		   
		      Branch branch=new Branch();
		      branch.setBid("T44");
		      branch.setBranchName("Development");
		      branch.setBranchLocation("bengaluru");
		      
		      Student st1=new Student("Rohan" , "Pune", branch);
		      Student st2=new Student("Rohit" , "Bengaluru", branch);
		      Student st3=new Student("Ramesh" , "Mumbai", branch);
		      
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

