package com.healthcare.controllers;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.healthcare.converter.AreaMasterConverter;
import com.healthcare.converter.CityMasterConverter;
import com.healthcare.converter.CountryMasterConverter;
import com.healthcare.converter.PinCodeMasterConverter;
import com.healthcare.converter.ReceptionModuleConverter;
import com.healthcare.converter.StateMasterConverter;
import com.healthcare.dao.LanguageMasterDao;
import com.healthcare.dao.OrgMasterDao;
import com.healthcare.dto.AreaMasterFormModel;
import com.healthcare.dto.CityMasterFormModel;
import com.healthcare.dto.CountryMasterFormModel;
import com.healthcare.dto.PinCodeMasterFormModel;
import com.healthcare.dto.ReceptionFormModel;
import com.healthcare.dto.StateMasterFormModel;
import com.healthcare.entities.BloodGroupEntity;
import com.healthcare.entities.CountryMasterEntity;
import com.healthcare.entities.DepartMentEntity;
import com.healthcare.entities.GenderDetailsEntity;
import com.healthcare.entities.LanguageMasterEntity;
import com.healthcare.entities.MaritalStatusEntity;
import com.healthcare.entities.NationalityMasterEntity;
import com.healthcare.entities.OrgModuleMstEntity;
import com.healthcare.entities.OrgOwnMasterEntity;
import com.healthcare.entities.PatientMasterEntity;
import com.healthcare.entities.ReasonMasterEntity;
import com.healthcare.entities.ReferralMaster;
import com.healthcare.entities.ReligionMasterEntity;
import com.healthcare.entities.TitleMasterEntity;
import com.healthcare.pdfpojo.PatientPdfModel;
import com.healthcare.services.AreaMasterServices;
import com.healthcare.services.BloodGroupServices;
import com.healthcare.services.CityMasterService;
import com.healthcare.services.CountryMasterService;
import com.healthcare.services.DepartMentService;
import com.healthcare.services.GenderService;
import com.healthcare.services.LanguageMasterService;
import com.healthcare.services.MaritalService;
import com.healthcare.services.NationalityMasterService;
import com.healthcare.services.OrgModuleMstServices;
import com.healthcare.services.OrgOwnMasterServices;
import com.healthcare.services.PatientServices;
import com.healthcare.services.PincodeMasterService;
import com.healthcare.services.ReasonMasterService;
import com.healthcare.services.ReferralMasterService;
import com.healthcare.services.ReligionMasterServices;
import com.healthcare.services.StateMasterService;
import com.healthcare.services.TitleMasterService;

@Controller
public class ReceptionModuleController {

	
	@Autowired
	PatientServices patientServices;

	@Autowired
	BloodGroupServices bloodGroupServices;

	@Autowired
	MaritalService MaritalService;

	@Autowired
	GenderService genderService;

	@Autowired
	DepartMentService departMentService;
	
	
	@Autowired
	ReligionMasterServices religionMasterServices;
	
	@Autowired
	ReasonMasterService reasonMasterService;
	
	@Autowired
	NationalityMasterService nationalityMasterService;
	
	@Autowired
	ReferralMasterService referralMasterService ;
	
	
	@Autowired
	TitleMasterService titleservice;
	
	
	@Autowired
	
	CountryMasterService countryMasterService;
	
	
	@Autowired
	StateMasterService stateMasterService;
	
	
	@Autowired
	AreaMasterServices areaMasterServices;
	
	@Autowired
	CityMasterService cityMasterservice;
	
	@Autowired
	PincodeMasterService pincodeMasterService;
	
	@Autowired
	OrgModuleMstServices orgModuleMstServices;
	
	@Autowired
	LanguageMasterService languageMasterService;
	

	@Autowired
	OrgOwnMasterServices orgOwnMasterServices;
	
	
	@RequestMapping(value = "index11.hms")
	public String redirect(Model model) {

		model.addAttribute("ReceptionFormModel",new ReceptionFormModel());	
		return "viewpatient";
	}
	
	
	
	@RequestMapping(value = "myrcindex11.hms")
	public String reception(Model model) {

		ReceptionFormModel receptionFormModel = new ReceptionFormModel();
		model.addAttribute("ReceptionFormModel", receptionFormModel);
		return "Reception";
	}
	

	@RequestMapping(value = "/getReceptionMaster.hms", method = RequestMethod.POST)
	public String getEmployeeRegisterPage(ModelMap map, @ModelAttribute ReceptionFormModel receptionFormModel,
			BindingResult bindingResult) throws ParseException {
	
		System.out.println("patient full name::"+receptionFormModel.getPatient_first_Name());
		System.out.println("date of birth"+receptionFormModel.getDob());
		long result = patientServices.savepatient(ReceptionModuleConverter.PatientformtoEntity(receptionFormModel));
		if (result == 1L) {
			map.addAttribute("hospitalMsg", "Successfully saved");
		} else if (result == -1L) {
			map.addAttribute("hospitalMsg", "Somthing went wrong");
		}
		
		map.addAttribute("ReceptionFormModel", receptionFormModel);
		
		map.addAttribute("ReceptionFormModel",new ReceptionFormModel());
		return "viewpatient";

	}

	  @ModelAttribute("bloodlist") public Map<Long, String> bloodList() {
	  Map<Long, String> b = new HashMap<Long, String>();
	  for(BloodGroupEntity t : bloodGroupServices.bloodlist()) {	  
	   System.out.println(t.getBlood_grp_type());
	   b.put(t.getBlood_grp_id(),t.getBlood_grp_type());
	 }
	 
	  return b;
	  }
	  
	  
	  @ModelAttribute("religionList") public Map<Long, String> religionList() {
		  Map<Long, String> b = new HashMap<Long, String>();
		  for(ReligionMasterEntity t : religionMasterServices.religionMasterEntitieslist()) {	  
		   System.out.println(t.getReligion_type());
		   b.put(t.getReligion_id(),t.getReligion_type());
		 }
		 
		  return b;
		  }
	  
	  
	  @ModelAttribute("reasonList") public Map<Long, String> reasonList() {
		  Map<Long, String> b = new HashMap<Long, String>();
		  for(ReasonMasterEntity t : reasonMasterService.reasonMasterEntitieslist()) {	  
		   System.out.println(t.getReason_type());
		   b.put(t.getReason_type_id(),t.getReason_type());
		 }
		 
		  return b;
		  }
	  
	  @ModelAttribute("nationalitylist") public Map<Long, String> nationalityList() {
		  Map<Long, String> b = new HashMap<Long, String>();
		  for(NationalityMasterEntity t : nationalityMasterService.nationalityMasterEntitieslist()) {	  
		   System.out.println(t.getNationality_type());
		   b.put(t.getNationality_id(),t.getNationality_type());
		 }
		 
		  return b;
		  }
	  
	 
	  @ModelAttribute("maritalStatuslist") public Map<Long, String>
	  getmaritalList() { Map<Long, String> m = new HashMap<Long,String>();
	  
	  for (MaritalStatusEntity t:MaritalService.maritalstatuslist()) {
	  System.out.println(t.getMarital_status()); 
	  m.put(t.getMartial_status_id(),t.getMarital_status()); }
	  return m;
	  }
	  
	  
	  
	 @ModelAttribute("genderlist") public Map<Long, String> getgenderList()
	  { 
	  Map<Long, String> ge = new HashMap<Long, String>();
	  ge.put((long) 0,"Select Gender"); 
	  for(GenderDetailsEntity g :genderService.genderstatuslist()) {
	  System.out.println(g.getGender_type());
	  ge.put(g.getGender_id(),g.getGender_type()); 
	  }
	  
	  return ge;
	  
	  }
	  	  
  
	  /* @ModelAttribute("departmentlist") 
	  public Map<Long, String> getdepartmentList()
	  { 
	  Map<Long, String> c = new HashMap<Long, String>();
	  for(DepartMentEntity d :departMentService.departMentEntitieslist()) {
	  System.out.println(d.getDep_name());
	  c.put(0l, "-Select-Department-");
	  c.put(d.getDep_id(),d.getDep_name()); 
	  }
	  
	  return c;
	  
	  }*/
	   
	  
	   @ModelAttribute("refferaldrlist") 
		  public Map<Long, String> refferaldrList()
		  { 
		  Map<Long, String> c = new HashMap<Long, String>();
		  for(ReferralMaster d :referralMasterService.referralMasterlist()) {
		  System.out.println(d.getRef_name());
		  c.put(0l, "-Select-refferal-");
		  c.put(d.getRef_id(),d.getRef_name()); 
		  }
		  
		  return c;
		  
		  }
	   
	   @ModelAttribute("departmentlist") 
		  public Map<Long, String> departmentlist()
		  { 
		  Map<Long, String> c = new HashMap<Long, String>();
		  for(OrgModuleMstEntity d :orgModuleMstServices.getmodal()) {	  
		  System.out.println(d.getMod_id() );
		  c.put(0l, "-Select-refferal-");
		  c.put(d.getMod_id(),d.getMod_name()); 
		  }
		  return c;
		  
		  }
	 
	   
	   
	   
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
			
			
			//for getting Area dropdown
			@ModelAttribute(value="getAreaMasterList")
			public Map<Long,String> getAreaMasterList() {

				List<AreaMasterFormModel> areaMasterFormModels=AreaMasterConverter.areaMasterEntityToFormList(areaMasterServices.areaMasterEntities());
				
				Map<Long, String> areas = new HashMap<Long, String>();
				for (AreaMasterFormModel areaMasterFormModel :areaMasterFormModels) 
				{
					areas.put(areaMasterFormModel.getArea_id(), areaMasterFormModel.getArea_name());
				}
				return areas;
			}	
			
	   
	   @ModelAttribute("titlelist") 
		  public Map<Long, String> titleList()
		  { 
		  Map<Long, String> c = new HashMap<Long, String>();
		  for(TitleMasterEntity d :titleservice.titlelist()) {
		  System.out.println(d.getTitle_type());
		  c.put(0l, "-Select-title-");
		  c.put(d.getTitle_id(),d.getTitle_type()); 
		  }
		  return c;
		  
		  }
	   
	   
	   @ModelAttribute("langlist") 
		  public Map<Long, String> langlist()
		  { 
		  Map<Long, String> c = new HashMap<Long, String>();
		  for(LanguageMasterEntity d :languageMasterService.languageMasterEntities()) {
		  System.out.println(d.getPref_lang_name());
		  c.put(0l, "-Select-lang-");
		  c.put(d.getPref_lang_id(),d.getPref_lang_name()); 
		  }
		  return c;
		  
		  }
	   
	   
	  
	   @RequestMapping(value = "viewpatient.hms")
		public String viewpatient(Model model) {

		return "viewpatient";
		}
	   

	   @ModelAttribute(value="patientlist")
	   public Set<ReceptionFormModel> patientlist()
	   {
		   Set<ReceptionFormModel> receptionFormModelslist=ReceptionModuleConverter.patiententitytoform(patientServices.patientMasterEntitieslist());
		     
		return receptionFormModelslist;
	   
	   }
	   
	   
	    @RequestMapping(value = "patient.hms",method = RequestMethod.GET)
		public String viewpatientalldetails(ModelMap map,@RequestParam Long patId) {
        System.out.println("patient"+patId);
  
        ReceptionFormModel receptionFormModel=ReceptionModuleConverter.particularpatiententitytoform(patientServices.patientlist(patId));
        
        System.out.println("hii full name"+receptionFormModel.getPatient_fullname());
        System.out.println("hiii f name"+receptionFormModel.getPatient_first_Name());
        
 
        map.addAttribute("ReceptionFormModel", receptionFormModel);
      
		return "Reception";
		}
	   
	      
	    
	    @RequestMapping(value = "/getReceptionMasterupdate.hms", method = RequestMethod.GET)
		public String getEmployeeupdateRegisterPage(ModelMap map, @ModelAttribute ReceptionFormModel receptionFormModel,
				BindingResult bindingResult) throws ParseException {
			System.out.println(""+receptionFormModel);
			long result = patientServices.patientupdate(ReceptionModuleConverter.PatientformtoEntity(receptionFormModel));
			if (result == 1L) {
				map.addAttribute("hospitalMsg", "Successfully saved");
			} else if (result == -1L) {
				map.addAttribute("hospitalMsg", "Somthing went wrong");
			}
			ReceptionFormModel receptionFormModels = new ReceptionFormModel();
			map.addAttribute("ReceptionFormModel", receptionFormModels);
					
			return "Reception";

		}
	    
	 
	    @RequestMapping(value = "/getMachedNames.hms", method = 
		    RequestMethod.GET)
	    public @ResponseBody
	    List<String> getMachedNames(@RequestParam("term") String name){
	    	DataCache datacache=new DataCache();
		List<String> matchName = patientServices.getName(name);
		
		return matchName;
	    }
	    
	    
	  /*  @RequestMapping(value = "/getpatientinformation.hms", method = RequestMethod.POST)
		public  String getPatientByname(@RequestParam String patient_fullname, ModelMap map) 
		{
			
	    System.out.println("pat name: "+patient_fullname);
			
		Set<ReceptionFormModel> receptionFormModels= ReceptionModuleConverter.patientfullentitytoform(patientServices.patientnamelist(patient_fullname));  
		map.addAttribute("patientnamelist",receptionFormModels);
		map.addAttribute("ReceptionFormModel",new ReceptionFormModel());
		return "viewpatient";
		
	}*/
	    
	    
		@RequestMapping(value = "/getpatientinformation.hms", method =RequestMethod.POST)
		@ResponseBody
		public String getPatientByname(@RequestParam("patient_fullname") String patient_fullname) 
	  {
		  System.out.println("hiii mahesh;;;;;;"+patient_fullname);
		 
		  Set<ReceptionFormModel> receptionFormModels= ReceptionModuleConverter.patientfullentitytoform(patientServices.patientnamelist(patient_fullname));  
		
		  for(ReceptionFormModel r:receptionFormModels)
		  {
			  System.out.println("full name"+r.getPatient_fullname());
			  
		  }
		  String json = null;
			ObjectMapper mapper = new ObjectMapper();
			try 
			{
			 json = mapper.writeValueAsString(receptionFormModels);
			} catch (JsonProcessingException e)
			{
				e.printStackTrace();
			}
		
			return json;
		}
	  	
		
		 @ModelAttribute("deplist") 
		  public Map<Long, String> deplist()
		  { 
		  Map<Long, String> c = new HashMap<Long, String>();
		  for(OrgOwnMasterEntity d :orgOwnMasterServices.getdeplist()) {
		//  System.out.println(d.g);
		  c.put(0l, "-Select-lang-");
		 // c.put(d.getPref_lang_id(),d.getPref_lang_name()); 
		  }
		  return c;
		  
		  }
	   
		
		 /*
			@RequestMapping(value = "/getMachedNames.hms", method =RequestMethod.POST)
			@ResponseBody
			public String patfullname(@RequestParam("name") String name) 
		  {
				
			     System.out.println("hiii jjjjjj;;;;;;"+name);
			     List<String> matchName = patientServices.getName(name);    
			     String json = null;
				 ObjectMapper mapper = new ObjectMapper();
				try 
				{
				  json = mapper.writeValueAsString(matchName);
				} catch (JsonProcessingException e)
				{
					e.printStackTrace();
				}
			
				return json;
			}*/
		  	

}
