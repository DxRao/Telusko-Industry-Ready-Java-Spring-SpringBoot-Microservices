package com.telusko.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Branch 
{
	@Id
    private String bid;
	
	private String branchName;
	
	private String branchLocation;
	
		
	public Branch()
	{
		System.out.println("Branch zero param Constructor for hibernate");
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchLocation() {
		return branchLocation;
	}

	public void setBranchLocation(String branchLocation) {
		this.branchLocation = branchLocation;
	}

	@Override
	public String toString() {
		return "Branch [bid=" + bid + ", branchName=" + branchName + ", branchLocation=" + branchLocation + "]";
	}
	
}
