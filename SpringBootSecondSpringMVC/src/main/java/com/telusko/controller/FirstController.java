package com.telusko.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/controller1")
public class FirstController 
{ 
	@RequestMapping(value="/welcome", method=RequestMethod.GET)
	public String someMessage(Model model)
	{
		System.out.println("Model is Implemented by "+ model.getClass().getName());
		model.addAttribute("name", "Navin"); // Key=name; value="Navin"
		
		return "home";//lvn
	}
	
	@GetMapping("/welcome2")
	public String someMessage2(Model model)
	{
		System.out.println("Model is Implemented by "+ model.getClass().getName());
		model.addAttribute("name", "Ashim"); // Key=name; value="Ashim"
		
		return "home";//lvn -> logical view name
	}
	
//	@PostMapping("/skill")
//	public String someImportantMessage(Model model)
//	{
//		System.out.println("Model is Implemented by "+ model.getClass().getName());
//		model.addAttribute("message", "Focus is very important");// key =message; value="Focus is very important"
//		
//		return "focus";//lvn
//	}
	@GetMapping("/skill")
	public String someImportantMessage(Model model)
	{
		System.out.println("Model is Implemented by "+ model.getClass().getName());
		model.addAttribute("message", "Focus is very important 1st Controller"); 
		// Key=message; value="Focus is very important 1st Controller"
		
		return "focus";//lvn
	}
	
	@GetMapping("/alien")
	public String someMessages(Map<String, Object> model)
	{
		model.put("name", "Tabish"); // Key=name; value="Tabish"
		return "home";//lvn
	}
	
//	@GetMapping("/telusko") // didn't work
//	public void someInfo(Map<String, Object> model)
//	{
//		model.put("name", "Manju");
//		return ;
//	}
	
	@GetMapping("/telusko")
	public String someInfo(Map<String, Object> model)
	{
		model.put("name", "Manju"); // Key=name; value="Manju"
		return "telusko" ;
	}

}
