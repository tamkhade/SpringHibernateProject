package com.healthcare.controllers;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.healthcare.converter.EmployeeMasterFormConverter;
import com.healthcare.dto.EmployeeMasterFormModel;
import com.healthcare.services.OrgnizationUserMasterService;

@Controller
public class EmployeeMasterFormController 
{
	
	@Autowired
	OrgnizationUserMasterService orgnizationUserMasterService;
	
	@RequestMapping(value = "employeeMasterForm.hms")
	public String redirect(Model model) 
	{
		model.addAttribute("employeeMasterFormModel",new EmployeeMasterFormModel());
		return "EmployeeMaster";
	}
	
	@RequestMapping(value = "/saveEmployee.hms", method = RequestMethod.POST)
	public String saveEmployee(ModelMap map, @ModelAttribute("employeeMasterFormModel") EmployeeMasterFormModel employeeMasterFormModel,BindingResult bindingResult) throws ParseException
	{
		
		System.out.println("innn----");
		long result = orgnizationUserMasterService.saveOrgUser(EmployeeMasterFormConverter.convertEmployeeFormToEntity(employeeMasterFormModel));
		if (result == 1L) 
		{
			map.addAttribute("employeeMasterMsg", "Successfully saved");
		} else if (result == -1L) {
			map.addAttribute("employeeMasterMsg", "Somthing went wrong");
		}
		
		return "redirect:/employeeMasterForm.hms";
	}
}
