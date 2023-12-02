package com.company.jdbc.main;

import com.company.jdbc.util.JdbcUtility; 

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class RetrieveOrFetchData{

	public static void main(String[] args) {
		
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
						stmt=connect.prepareStatement("SELECT * FROM Employee where id = ?");
					}
					

					if(stmt!=null)
					{
						System.out.println("Welcome to my world!");
						
						scan=new Scanner(System.in);
						System.out.println("Please enter your id");
						Integer id = scan.nextInt();		
				
						stmt.setInt(1, id); 
						rs=stmt.executeQuery();
						
						if(rs!=null)
						{
							System.out.println("ID\tNAME\tAGE\tAddress\tGENDER");
							while(rs.next())
							{
								System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t"+
							  rs.getInt(3) + "\t" + rs.getString(4) + "\t" + rs.getString(5));
								//Integer i=rs.getInt(1);
								
							}
						}
						
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

