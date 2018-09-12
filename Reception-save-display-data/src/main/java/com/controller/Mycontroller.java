package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;



import com.model.Receptionist;
import com.service.IService;


@Controller


public class Mycontroller {
	@Autowired
	IService service;
	
	@RequestMapping(value = "index")
	public String registrationForm(Model model){
		
		
		Receptionist rec = new Receptionist();
	
		model.addAttribute("reception",rec);
		return "Recs";
	}

	
	
	@RequestMapping(value = "savereception")
	public String insertreception(Model model,@ModelAttribute("reception") Receptionist recp, BindingResult result)
	{
		Boolean flag =service.saveReception(recp);
		
		if (flag == false) {
			model.addAttribute("success", "Recp Save SuccessFully");
		} else {
			model.addAttribute("error", "Something went wrong..try again..!!");
		}

		return "redirect:index";
		
		
	}
	@ModelAttribute("receptionlist")
	public List<Receptionist> reception(){
		 return service.getReceptionList();
		
		
		
	}
	
	
	
	
	
}

