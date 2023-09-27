package com.companyname.mysql;

	import java.sql.*;

	import java.util.Scanner;
	
	public class PreparedStatementUpdate {

		public static void main(String[] args) throws Exception {		
			  
			  int id = 0; 
			  String fname = ""; 
			  
			  
			  Scanner sc  = new Scanner(System.in);
			  
			  System.out.println("Please enter your Id: ");
			  id = sc.nextInt();
			  sc.nextLine();
			  
			  System.out.println("Please enter your First name: ");
			  fname = sc.nextLine();			  
			  
			  sc.close();		 		
			
			Class.forName("com.mysql.cj.jdbc.Driver"); // Load and Register MySql JDBC Driver
			
			System.out.println("Driver loaded and registered successfully");
			
			String url = "jdbc:mysql://localhost:3306/telusko";
			
			Connection con = DriverManager.getConnection(url, "root", "*******");
			
			System.out.println("Connection to Database Telusko established");
			
			PreparedStatement psmt = con.prepareStatement("update Employee set fname=? where id=?");
			
			
			psmt.setString(1, fname);
			psmt.setInt(2, id);		
			
			
			
			int i = psmt.executeUpdate();
			
			if(i > 0) {
				
				System.out.println("Data Update is successful");
				
			}
			else {
				
				System.out.println("Data Update has failed");		
				
			}	

		}

	}
