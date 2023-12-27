package com.telusko.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.telusko.bean.Employee;

public class LaunchLazyLoad 
{

	public static void main(String[] args) 
	{
		/*
		 * Resource resource= new ClassPathResource("applicationcontext.xml");
		 * BeanFactory factory = new XmlBeanFactory(resource);
		 */
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader read=new XmlBeanDefinitionReader(factory);
		
		read.loadBeanDefinitions("applicationContext.xml");
		
		
		Employee emp1=factory.getBean("emp1",Employee.class);
		System.out.println(emp1);
		
		Employee emp2=factory.getBean("emp2",Employee.class);
		System.out.println(emp2);

		 //BeanFactory factory= new DefaultListableBeanFactory(); 

	}

}
