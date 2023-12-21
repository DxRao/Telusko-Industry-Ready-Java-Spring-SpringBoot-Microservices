package com.telusko.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course 
{
 
	@Id
	private Integer cid;
	
	private String cname;
	
	private Integer cost;
	
	public Course()
	{
		System.out.println("zero param constructor course");
	}

	public Course(Integer cid, String cname, Integer cost) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", cost=" + cost + "]";
	}
	
}
