package com.company.springprojects;

import org.springframework.stereotype.Component;

@Component
public class Student_For_Lifetime {
	
	public Student_For_Lifetime() {
		
		System.out.println("Student obj created");
	}
	
	public void learning() {
		
		System.out.println("Learning is a life long process and you are a Student forever and that too for a lifetime.");
		
	}

}
