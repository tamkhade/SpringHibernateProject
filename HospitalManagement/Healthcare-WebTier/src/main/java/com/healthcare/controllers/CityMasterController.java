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

import com.healthcare.converter.CityMasterConverter;
import com.healthcare.converter.StateMasterConverter;
import com.healthcare.dto.CityMasterFormModel;
import com.healthcare.dto.StateMasterFormModel;
import com.healthcare.services.CityMasterService;
import com.healthcare.services.StateMasterService;

@Controller
public class CityMasterController {

	@Autowired
	CityMasterService cityMasterservice;
	
	@Autowired
	StateMasterService stateMasterService;
	
	
	
	@RequestMapping(value="/city.hms")
	public String redirect(ModelMap modelMap)
	{
		modelMap.addAttribute("cityForm", new CityMasterFormModel());
		getCityList();
		return "city";		
	}
	
	@RequestMapping(value="/saveCity")
	public String addCity(ModelMap modelMap, @ModelAttribute("cityForm") CityMasterFormModel cityMasterFormModel,BindingResult bindingResult)
	{
		long result=0;
		try{
			result=cityMasterservice.addCity(CityMasterConverter.cityMasterFormToEntity(cityMasterFormModel));
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
		getCityList();
		return "redirect:/city.hms";
		
	}
	@ModelAttribute(value="getCityList")
	public  List<CityMasterFormModel> getCityList()
	{
		List<CityMasterFormModel> cityMasterFormModels=CityMasterConverter.cityMasterEntityToFormList(cityMasterservice.cityMasterEntities());
		return cityMasterFormModels;
	}
	
	@RequestMapping(value="/deleteCity.hms")
	public String  deleteCity(ModelMap modelMap, @RequestParam long city_id)
	{
		boolean result=cityMasterservice.deleteCity(city_id);
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
		getCityList();
		return "redirect:/city.hms";			
	}
	
	@RequestMapping(value="/getCityById.hms")
	public String getCityById(ModelMap modelMap, @RequestParam long city_id)
	{
		CityMasterFormModel cityMasterFormModel=CityMasterConverter.cityMasterEntityToForm(cityMasterservice.getCityById(city_id));
		modelMap.addAttribute("cityForm", cityMasterFormModel);
		return "city";		
	}
	
	@RequestMapping(value="/updateCity.hms")
	public String updateCity(ModelMap modelMap, @ModelAttribute("cityForm") CityMasterFormModel cityMasterFormModel, BindingResult bindingResult)
	{
		long result=0L;;
		try{
		result=cityMasterservice.updateCity(CityMasterConverter.cityMasterFormToEntity(cityMasterFormModel));
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
		getCityList();
		return "redirect:/city.hms";		
	}
	
	//for getting states dropdown
	
		@ModelAttribute(value="getstateMasterList")
		public Map<Long,String> getstateMasterList() {

			List<StateMasterFormModel> stateMasterFormModels=StateMasterConverter.stateMasterEntityToFormList(stateMasterService.stateMasterEntities());
			
			Map<Long, String> states = new HashMap<Long, String>();
			for (StateMasterFormModel stateMasterFormModel :stateMasterFormModels) 
			{
				System.out.println("state_name" + stateMasterFormModel.getState_name());
				states.put(stateMasterFormModel.getState_id(), stateMasterFormModel.getState_name());
			}
			return states;
		}	
}
