package com.controller;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.Employee;
import com.model.EmployeeValidation;

@Controller
public class EmployeeController 
{
   @RequestMapping("/index")
   public String registratinPage(Model model) 
   {
		model.addAttribute("EmployeeForm", new Employee());
		return "registration";
		
   }

	
@RequestMapping(value = "/registerUser", method = RequestMethod.POST)
public String saveUser(Model model,	@ModelAttribute("EmployeeForm") @Valid Employee employee,
			BindingResult result) 
 {

		if (result.hasErrors()) 
		{
			model.addAttribute("EmployeeForm", employee);
			return "registration";
		} 
		else 
		{
			return "welcome";
		}

	}

	@InitBinder("EmployeeForm")
	private void initBinder(WebDataBinder binder) 
	{
		EmployeeValidation employeeValidation = new EmployeeValidation();
		binder.setValidator(employeeValidation);
	}

    @ModelAttribute("country")	
	public Map<String, String> getCountry()
	{
		Map<String, String> country= new LinkedHashMap<String, String>();
		
		country.put("NONE", "NONE");
		country.put("United Stated", "United Stated");
		country.put("india","india");
		
		return country;
	}
	
	

	
}
