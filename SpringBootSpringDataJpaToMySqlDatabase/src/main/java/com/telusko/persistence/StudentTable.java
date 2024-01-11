package com.telusko.persistence;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="studenttable")
public class StudentTable 
{  
	@Id
	private Integer sid;
	private String sname;
	private String scity;

public StudentTable()
{
	   System.out.println("Student Bo obj created....");
}
public Integer getSid() {
	return sid;
}
public void setSid(Integer sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getScity() {
	return scity;
}
public void setScity(String scity) {
	this.scity = scity;
}
@Override
public String toString() {
	return "StudentTableBo [sid=" + sid + ", sname=" + sname + ", scity=" + scity + "]";
}


}
