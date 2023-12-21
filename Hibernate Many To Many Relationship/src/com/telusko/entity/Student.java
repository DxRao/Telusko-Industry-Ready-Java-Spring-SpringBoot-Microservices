package com.telusko.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
     private Integer id;
	
	private String name;
	private String city;
	
	@ManyToMany(cascade=CascadeType.ALL)
	private Set<Course> courses;
	
	public Student()
	{
		System.out.println("Zero param Constructor for hibernate student");
	}

	public Student( String name, String city, Set<Course> courses) {
		super();
		
		this.name = name;
		this.city = city;
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", courses=" + courses + "]";
	}	
}
