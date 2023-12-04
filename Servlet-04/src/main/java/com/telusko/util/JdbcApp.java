package com.telusko.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class JdbcApp 
{
	private Integer id;
    private String vaccineName;
    private String vaccineCompany;
    private Integer cost;
    private int row;
    
    String query="INSERT INTO vaccinedetails (id, vaccinename, vaccinecompany, price)"
    		+ "values(?,?,?,?)";
	private Connection connect=null;
	private PreparedStatement pstmnt=null ;
    
    public int getRow() {
		return row;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getVaccineName() {
		return vaccineName;
	}
	public void setVaccineName(String vaccineName) {
		this.vaccineName = vaccineName;
	}
	public String getVaccineCompany() {
		return vaccineCompany;
	}
	public void setVaccineCompany(String vaccineCompany) {
		this.vaccineCompany = vaccineCompany;
	}
	public Integer getCost() {
		return cost;
	}
	public void setCost(Integer cost) {
		this.cost = cost;
	}

 
    public void jdbcRegister()
    {
    	try 
    	{
    		System.out.println(id + vaccineName + vaccineCompany );
		 connect = JdbcUtility.getDBConnection();
		 
		
		if(connect!=null)
			 pstmnt=connect.prepareStatement(query);
			
			if(pstmnt!=null)
			{
				pstmnt.setInt(1, 46);
				pstmnt.setString(2, vaccineName);
				pstmnt.setString(3, vaccineCompany);				
				pstmnt.setInt(4, cost);			
		    
				boolean status=pstmnt.execute();
				System.out.println(status);
		   
				if(status)
				{
					System.out.println("Ignore ");
				}
				else
				{
					row= pstmnt.getUpdateCount();
				}
		   
				System.out.println(row + " row checked at jdbc");		    	
			}
    	}		 
	  
    	catch (SQLException e) 
    	{
		
    		e.printStackTrace();
	    }
    	finally
    	{
    		try 
    		{
    			JdbcUtility.closeResource(connect, pstmnt);			
    		} 
    		catch (SQLException e) 
    		{		
    			e.printStackTrace();
    		}
 	  
    	}
		
    }
}