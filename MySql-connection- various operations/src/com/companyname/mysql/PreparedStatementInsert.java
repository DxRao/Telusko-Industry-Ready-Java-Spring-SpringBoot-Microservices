package com.companyname.mysql;

import java.sql.*;

import java.util.Scanner;

public class PreparedStatementInsert {

	public static void main(String[] args) throws Exception {		
		  
		  int id = 0; 
		  String fname = ""; 
		  int age = 29; 
		  String address = ""; 
		  String gender = "";
		  
		  Scanner sc  = new Scanner(System.in);
		  
		  System.out.println("Please enter your Id: ");
		  id = sc.nextInt();
		  sc.nextLine();
		  
		  System.out.println("Please enter your First name: ");
		  fname = sc.nextLine();
		  
		  System.out.println();
		  
		  System.out.println("Please enter your Age: ");
		  age = sc.nextInt();
		  sc.nextLine();
		  
		  System.out.println("Please enter your Address: ");
		  address = sc.nextLine();
		  
		  System.out.println("Please enter your Gender: ");
		  gender = sc.nextLine();
		  
		  sc.close();		 		
		
		Class.forName("com.mysql.cj.jdbc.Driver"); // Load and Register MySql JDBC Driver
		
		System.out.println("Driver loaded and registered successfully");
		
		String url = "jdbc:mysql://localhost:3306/telusko";
		
		Connection con = DriverManager.getConnection(url, "root", "rao3mysql");
		
		System.out.println("Connection to Database Telusko established");
		
		PreparedStatement psmt = con.prepareStatement("insert into Employee values(?, ?, ?, ?, ?)");
		
		psmt.setInt(1, id);
		psmt.setString(2, fname);
		psmt.setInt(3, age);
		psmt.setString(4, address);
		psmt.setString(5, gender);
		
		int i = psmt.executeUpdate();
		
		if(i > 0) {
			
			System.out.println("Data insertion is successful");
			
		}
		else {
			
			System.out.println("Data insertion has failed");		
			
		}	

	}

}
