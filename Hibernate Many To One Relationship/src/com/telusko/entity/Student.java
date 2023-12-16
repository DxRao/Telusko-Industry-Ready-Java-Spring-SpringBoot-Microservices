package com.telusko.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Student 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
	
	private String name;
	
	private String city;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Branch branch;
	
	public Student()
	{
		System.out.println("Student zero param Constructor for hibernate internal");
	}

	public Student(String name, String city, Branch branch) {
		super();
		this.name = name;
		this.city = city;
		this.branch = branch;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public Branch getBranch() {
		return branch;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", branch=" + branch + "]";
	}
	
	
}
