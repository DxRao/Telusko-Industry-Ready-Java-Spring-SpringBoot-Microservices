package com.telusko.requestDispatch;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Control in First Servlet!");
		
//		RequestDispatcher reqDispatch = request.getRequestDispatcher("/SecondServlet");
//		reqDispatch.include(request, response);
		
//		ServletContext context = request.getServletContext();
//		RequestDispatcher req = context.getRequestDispatcher("/SecondServlet");
//		req.forward(request, response);
		
//		request.getServletContext().getRequestDispatcher("/SecondServlet").forward(request, response);
		
		request.getServletContext().getRequestDispatcher("/SecondServlet").include(request, response);
	
		
		response.sendRedirect("/Servlet-05/response1.html");
	}

}
