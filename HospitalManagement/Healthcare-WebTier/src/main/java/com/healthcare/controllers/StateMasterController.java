package com.healthcare.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.healthcare.converter.CountryMasterConverter;
import com.healthcare.converter.StateMasterConverter;
import com.healthcare.dto.CountryMasterFormModel;
import com.healthcare.dto.StateMasterFormModel;
import com.healthcare.entities.StateMasterEntity;
import com.healthcare.services.CountryMasterService;
import com.healthcare.services.StateMasterService;

@Controller
public class StateMasterController {
	
	@Autowired
	CountryMasterService countryMasterService;
	
	@Autowired
	StateMasterService stateMasterService;
	
	
	@RequestMapping(value="/state.hms")
	public String redirect(ModelMap modelMap)
	{
		modelMap.addAttribute("stateForm", new StateMasterFormModel());
		getStateList();
		return "state";		
	}
	
	@RequestMapping(value="/saveState")
	public String addState(ModelMap modelMap, @ModelAttribute("stateForm") StateMasterFormModel stateMasterFormModel,BindingResult bindingResult)
	{
		long result=0;
		try{
			result=stateMasterService.addState(StateMasterConverter.stateMasterFormToEntity(stateMasterFormModel));
		}
		catch (Exception e) {
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
		getStateList();
		return "redirect:/state.hms";
		
	}
	@ModelAttribute(value="getStateList")
	public  List<StateMasterFormModel> getStateList()
	{
		List<StateMasterFormModel> stateMasterFormModels=StateMasterConverter.stateMasterEntityToFormList(stateMasterService.stateMasterEntities());
		return stateMasterFormModels;
	}
	
	@RequestMapping(value="/deleteState.hms")
	public String  deleteState(ModelMap modelMap, @RequestParam String state)
	{
		System.out.println("State"+state);
		stateMasterService.deleteState("state");
		/*if(result)
		{
			System.out.println("success");
			modelMap.addAttribute("msg1","successfully deleted");
		}
		else
		{
			System.out.println("unsuccessful");
			modelMap.addAttribute("msg2", "failed");	
		}*/
		getStateList();
		return "redirect:/state.hms";			
	}
	
	/*@RequestMapping(value="/deleteState.hms")
	public String  deleteState(ModelMap modelMap,  @ModelAttribute("stateForm") StateMasterEntity stateMasterEntity)
	{
		stateMasterService.deleteState(stateMasterEntity);
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
		getStateList();
		return "redirect:/state.hms";			
	}*/
	@RequestMapping(value="/getStateById.hms")
	public String getStateById(ModelMap modelMap, @RequestParam long state_id)
	{
		StateMasterFormModel stateMasterFormModel=StateMasterConverter.stateMasterEntityToForm(stateMasterService.getStateById(state_id));
		modelMap.addAttribute("stateForm", stateMasterFormModel);
		return "state";		
	}
	
	@RequestMapping(value="/updateState.hms")
	public String updateState(ModelMap modelMap, @ModelAttribute("stateForm") StateMasterFormModel stateMasterFormModel, BindingResult bindingResult)
	{
		long result=0L;;
		try{
		result=stateMasterService.updateState(StateMasterConverter.stateMasterFormToEntity(stateMasterFormModel));
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
		getStateList();
		return "redirect:/state.hms";		
	}
	
	
	//for getting Country dropdown
	
	@ModelAttribute(value="getcountryMasterList")
	public Map<Long,String> getcountryMasterList() {

		List<CountryMasterFormModel> countryMasterFormModels=CountryMasterConverter.countryMasterEntityToFormList(countryMasterService.countryMasterEntities());
		
		Map<Long, String> countries = new HashMap<Long, String>();
		for (CountryMasterFormModel countryMasterFormModel :countryMasterFormModels) 
		{
			System.out.println("cnm" + countryMasterFormModel.getCountry_name());
			countries.put(countryMasterFormModel.getCountry_id(), countryMasterFormModel.getCountry_name());
		}
		return countries;
	}	
	
}
