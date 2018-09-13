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

import com.healthcare.converter.PinCodeMasterConverter;
import com.healthcare.dto.PinCodeMasterFormModel;
import com.healthcare.services.PincodeMasterService;

@Controller
public class PinCodeMasterController {
	
	@Autowired
	PincodeMasterService pincodeMasterService;
	

	@RequestMapping(value="/pincode.hms")
	public String redirect(Model model)
	{
		model.addAttribute("pincodeForm", new PinCodeMasterFormModel());
		getPincodeList();
		return "pincode";
		
	}
	
	@RequestMapping(value="/savePincode.hms", method=RequestMethod.POST)
	public String addPinCode(ModelMap modelMap, @ModelAttribute("pincodeForm") PinCodeMasterFormModel pinCodeMasterFormModel, BindingResult bindingResult)
	{
		System.out.println("Controller");
		long result=0;
		try{
		result=pincodeMasterService.addPincode(PinCodeMasterConverter.pincodeMasterFormToEntity(pinCodeMasterFormModel));
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
		return "redirect:/pincode.hms";		
	}
	
	
	@ModelAttribute("getPincodeList")
	public List<PinCodeMasterFormModel> getPincodeList()
	{
		List<PinCodeMasterFormModel> pinCodeMasterFormModels=PinCodeMasterConverter.pincodeMasterEntityToFormList(pincodeMasterService.pincodeMasterEntities());
		return pinCodeMasterFormModels;
		
	}
	
	
	@RequestMapping(value="/deletePincode.hms")
	public String  deletePincode(ModelMap modelMap, @RequestParam long pincode_id)
	{
		boolean result=pincodeMasterService.deletePincode(pincode_id);
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
		getPincodeList();
		return "redirect:/pincode.hms";			
	}
	
	@RequestMapping(value="/getPincodeById.hms")
	public String getPincodeById(ModelMap modelMap, @RequestParam long pincode_id)
	{
		PinCodeMasterFormModel pinCodeMasterFormModel=PinCodeMasterConverter.pincodeMasterEntityToForm(pincodeMasterService.getPincodebyId(pincode_id));
		modelMap.addAttribute("pincodeForm", pinCodeMasterFormModel);
		return "pincode";		

	}
	
	
	@RequestMapping(value="/updatePinCode.hms")
	public String updatePinCode(ModelMap modelMap, @ModelAttribute("pincodeForm") PinCodeMasterFormModel pinCodeMasterFormModel, BindingResult bindingResult)
	{
		long result=0L;;
		try{
		result=pincodeMasterService.updatePincode(PinCodeMasterConverter.pincodeMasterFormToEntity(pinCodeMasterFormModel));
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
		getPincodeList();
		return "redirect:/pincode.hms";		
	}
	
}
