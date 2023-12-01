package com.companyName.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDataInDatabase {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		//load and register the driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver is registered");
		
		String url="jdbc:mysql://localhost:3306/telusko";
		String userName="root";
		String password="***********";
		
		Connection connect=DriverManager.getConnection(url, userName, password);
		System.out.println("Connection established!");
		
		
		Statement stmt = connect.createStatement();
		
		String query="UPDATE Employee set age=18 where id=2";		
		
		int rowAffected=stmt.executeUpdate(query);
		
		System.out.println("Rows affected : "+ rowAffected);
		
		if(rowAffected!=0)
			System.out.println("Database Updated successfully!");		
		else
			System.out.println("Failed to update!");		
		
		stmt.close();
		connect.close();
	}
}
