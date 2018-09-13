package com.healthcare.controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.healthcare.converter.ReferralMasterConverter;
import com.healthcare.dto.ReferralMasterModel;
import com.healthcare.entities.MarketPersonMaster;
import com.healthcare.entities.ReferenceTypeMaster;
import com.healthcare.entities.ReferralMaster;
import com.healthcare.services.MarketPersonMasterService;
import com.healthcare.services.ReferenceTypeMasterService;
import com.healthcare.services.ReferralMasterService;

@Controller
public class RefferalMasterController {

		@Autowired
		ReferralMasterService referralMasterService;
				
		@Autowired
		ReferenceTypeMasterService referenceTypeMasterService;
		
		@Autowired
		MarketPersonMasterService marketPersonMasterService;
		
		
		
		@RequestMapping(value = "std.hms")
		public String redirect(Model model) {
			ReferralMasterModel referralMasterModel = new ReferralMasterModel();
			model.addAttribute("referralMasterModel", referralMasterModel);
			return "ReferralMaster";
		}
		
		@RequestMapping(value = "/getRefferalMaster.hms", method = RequestMethod.POST)
		public String getEmployeeRegisterPage(ModelMap map, @ModelAttribute ReferralMasterModel referralMasterModel,
				BindingResult bindingResult) {

			@SuppressWarnings("unused")
			long result = referralMasterService.referralsave(ReferralMasterConverter.convertFormToEnitity(referralMasterModel));
			

			
			return "redirect:std.hms";
		}
		
		@ModelAttribute("referencetypemasterList")
		 public Map<Long, String>  getreferencetypemasterList()
		 {
			 System.out.println("Hii");
			 
			 Map<Long, String> m = new HashMap<Long, String>();
			 for(ReferenceTypeMaster t : referenceTypeMasterService.refTypelist()){
				 System.out.println(""+t.getRef_type());
				
				 m.put(t.getRef_typ_id(),t.getRef_type());
				 
			 }
			
			 return m;
		 }
		
		
		@ModelAttribute("marketpersonList")
		 public Map<Long, String>  getmarketpersonList()
		 {
			 System.out.println("Hello");
			 
			 Map<Long, String> m = new HashMap<Long, String>();
			 for(MarketPersonMaster t : marketPersonMasterService.marketPerMasterlist()){
				 System.out.println(""+t.getMrkt_prsn_nm());
				
				 m.put(t.getMrkt_prsn_id(),t.getMrkt_prsn_nm());
				 
			 }
			
			 return m;
		 }	
		
		

		@ModelAttribute(value = "referralmasterlist")
		public Set<ReferralMasterModel> referralmasterlist() {
			Set<ReferralMasterModel> referralMasterModelslist =ReferralMasterConverter.ReferralMasterEntitytoform(referralMasterService.referralMasterlist());

			return referralMasterModelslist;

		}

		
/*		@RequestMapping("/deleteReferralMaster.hms")
		public String deleteReferralMasterList(@RequestParam long ref_id, ModelMap map, @ModelAttribute ReferralMaster referralMaster) {
			System.out.println(ref_id);
			
			boolean result = referralMasterService.deleteReferralMaster(ref_id);

			System.out.println("delete----");
			map.addAttribute("department", referralMaster);
			map.addAttribute("departmentvalueList",get());
			map.addAttribute("departmentForm",new DrugTypeMasterFormModel());
			getDrugTypeList();
			return "redirect:/client11.hms";
		}
*/
/*
		
		@RequestMapping(value ="/getReferralMasterById.hms")
		public String getDrgTypeById(@RequestParam long ref_id, ModelMap map )
		{
			System.out.println("edit controller"+drug_type_id);
			DrugTypeMasterFormModel drugTypeMasterFormModel = DrugTypeMasterConverter.drugTypeEntityToForm(drugTypeMasterServices.getDrugTypebyId(drug_type_id));
			map.addAttribute("drugTypeForm", drugTypeMasterFormModel);
			
			return "DrugType";
			
		}
		

		@RequestMapping(value = "/updateDrugType.hms")
		public String updateDrugType(ModelMap modelMap, @ModelAttribute("drugTypeForm")DrugTypeMasterFormModel drugTypeMasterFormModel, BindingResult bindingResult)
		
		{
			System.out.println("in Update");
			long result = drugTypeMasterServices.updateDrugType(DrugTypeMasterConverter.DrugTypeMasterFormToEntity(drugTypeMasterFormModel));
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
			getDrugTypeList();
			return "redirect:/client11.hms";
			
		}*/
		
}
