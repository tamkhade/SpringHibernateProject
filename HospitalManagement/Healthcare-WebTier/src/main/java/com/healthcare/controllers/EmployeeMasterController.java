package com.healthcare.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.healthcare.dto.EmployeeMasterFormModel;

@Controller
public class EmployeeMasterController 
{
	@RequestMapping(value = "myindex.hms")
	public String redirect(Model model) 
	{
		model.addAttribute("employeeMasterFormModel",new EmployeeMasterFormModel());
		return "list";
	}
}
