package com.StudentPortal.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.StudentPortal.model.Model;

@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
		System.out.println("Control is in login controller");
		
		String userName=request.getParameter("uname");
		String password=request.getParameter("password");
		Model model=new Model();
		model.setUserName(userName);
		
		model.setPassword(password);
		model.login();
		String dbuser=model.getUserName();
		String dbpassword=model.getPassword();
		
		if(userName.equals(dbuser) && password.equals(dbpassword))
		{
			response.sendRedirect("/Servlet-07-MVCProject/loginsuccess.jsp");
		}
		else
		{
			response.sendRedirect("/Servlet-07-MVCProject/loginfail.jsp");
		}

	}

}
