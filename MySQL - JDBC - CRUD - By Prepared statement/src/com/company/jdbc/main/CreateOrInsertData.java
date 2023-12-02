package com.company.jdbc.main;

import com.company.jdbc.util.JdbcUtility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CreateOrInsertData {

	public static void main(String[] args)	{
		
		Connection connect=null;
		PreparedStatement stmt=null;
		Scanner scan=null;
		ResultSet rs=null;
		
		try 
		{
			connect=JdbcUtility.getDBConnection();
			if(connect!=null)
			{
				String query="INSERT INTO Employee (id, fname, age, address, gender) "
						+ "VALUES ( ?,?,?,?,? )";
				stmt=connect.prepareStatement(query);
			}
			if(stmt!=null)
			{
				System.out.println("Welcome to my world!");
				
				scan=new Scanner(System.in);
				System.out.println("Please enter your id");
				Integer id=scan.nextInt();
				System.out.println("Please enter your name");
				String fname=scan.next();
				System.out.println("Please enter your age");
				Integer age=scan.nextInt();
				System.out.println("Please enter your city");
				String city=scan.next();
				scan.nextLine();
				System.out.println("Please enter your gender");
				String gender=scan.next();
				
				stmt.setInt(1, id);
				stmt.setString(2, fname);
				stmt.setInt(3, age);
				stmt.setString(4, city);
				stmt.setString(5, gender);
				
				int rowAffected=stmt.executeUpdate();
				
				if(rowAffected!=0)
					System.out.println("Registration successfull");
				else
					System.out.println("Failed to register!");
			}
		} 
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
		catch (Exception e) 
		{
			
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				JdbcUtility.closeResource(connect, stmt, rs);
			} 
			catch (SQLException e) 
			{				
				e.printStackTrace();
			}
		}

	}

}
