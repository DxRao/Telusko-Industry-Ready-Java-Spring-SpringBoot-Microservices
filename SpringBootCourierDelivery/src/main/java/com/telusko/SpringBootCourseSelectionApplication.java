package com.telusko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.telusko.beans.CourseSelection;

@SpringBootApplication
public class SpringBootCourseSelectionApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootCourseSelectionApplication.class, args);
		
		CourseSelection cs = context.getBean(CourseSelection.class);
		
		boolean status=cs.chooseCourse(444.5);
		
		if(status)
		{
			System.out.println("Successful course selection and payment");
		}
		else
		{
			System.out.println("Failed course selection and payment");
		}
		
	        context.close();
	}

}