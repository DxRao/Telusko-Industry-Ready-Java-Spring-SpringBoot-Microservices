package com.companyname.mysql;

	import java.sql.*;	
	
	public class PreparedStatementFetchData {

		public static void main(String[] args) throws Exception {		  
					  		
			
			Class.forName("com.mysql.cj.jdbc.Driver"); // Load and Register MySql JDBC Driver
			
			System.out.println("Driver loaded and registered successfully");
			
			String url = "jdbc:mysql://localhost:3306/telusko";
			
			Connection con = DriverManager.getConnection(url, "root", "rao3mysql");
			
			System.out.println("Connection to Database Telusko established");
			
			PreparedStatement psmt = con.prepareStatement("Select * from Employee");			

			ResultSet rs = psmt.executeQuery();
			
			System.out.println();
			System.out.println("Records fetched from Employee table are:");
			System.out.println("****************************************");
			
			while(rs.next()){
				
				int idNumber = rs.getInt("id");
				
				System.out.print(idNumber + " ");
				
				String name = rs.getString("fname");
				
				System.out.print(name + " ");				
				
				int age = rs.getInt("age");
				
				System.out.print(age + " ");
				
				String address = rs.getString("address");
				
				System.out.print(address + " ");	
				
				String gender = rs.getString("gender");
				
				System.out.println(gender + " ");					
				
			}
		}
	}
