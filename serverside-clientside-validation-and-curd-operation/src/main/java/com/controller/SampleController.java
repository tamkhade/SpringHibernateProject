package com.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jarvis.validation.model.Samplevalidator;
import com.model.Samplemodel;
import com.service.Sampleservice;




@SuppressWarnings("deprecation")
@Controller
public class SampleController{

	public int idss=0;
	
	
	@Autowired
	Sampleservice sampleservice;
	
	@InitBinder("sample")
	public void formBinder(WebDataBinder webDataBinder) {
		final Samplevalidator userValidation=new Samplevalidator();
		webDataBinder.setValidator(userValidation);
	}
	
	@RequestMapping(value="index",method=RequestMethod.GET)
	public String redirect(Model model,@ModelAttribute Samplemodel samplemodel)
	{
		if(idss>0)
		{
			model.addAttribute("sample",samplemodel);
			model.addAttribute("success","suceesfully saved");
			return "registration";	
		}
			
		model.addAttribute("sample",samplemodel);
		return "registration";
	}
	
	@SuppressWarnings("unused")
	@RequestMapping(value="/saveemp.htm")
    public String savedata(Model model, @ModelAttribute("sample") @Valid Samplemodel samplemodel,BindingResult bindingResult)	{
	if(bindingResult.hasErrors())
	{
		model.addAttribute("sample",samplemodel);
		return "registration";
	}else
	{
		@SuppressWarnings("unused")
		boolean result=sampleservice.savedata(samplemodel);
		idss=samplemodel.getMaster_id();
		if(result=true)
		{
			model.addAttribute("success","suceesfully saved");
			return "redirect:/index.htm";
		}else
		{
			model.addAttribute("error","unsuccessfull saved");
			return "redirect:/index.htm";
		}
	}
	
	}
	
	@ModelAttribute("list")
	public List<Samplemodel> listof()
	{
		  List<Samplemodel> samplemodels=sampleservice.samplList();
		  return samplemodels;	
	}
	
	@RequestMapping(value="/edit.htm")
	public String editthevalue(Model model,@RequestParam int id,@ModelAttribute Samplemodel samplemodel)
	{
		Samplemodel samplemodels=sampleservice.editname(id);
		model.addAttribute("sample",samplemodels);
		return "registration";
	}
	
	
	@RequestMapping(value="/delete.htm")
	public String deletesample(Model model,@RequestParam int id,@ModelAttribute Samplemodel samplemodel)
	{
		@SuppressWarnings("unused")
		boolean result=sampleservice.deleted(id);
		if(result=true)
		{
			model.addAttribute("success","suceesfully deleted");
			
		}else if(result=false)
		{
		 model.addAttribute("error","successfully not deleted"); 	
		}
		model.addAttribute("sample",samplemodel);
		return "forward:/index.htm";
		
	}
}
