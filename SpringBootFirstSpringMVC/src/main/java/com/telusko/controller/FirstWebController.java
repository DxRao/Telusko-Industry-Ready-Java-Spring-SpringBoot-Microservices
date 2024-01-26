package com.telusko.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstWebController 
{
	  
	 @RequestMapping("/welcome")
     public ModelAndView displayMessage()
     {
    	 ModelAndView mav=new ModelAndView();
    	 mav.addObject("message", "Welcome to Telusko Learning");
    	 mav.setViewName("index");//LVN
    	 
    	 return mav;   	 
    	 
     }
}
