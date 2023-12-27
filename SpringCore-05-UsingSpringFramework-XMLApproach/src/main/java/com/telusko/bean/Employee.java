package com.telusko.bean;

public class Employee 
{
	private Integer id;
	private String empName;
	private String empCity;
	private Float empSalary;
	
	static
	{
		System.out.println("Employee class is loaded...");
	}
	
//	public Employee()
//	{
//		System.out.println("Emp bean created");
//	}
	
	public Employee(Integer id, String empName, String empCity, Float empSalary) {
		super();
		this.id = id;
		this.empName = empName;
		this.empCity = empCity;
		this.empSalary = empSalary;
		System.out.println("Param empl Constructor invoked");
	}
	
	public String empActivity() 
	{
		System.out.println("Inside Employee activity ");
		return " Employee is active currently";
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", empCity=" + empCity + ", empSalary=" + empSalary
				+ "]";
	}

}
