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

import com.healthcare.converter.ConsultantMasterFormConverter;
import com.healthcare.converter.EmployeeMasterFormConverter;
import com.healthcare.dto.ConsultantMasterFormModel;
import com.healthcare.dto.EmployeeMasterFormModel;
import com.healthcare.services.OrgnizationUserMasterService;

@Controller
public class ConsultantMasterFormController 
{
	@Autowired
	OrgnizationUserMasterService orgnizationUserMasterService;
	
	@RequestMapping(value = "consultantForm.hms")
	public String redirect(Model model) 
	{
		model.addAttribute("consultantMasterFormModel",new ConsultantMasterFormModel());
		return "ConsultantMaster";
	}
	
	@RequestMapping(value = "/saveConsultant.hms", method = RequestMethod.POST)
	public String saveEmployee(ModelMap map, @ModelAttribute("consultantMasterFormModel") ConsultantMasterFormModel consultantMasterFormModel,BindingResult bindingResult) throws ParseException
	{
		
		System.out.println("innn----");
		long result = orgnizationUserMasterService.saveOrgUser(ConsultantMasterFormConverter.convertConsultantMasterFormToEntity(consultantMasterFormModel));
		if (result == 1L) 
		{
			map.addAttribute("consultantMasterMsg", "Successfully saved");
		} else if (result == -1L) {
			map.addAttribute("consultantMasterMsg", "Somthing went wrong");
		}
		
		return "redirect:/consultantForm.hms";
	}

}
