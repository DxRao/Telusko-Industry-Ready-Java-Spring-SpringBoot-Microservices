package com.company.jdbc.main;

import com.company.jdbc.util.JdbcUtility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateData{ 

	public static void main(String[] args){
		
		//Resources
				Connection connect=null;
				PreparedStatement stmt=null;
				ResultSet rs=null;
				Scanner scan=null;
				
				try
				{					
					connect=JdbcUtility.getDBConnection();
					
					if(connect!=null)
					{
						stmt=connect.prepareStatement("UPDATE Employee set age=? where id=?");
					}
					

					if(stmt!=null)
					{
						System.out.println("Welcome to my world!");
						
						scan=new Scanner(System.in);
						System.out.println("Please enter your id");
						Integer id=scan.nextInt();
						System.out.println("Please enter your age to be updated");
						Integer age=scan.nextInt();
						
						stmt.setInt(1, age);
						stmt.setInt(2, id);
						
						int rowAffected=stmt.executeUpdate();
						
						if(rowAffected != 0)
							System.out.println("Update successfull");
						else
							System.out.println("Failed to update!");						
					}						
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
				catch(Exception e)
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