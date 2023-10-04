package com.company.main;

import com.company.dao.Java;
import com.company.dao.SQL;
import com.company.dao.SpringBoot;
import com.company.service.CourseProcess;

public class LaunchMain {

	public static void main(String[] args) {
		
		CourseProcess cp = new CourseProcess();
		
		////////// Purchasing Java Course - Setter Injection //////////
		cp.setCourse(new Java());
		cp.coursePayment(18000);
		
		//////////Purchasing Java Course - Constructor Injection //////////
		cp = new CourseProcess(new Java());
		cp.coursePayment(18000);
		System.out.println();
		
		//////////Purchasing SpringBoot Course - Setter Injection //////////
		cp.setCourse(new SpringBoot());
		cp.coursePayment(10000);
		
		//////////Purchasing SpringBoot Course - Constructor Injection //////////
		cp = new CourseProcess(new SpringBoot());
		cp.coursePayment(10000);
		System.out.println();
		
		//////////Purchasing SQL Course - Setter Injection //////////
		cp.setCourse(new SQL());
		cp.coursePayment(7000);
		
		//////////Purchasing SQL Course - Constructor Injection //////////
		cp = new CourseProcess(new SQL());
		cp.coursePayment(7000);
		
		}
}
