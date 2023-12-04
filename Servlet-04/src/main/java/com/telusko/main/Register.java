package com.telusko.main;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.telusko.util.JdbcApp;
import com.telusko.util.JdbcUtility;


@WebServlet("/Register")
public class Register extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
       String vaccineName= request.getParameter("vname");
       String vaccineCompany= request.getParameter("vcompany");
       String cost= request.getParameter("cost");
       
       System.out.println(vaccineName + " , "+ vaccineCompany + " , "+ cost);
       JdbcApp app=new JdbcApp();
       
       app.setCost(Integer.parseInt(cost));       
       app.setId(44);
       app.setVaccineName(vaccineName);
       app.setVaccineCompany(vaccineCompany);
       
       app.jdbcRegister();
       
       System.out.println("Register invoked");       
		    
		    int row=app.getRow();
		    
		    if(row!=0)
		    {
		    	response.sendRedirect("/Servlet-04/success.jsp");
		    }
		    else
		    {
		    	response.sendRedirect("/Servlet-04/fail.jsp");
		    }
		    	
		}		
    	  
      }
       



