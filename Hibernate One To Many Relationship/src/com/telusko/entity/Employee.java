package com.telusko.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private Integer id;
	
	private String name;
	private String city;
	
	private Double salary;
	
	
	public Employee()
	{
		System.out.println("Employee zero param constructor for hibernate internal");
	}


	public Employee(String name, String city, Double salary) {
		super();
		this.name = name;
		this.city = city;
		this.salary = salary;
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


	public Double getSalary() {
		return salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", salary=" + salary + "]";
	}
	
	
}
