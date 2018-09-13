/**
 * 
 */
package com.healthcare.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.healthcare.converter.OrgMasterConverter;
import com.healthcare.dto.OrgFormModel1;
import com.healthcare.services.OrgMasterService;

/**
 * @author ADMIN
 *
 */
@Controller
public class OrgMasterController {
	
	@Autowired
	OrgMasterService orgMstrSvc;
	
	
	public OrgMasterService getOrgMstrSvc() {
		return orgMstrSvc;
	}


	public void setOrgMstrSvc(OrgMasterService orgMstrSvc) {
		this.orgMstrSvc = orgMstrSvc;
	}


	@RequestMapping(value="org.hms")
	public String displayOrg(Model model){
		
		OrgFormModel1 orgFormModel1=new OrgFormModel1();
		model.addAttribute("orgMasterModel",orgFormModel1);
//		orgMstrSvc.saveOrg(OrgMasterConverter.convertModelTOEntity(orgFormModel1));
		System.out.println("ok save org");
		return "OrgMaster";
	}
	

}
