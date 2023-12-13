package com.telusko.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="Implementers")
public class Implementers 
{
	@Id
	@Column(name="id")
   private Integer id;
   
	@Column(name="name")
   private String name;
   
	@Temporal(TemporalType.DATE)
	@Column(name="date")
   private Date date;
	
	@Temporal(TemporalType.TIME)
	@Column(name="time")
   private Date time;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dateAndTime")
   private Date dateAndTime;

	public Implementers()
	{
		System.out.println("Implementer Constructor zero param for hibernate ");
	}
	
	@Override
	public String toString() {
		return "Implementers [id=" + id + ", name=" + name + ", date=" + date + ", time=" + time + ", dateAndTime="
				+ dateAndTime + "]";
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Date getDateAndTime() {
		return dateAndTime;
	}

	public void setDateAndTime(Date dateAndTime) {
		this.dateAndTime = dateAndTime;
	}
   
	
}
