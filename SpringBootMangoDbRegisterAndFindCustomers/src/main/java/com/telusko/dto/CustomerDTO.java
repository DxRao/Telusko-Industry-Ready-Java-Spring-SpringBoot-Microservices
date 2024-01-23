package com.telusko.dto;

public class CustomerDTO {
	
private String id;
	
	public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

	private Integer cusNo;
	
	private String name;
	
	private String city;
	
	public CustomerDTO()
	{
		System.out.println("Zero param customer obj");
	}

	public Integer getCusNo() {
		return cusNo;
	}

	public void setCusNo(Integer cusNo) {
		this.cusNo = cusNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", cusNo=" + cusNo + ", name=" + name + ", city=" + city + "]";
	}

	public CustomerDTO(Integer cusNo, String name, String city) {
		super();
	
		this.cusNo = cusNo;
		this.name = name;
		this.city = city;
	}	

}
