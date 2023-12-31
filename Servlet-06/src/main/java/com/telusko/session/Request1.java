package com.telusko.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Request1")
public class Request1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter writer=response.getWriter();
        
        response.setContentType("text/html");
       HttpSession session = request.getSession();
       if(session.isNew())
       {
    	  writer.println("<h2>New session created with id : "+ session.getId() + "</h2>");
       }
       else
       {
    	   writer.println("<h2> existing session is being used with id : "+ session.getId()+ "</h2>");
       }
		
		String vaccineName=request.getParameter("vname");
		String vaccineCompany=request.getParameter("vcompany");
		System.out.println(vaccineName + " : "+ vaccineCompany);
		
		session.setAttribute(vaccineName, vaccineCompany);
		session.setMaxInactiveInterval(60);
		request.getRequestDispatcher("/Request2").forward(request, response);
		
		writer.close();
		
		
	}

}
