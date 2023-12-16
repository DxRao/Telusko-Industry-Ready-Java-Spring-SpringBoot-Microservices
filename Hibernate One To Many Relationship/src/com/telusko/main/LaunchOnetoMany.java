package com.telusko.main;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.telusko.entity.Department;
import com.telusko.entity.Employee;
import com.telusko.util.HibernateUtil;

public class LaunchOnetoMany {

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
		      Employee e1=new Employee("edy" , "cork", 243524.4);
		      
		      Employee e2=new Employee("tabish" , "Bengaluru", 263524.4);
		      
		      Employee e3=new Employee("Ambika" , "prosper", 463524.4);
		      Set<Employee> set=new HashSet<>();
		      set.add(e1);
		      set.add(e2);
		      set.add(e3);
		      Department dep=new Department();
		      dep.setDepId("T01");
		      dep.setName("Java Implementers");
		      dep.setEmployee(set);
		      
		      session.save(dep);
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
