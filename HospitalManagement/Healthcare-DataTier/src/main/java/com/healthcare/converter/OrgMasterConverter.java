/**
 * 
 */
package com.healthcare.converter;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.healthcare.dto.OrgFormModel1;
import com.healthcare.entities.OrgAddressDtlEntity;
import com.healthcare.entities.OrgBankDtlMaster;
import com.healthcare.entities.OrgMasterEntity;


/**
 * @author ADMIN
 *
 */
public class OrgMasterConverter {
	
	public static OrgMasterEntity convertModelTOEntity(OrgFormModel1 orgFormModel1){
		
		OrgMasterEntity orgMasterEntity=new OrgMasterEntity();
		
//org master table
		orgMasterEntity.setOrg_name("Bhagali");
		orgMasterEntity.setOrg_reg_no("111");
		orgMasterEntity.setOrg_bed_nos(50);
		orgMasterEntity.setOrg_landline_no("6215376");
		orgMasterEntity.setOrg_mob_no("23648723");
		orgMasterEntity.setOrg_email("bhagali@j.com");
		//orgMasterEntity.setOrg_logo();
		orgMasterEntity.setOrg_status('a');
		//orgMasterEntity.setOrg_type_id(1);
		orgMasterEntity.setOrg_active_from("23/2/2017");
		orgMasterEntity.setOrg_active_to("2/23/2018");
		orgMasterEntity.setOrg_brnch_status('a');
		orgMasterEntity.setOrg_brnch_count(2);
//org bank dtl
		
		Set<OrgBankDtlMaster>orgBankSet=new HashSet<OrgBankDtlMaster>();
		OrgBankDtlMaster orgBankDtlMaster=new OrgBankDtlMaster();
		orgBankDtlMaster.setBnk_acct_no("43567890434");
		orgBankDtlMaster.setOrg_bnk_status('a');
		//orgBankDtlMaster.setBnk_brnch_id(1);
		orgBankDtlMaster.setBnk_acct_type_id(12);
		orgBankDtlMaster.setOrgMasterEntity(orgMasterEntity);
		
		orgBankSet.add(orgBankDtlMaster);
		orgMasterEntity.setOrgBankDtlMasters(orgBankSet);
		
//org add dtl 
		Set<OrgAddressDtlEntity>orgAddDtlSet=new HashSet<OrgAddressDtlEntity>();
		OrgAddressDtlEntity orgAddressDtlEntity=new OrgAddressDtlEntity();
		orgAddressDtlEntity.setArea_id(1);
		orgAddressDtlEntity.setPincode_id(2);
		orgAddressDtlEntity.setAddress_details("pune pk birayani navale brige ");
		orgAddressDtlEntity.setOrg_add_landmark("vadagav fata");
		orgAddressDtlEntity.setOrg_add_status('a');
		orgAddressDtlEntity.setOrgMasterEntity(orgMasterEntity);
		
		orgAddDtlSet.add(orgAddressDtlEntity);
		orgMasterEntity.setOrgAddressDtlEntities(orgAddDtlSet);
		
		return orgMasterEntity;
	}

}
