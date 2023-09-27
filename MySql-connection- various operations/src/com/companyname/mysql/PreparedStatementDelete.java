package com.companyname.mysql;

	import java.sql.*;

	import java.util.Scanner;
	
	public class PreparedStatementDelete {

		public static void main(String[] args) throws Exception {		
			  
			  int id = 0;			  
			  
			  Scanner sc  = new Scanner(System.in);
			  
			  System.out.println("Please enter your Id: ");
			  id = sc.nextInt();
			  sc.nextLine();			  		  
			  
			  sc.close();		 		
			
			Class.forName("com.mysql.cj.jdbc.Driver"); // Load and Register MySql JDBC Driver
			
			System.out.println("Driver loaded and registered successfully");
			
			String url = "jdbc:mysql://localhost:3306/telusko";
			
			Connection con = DriverManager.getConnection(url, "root", "*******");
			
			System.out.println("Connection to Database Telusko established");
			
			PreparedStatement psmt = con.prepareStatement("Delete from Employee where id=?");
			
			psmt.setInt(1, id);	
			
			
			int i = psmt.executeUpdate();
			
			if(i > 0) {
				
				System.out.println("Data deletion is successful");
				
			}
			else {
				
				System.out.println("Data deletion has failed");		
				
			}	

		}

	}
