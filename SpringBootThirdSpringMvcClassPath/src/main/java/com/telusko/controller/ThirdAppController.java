package com.telusko.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/controller1")
public class ThirdAppController {
	 
	 @GetMapping("/cp")
     public String displayMessage2(Map<String, Object> model)
     {
		 model.put("msg", "Context Path Application");
		 return "home";
     }
}
