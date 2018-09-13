package com.healthcare.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.healthcare.converter.ConsultantViewConverter;
import com.healthcare.dto.ConsultantViewFormModel;
import com.healthcare.services.OrgnizationUserMasterService;

@Controller
public class ConsultantViewController 
{
	@Autowired
	OrgnizationUserMasterService orgnizationUserMasterService;

	//@RequestMapping(value = "index11.hms")
	public String redirect(Model model) {
		return "consultantView";
	}

	@ModelAttribute("consultantList")
	public List<ConsultantViewFormModel> getConsultantList() {

		return ConsultantViewConverter.convertEmployeeToEntity(orgnizationUserMasterService.getConsultantUsersService(2));

	}

}