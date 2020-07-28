package com.luv2code.springdemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class formController {
	 @RequestMapping("showForm")
	public String getForm()
	{
		return "form";
	}
	 
	 @RequestMapping("getUserName")
	 public String showUserName(HttpServletRequest request, Model model)
	 {
		 model.addAttribute("ModelUserName",new StringBuilder(request.getParameter("UserName")).reverse());
		 return "UserName";
	 }
}
