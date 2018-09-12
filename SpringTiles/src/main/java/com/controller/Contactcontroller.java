package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Model.Contact;
import com.Services.Tileservicesint;




@Controller
public class Contactcontroller {
	
	
	
	@Autowired
	Tileservicesint services;
	
	@RequestMapping(value="index")
	public String redirect(Model model)
	{
		
		Contact contact=new Contact();
		model.addAttribute("contactForm",contact);
		return "welcome.tiles";
		
		
	}
	
	
	
	@RequestMapping(value = "/insert.htm")
	public String insertform(Model model, @ModelAttribute Contact contact) {
		services.addContact(contact);
		return "redirect:index.htm";
	}

	
	
}



