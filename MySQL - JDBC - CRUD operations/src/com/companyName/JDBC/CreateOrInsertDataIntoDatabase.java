package com.companyName.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateOrInsertDataIntoDatabase{

	public static void main(String[] args) throws ClassNotFoundException, SQLException{ 
	
		        //load and register the driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Driver is registered");
				
				//Establish the connection
				
				String url="jdbc:mysql://localhost:3306/telusko";
				String userName="root";
				String password="password";
				
				Connection connect=DriverManager.getConnection(url, userName, password);
				System.out.println("Connection established!");
				
				Statement stmt = connect.createStatement();
				String query="INSERT INTO Employee (ID, fname, age, address, gender)"
						+ "VALUES(4, 'Shramik', 22, 'kolhapur', 'M')";
				
				int rowAffected=stmt.executeUpdate(query);
				System.out.println("Query is fine!");
				
				if(rowAffected != 0)
					System.out.println("Check db! Data has been added");
				else
					System.out.println("Failed to add data");				
				
				stmt.close();
				connect.close();
	}
}
