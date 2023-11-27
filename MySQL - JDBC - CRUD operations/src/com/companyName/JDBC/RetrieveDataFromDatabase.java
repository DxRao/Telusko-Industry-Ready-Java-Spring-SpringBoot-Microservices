package com.companyName.JDBC;

import java.sql.*;

public class RetrieveDataFromDatabase{

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		//load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver is registered");
		
		//Establish the connection		
		String url="jdbc:mysql://localhost:3306/telusko";
		String userName="root";
		String password="rao3mysql";
		
		Connection connect=DriverManager.getConnection(url, userName, password);
		System.out.println("Connection is established!");
		
		// Create Statement Object
		Statement stmt=connect.createStatement();
		System.out.println("Statement object is ready");
		
		// Write the Query String
		String query="select * from Employee";
		
		// Execute the Query to fetch or retrieve the data from database into ResultSet.
		ResultSet rs=stmt.executeQuery(query);
		
		System.out.println("We have got result set");
		
		// Print the data from ResultSet ... one by one row
		System.out.println("ID\tNAME\t\tAGE\tADDRESS\t\tGENDER");
		
		while(rs.next()){
		
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t"+
					rs.getInt(3) + "\t" + rs.getString(4) + "\t" + rs.getString(5));
		}
		
		// Close the open resources
		rs.close();
		stmt.close();
		connect.close();
	}
}