package com.telusko.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student 
{
    @Id
    @Column(name="sid")
	private Integer id;
    
    @Column(name="sname")
	private String name;
    
    @Column(name="sage")
	private Integer age;
    
    @Column(name="scity")
	private String city;
	
	public Student()
	{
		System.out.println("No-args Constructor required for internal use of hibernate");
	}
	
	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Integer getAge() {
		return age;
	}



	public void setAge(Integer age) {
		this.age = age;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", city=" + city + "]";
	}
	
	
}

