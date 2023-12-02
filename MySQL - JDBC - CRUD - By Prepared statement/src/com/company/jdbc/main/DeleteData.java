package com.company.jdbc.main;

import com.company.jdbc.util.JdbcUtility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteData{ 

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
						stmt=connect.prepareStatement("DELETE FROM Employee where id=?");
					}
					

					if(stmt!=null)
					{
						System.out.println("Welcome to my world!");
						
						scan=new Scanner(System.in);
						System.out.println("Please enter your id");
						Integer id=scan.nextInt();
						
						stmt.setInt(1, id);
						
						
						int rowAffected=stmt.executeUpdate();
						
						if(rowAffected != 0)
							System.out.println("Delete successfull");
						else
							System.out.println("Failed to delete!");						
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

