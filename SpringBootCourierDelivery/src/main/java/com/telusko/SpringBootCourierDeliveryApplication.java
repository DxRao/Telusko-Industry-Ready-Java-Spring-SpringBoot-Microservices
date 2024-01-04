package com.telusko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.telusko.beans.CourseSelection;

@SpringBootApplication
public class SpringBootCourierDeliveryApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootCourierDeliveryApplication.class, args);
		
		CourseSelection cs = context.getBean(CourseSelection.class);
		
		boolean status=cs.chooseCourse(444.5);
		
		if(status)
		{
			System.out.println("Successfully delivered");
		}
		else
		{
			System.out.println("Failed to deliver");
		}
		
	        context.close();
	}

}