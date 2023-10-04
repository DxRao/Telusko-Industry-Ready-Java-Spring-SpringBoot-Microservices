package com.company.service;

public class CourseProcess {
	
	private CourseList course;	
	
	//setter injection
	public void setCourse(CourseList course) {
		
		this.course = course;
	}
	
	// default constructor
	public CourseProcess() {	
		
	}

	// parameterized constructor
	public CourseProcess(CourseList course) {
		
		super();
		
		this.course = course;
	}
	
	public boolean coursePayment(double amount) {
		
		boolean status = course.courseChoice(amount);
		
		if (status) {
			
			System.out.println("Course payment is successful. Thank You.");
		}
		else{
			
			System.out.println("Course payment has failed. Sorry and try again.");
		}
		
		return status;		
	}	

}// class
