package com.telusko.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/controller2")
public class SecondController {
	
	@GetMapping("/skill")
	public String someMessage2(Model model)
	{
		System.out.println("Model is Implemented by "+ model.getClass().getName());
		model.addAttribute("message", "Focus is the key second Controller");
		
		return "focus";//lvn
	}

}
