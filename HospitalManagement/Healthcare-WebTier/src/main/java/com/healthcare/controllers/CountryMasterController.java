package com.healthcare.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.healthcare.converter.CountryMasterConverter;
import com.healthcare.dto.CountryMasterFormModel;
import com.healthcare.services.AreaMasterServices;
import com.healthcare.services.CityMasterService;
import com.healthcare.services.CountryMasterService;
import com.healthcare.services.PincodeMasterService;
import com.healthcare.services.StateMasterService;

@Controller
public class CountryMasterController {

	@Autowired
	CountryMasterService countryMasterService;
	
	
	@RequestMapping(value="/country.hms")
	public String redirect(Model model)
	{
		model.addAttribute("countryForm", new CountryMasterFormModel());
		getCountryList();
		return "country";
		
	}
	
	@RequestMapping(value="/saveCountry.hms", method=RequestMethod.POST)
	public String addCountry(ModelMap modelMap, @ModelAttribute("countryForm") CountryMasterFormModel countryMasterFormModel, BindingResult bindingResult)
	{
		System.out.println("Copntroller");
		long result=0;
		try{
		result=countryMasterService.addCountry(CountryMasterConverter.countryMasterFormToEntity(countryMasterFormModel));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		if(result>0)
		{
			System.out.println("success");
			modelMap.addAttribute("msg1","successfully saved");
		}
		else
		{
			System.out.println("unsuccessful");
			modelMap.addAttribute("msg2", "failed");	
		}
		return "redirect:/country.hms";		
	}
	
	
	
	
	
	@RequestMapping(value="/deleteCountry.hms")
	public String  deleteCountry(ModelMap modelMap, @RequestParam long country_id)
	{
		boolean result=countryMasterService.deleteCountry(country_id);
		if(result)
		{
			System.out.println("success");
			modelMap.addAttribute("msg1","successfully deleted");
		}
		else
		{
			System.out.println("unsuccessful");
			modelMap.addAttribute("msg2", "failed");	
		}
		getCountryList();
		return "redirect:/country.hms";			
	}
	
	@RequestMapping(value="/getCountryById.hms")
	public String getCountryById(ModelMap modelMap, @RequestParam long country_id)
	{
		CountryMasterFormModel countryMasterFormModel=CountryMasterConverter.countryMasterEntityToForm(countryMasterService.getCountrybyId(country_id));
		modelMap.addAttribute("countryForm", countryMasterFormModel);
		return "country";		

	}
	
	
	@RequestMapping(value="/updateCountry.hms")
	public String updateCountry(ModelMap modelMap, @ModelAttribute("countryForm") CountryMasterFormModel countryMasterFormModel, BindingResult bindingResult)
	{
		long result=0L;;
		try{
		result=countryMasterService.updateCountry(CountryMasterConverter.countryMasterFormToEntity(countryMasterFormModel));
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
		System.out.println("update Controller"+result);		
		if(result>0)
		{
			System.out.println("Success");
			modelMap.addAttribute("msg1", "Successfully Updated");
		}
		else
		{
			System.out.println("Failed to update");
			modelMap.addAttribute("msg2", "Failed to update");
		}
		getCountryList();
		return "redirect:/country.hms";		
	}
	
	
	//FOR GETTING lIST OF COUNTRIES
	@ModelAttribute("getCountryList")
	public List<CountryMasterFormModel> getCountryList()
	{
		List<CountryMasterFormModel> countryMasterFormModels=CountryMasterConverter.countryMasterEntityToFormList(countryMasterService.countryMasterEntities());
		return countryMasterFormModels;
		
	}
	
	
	
}
