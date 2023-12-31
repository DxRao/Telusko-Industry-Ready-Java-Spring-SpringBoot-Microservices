package com.telusko.session;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Request2")
public class Request2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Control in 2nd servlet");
		PrintWriter writer=response.getWriter();
		
		HttpSession session = request.getSession(false);
		
		
		if(session!=null)
		{
		      Enumeration<String> en = session.getAttributeNames();
		      
		      while(en.hasMoreElements())
		      {
		    	  String vaccineInfo = en.nextElement();
		    	  Object name = session.getAttribute(vaccineInfo);
		    	  
		    	  writer.println("<h2>" +name + " : "+ vaccineInfo + "</h2>" );
		    	  
		    	  long creationTime=session.getCreationTime();
		    	  long lastActive=session.getLastAccessedTime();
		    	  
		    	  writer.println("<h2> Creation Time " + new Date(creationTime)+ "</h2>");
		    	  writer.println("<h2> Last Accessed Time " + new Date(lastActive)+ "</h2>");
		      }
		}
		else
		{
			writer.println("<h2> No session information available for this user </h2>");
		}
		
		writer.close();		
		
	}

}
