package com.luv2code.springdemo;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("formProcess")
public class formController {
	
	@RequestMapping("/showForm")
	public String getEmployee(Model model)
	{
		Employee emp= new Employee();
		model.addAttribute("emp",emp);
		return "emp-form";
	}
	@RequestMapping("/sendData")
	public String sendData(@ModelAttribute("emp") Employee emp)
	{
		return "confirm";
	}
}
