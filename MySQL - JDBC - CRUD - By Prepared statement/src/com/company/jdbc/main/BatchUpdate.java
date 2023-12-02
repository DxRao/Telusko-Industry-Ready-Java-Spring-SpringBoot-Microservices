package com.company.jdbc.main;

import java.sql.*;


import com.company.jdbc.util.JdbcUtility;

public class BatchUpdate 
{

	public static void main(String[] args) 
	{
			
		//Resource
		Connection connect=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		
		
		try
		{
			connect=JdbcUtility.getDBConnection();
			if(connect!=null)
			{
				String query="UPDATE Employee set address=? where id=? ";
				stmt=connect.prepareStatement(query);
			}
			if(stmt!=null)
			{
			
				
				stmt.setString(1, "Mysuru");
				stmt.setInt(2, 1);
				stmt.addBatch();
				
				stmt.setString(1, "chennai");
				stmt.setInt(2, 2);
				stmt.addBatch();
				
				stmt.setString(1, "pune");
				stmt.setInt(2, 3);
				stmt.addBatch();
				
				int[] rowsAffected  = stmt.executeBatch();
				
				int count = 0;
				
				for(int arr : rowsAffected) {
					
					count = count + arr;					
				}
				
				System.out.println("Number of rows updated are: " + count);				
				
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

