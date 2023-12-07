package com.StudentPortal.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Model 
{
	private String userName;
	private String city;
	private String country;
	private String password;
	private Connection connect=null;
	private PreparedStatement pstmnt=null;
	private int row;
	private ResultSet rs=null;
	
	
	@Override
	public String toString() {
		return "Model [userName=" + userName + ", city=" + city + ", country=" + country + ", password=" + password
				+ "]";
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public int register()
	{
		  try 
		  {
			  System.out.println("Control in register");
			
			  connect=JdbcUtility1.getDBConnection();
			
			String sql="INSERT INTO studentportal (id, username, city, country, password)"
					+ "values(?,?,?,?,?)";
			
			if(connect!=null)
				pstmnt=connect.prepareStatement(sql);
			
			if(pstmnt!=null)
			{
			
			pstmnt.setInt(1, 1);
			pstmnt.setString(2, userName);
			pstmnt.setString(3, city);
			pstmnt.setString(4, country);
			pstmnt.setString(5, password);
			row=pstmnt.executeUpdate();
			
			System.out.println(row + " checking row in jdbc model");
			
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
				JdbcUtility1.closeResource(connect, pstmnt);
			} 
			  catch (SQLException e) 
			  {	
				e.printStackTrace();
			}
		  }
		  return row;
	}
	
	public void login()
	{
		  System.out.println("Control in login");
		try 
		{
			connect=JdbcUtility1.getDBConnection();
			String sql="SELECT username, password where username=?";
			if(connect!=null)
				pstmnt=connect.prepareStatement(sql);
			if(pstmnt!=null)
			{
				
			pstmnt.setString(1, userName);

			rs=pstmnt.executeQuery();
			System.out.println(row + " checking row in jdbc model");
			while(rs.next())
			{
				userName=rs.getString("username");
				password=rs.getString("password");
			}
			System.out.println("Done with login verification");
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
	}
	

}
