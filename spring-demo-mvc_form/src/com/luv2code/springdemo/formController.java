package com.luv2code.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class formController {
	 @RequestMapping("/showForm")
	public String getForm()
	{
		return "form";
	}
	 
	 @RequestMapping("getUserName")
	 public String showUserName()
	 {
		 return "UserName";
	 }
}
