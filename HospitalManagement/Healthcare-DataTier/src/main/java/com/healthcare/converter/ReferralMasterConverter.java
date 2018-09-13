package com.healthcare.converter;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.healthcare.dto.ReceptionFormModel;
import com.healthcare.dto.ReferralMasterModel;
import com.healthcare.entities.ReferralMaster;

public class ReferralMasterConverter {
	
	
	public static ReferralMaster convertFormToEnitity(ReferralMasterModel referralMasterModel)

	{
		
	ReferralMaster referralMaster = new ReferralMaster();
	
	referralMaster.setArea_id(referralMasterModel.getArea_id());
	referralMaster.setContct_persn_nm(referralMasterModel.getContct_persn_nm());
	referralMaster.setOrg_id(referralMasterModel.getOrg_id());
	referralMaster.setRef_actv_frm(referralMasterModel.getRef_actv_frm());
	referralMaster.setRef_actv_to(referralMasterModel.getRef_actv_to());
	referralMaster.setRef_anniversary(referralMasterModel.getRef_anniversary());
	referralMaster.setRef_code(referralMasterModel.getRef_code());
	referralMaster.setRef_dob(referralMasterModel.getRef_dob());
	referralMaster.setRef_crtd_dt(new Date());
	referralMaster.setRef_email(referralMasterModel.getRef_email());
	referralMaster.setRef_crtd_dt(new Date());
	referralMaster.setRef_name(referralMasterModel.getRef_name());
	referralMaster.setRef_ph_no(referralMasterModel.getRef_ph_no());
	referralMaster.setRef_mob_no(referralMasterModel.getRef_mob_no());
	referralMaster.setRef_alt_mob_no(referralMasterModel.getRef_alt_mob_no());
	referralMaster.setRef_status(referralMasterModel.getRef_status());
	/*referralMaster.setRef_address(referralMasterModel.getRef_address1()+" "+referralMasterModel.getRef_address2());*/
	referralMaster.setRef_address(referralMasterModel.getRef_address());
	referralMaster.setMrkt_prsn_id(referralMasterModel.getMrkt_prsn_id());
	referralMaster.setRef_typ_id(referralMasterModel.getRef_typ_id());
	
	
	
	
	return referralMaster;
	

	}
	
	public static Set<ReferralMasterModel> ReferralMasterEntitytoform(Set<ReferralMaster> referralmasterlist) {

		Set<ReferralMasterModel> referralMasterModelslist = new HashSet<ReferralMasterModel>();
		for (ReferralMaster c : referralmasterlist)

		{
			ReferralMasterModel referralMasterModel = new ReferralMasterModel();
			
			referralMasterModel.setContct_persn_nm(c.getContct_persn_nm());
			referralMasterModel.setRef_name(c.getRef_name());
			referralMasterModel.setRef_email(c.getRef_email());
			
			referralMasterModelslist.add(referralMasterModel);

		}

		return referralMasterModelslist;

	}


}
