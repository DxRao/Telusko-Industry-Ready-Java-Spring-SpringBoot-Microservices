package com.StudentPortal.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.StudentPortal.model.Model;

@WebServlet("/reg")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName=request.getParameter("uname");
		String city=request.getParameter("city");
		String country=request.getParameter("country");
		String password=request.getParameter("password");
		String confirmPassword=request.getParameter("cpassword");
		System.out.println(password + " : "+ confirmPassword);
		
		if(password.equals(confirmPassword))
		{
			Model model=new Model();
			model.setUserName(userName);
			model.setCity(city);
			model.setCountry(country);
			model.setPassword(confirmPassword);
			int row=model.register();
			if(row!=0)
			{
				System.out.println(row + " checking row in servlet");
				response.sendRedirect("/Servlet-07-MVCProject/registersuccess.html");
			}
			else
			{
				response.sendRedirect("/Servlet-07-MVCProject/registerfail.html");
			}
			
		}
		else
		{
			System.out.println("Password and confirm password not matching");
			response.sendRedirect("/Servlet-07-MVCProject/reregister.html");
		}
		
	}

}
