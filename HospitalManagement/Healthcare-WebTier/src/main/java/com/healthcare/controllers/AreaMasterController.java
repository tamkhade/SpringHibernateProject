package com.healthcare.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.healthcare.converter.AreaMasterConverter;
import com.healthcare.converter.CityMasterConverter;
import com.healthcare.converter.PinCodeMasterConverter;
import com.healthcare.dto.AreaMasterFormModel;
import com.healthcare.dto.CityMasterFormModel;
import com.healthcare.dto.PinCodeMasterFormModel;
import com.healthcare.services.AreaMasterServices;
import com.healthcare.services.CityMasterService;
import com.healthcare.services.PincodeMasterService;


@Controller
public class AreaMasterController {

	@Autowired
	AreaMasterServices areaMasterServices;
	
	@Autowired
	CityMasterService cityMasterservice;
	
	@Autowired
	PincodeMasterService pincodeMasterService;
	
	@RequestMapping(value="/area.hms")
	public String redirect(Model model)
	{
		model.addAttribute("areaForm", new AreaMasterFormModel());
		getAreaList();
		return "area";
		
	}
	
	@RequestMapping(value="/saveArea.hms", method=RequestMethod.POST)
	public String addArea(ModelMap modelMap, @ModelAttribute("areaForm") AreaMasterFormModel areaMasterFormModel, BindingResult bindingResult)
	{
		System.out.println("Controller");
		long result=0;
		try{
		result=areaMasterServices.addArea(AreaMasterConverter.areaMasterFormToEntity(areaMasterFormModel));
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
		return "redirect:/area.hms";		
	  }
	
	
		@ModelAttribute("getAreaList")
		public List<AreaMasterFormModel> getAreaList()
		{
			List<AreaMasterFormModel> areaMasterFormModels=AreaMasterConverter.areaMasterEntityToFormList(areaMasterServices.areaMasterEntities());
			return areaMasterFormModels;
			
		}
	
	
	
	@RequestMapping(value="/deleteArea.hms")
	public String  deleteArea(ModelMap modelMap, @RequestParam long area_id)
	{
		boolean result=areaMasterServices.deleteArea(area_id);
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
		getAreaList();
		return "redirect:/area.hms";			
	}
	
	@RequestMapping(value="/getAreaById.hms")
	public String getAreaById(ModelMap modelMap, @RequestParam long area_id)
	{
		AreaMasterFormModel areaMasterFormModel=AreaMasterConverter.areaMasterEntityToForm(areaMasterServices.getAreabyId(area_id));
		modelMap.addAttribute("areaForm", areaMasterFormModel);
		return "area";		

	}
	
	
	@RequestMapping(value="/updateArea.hms")
	public String updateArea(ModelMap modelMap, @ModelAttribute("areaForm") AreaMasterFormModel areaMasterFormModel, BindingResult bindingResult)
	{
		long result=0L;;
		try{
		result=areaMasterServices.updateArea(AreaMasterConverter.areaMasterFormToEntity(areaMasterFormModel));
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
		getAreaList();
		return "redirect:/area.hms";		
	}
	

	//get dropdown list for City
	@ModelAttribute(value="getCityList")
	public Map<Long,String> getCityList() {

		List<CityMasterFormModel> cityMasterFormModels=CityMasterConverter.cityMasterEntityToFormList(cityMasterservice.cityMasterEntities());
		
		Map<Long, String> cities = new HashMap<Long, String>();
		for (CityMasterFormModel cityMasterFormModel :cityMasterFormModels) 
		{
			System.out.println("cnm" + cityMasterFormModel.getCity_name());
			cities.put(cityMasterFormModel.getCity_id(), cityMasterFormModel.getCity_name());
		}
		return cities;
	}
	
	//get dropdown list for pincode
	@ModelAttribute(value="getPinCodeList")
	public Map<Long,String> getPinCodeList() {

		List<PinCodeMasterFormModel> pinCodeMasterFormModels=PinCodeMasterConverter.pincodeMasterEntityToFormList(pincodeMasterService.pincodeMasterEntities());
		
		Map<Long, String> pincodes = new HashMap<Long, String>();
		for (PinCodeMasterFormModel pinCodeMasterFormModel :pinCodeMasterFormModels) 
		{
			System.out.println("Pin code no." + pinCodeMasterFormModel.getPincode_number());
			pincodes.put(pinCodeMasterFormModel.getPincode_id(), pinCodeMasterFormModel.getPincode_number());
		}
		return pincodes;
	}
	
}