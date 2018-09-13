package com.healthcare.services;

import java.util.List;
import java.util.Set;

import com.healthcare.entities.OrgModuleMstEntity;
import com.healthcare.entities.OrgOwnMasterEntity;
import com.healthcare.entities.ReferralMaster;

public interface ReferralMasterService {
	public long referralsave(ReferralMaster referralMaster);
	public Set<ReferralMaster> referralMasterlist();
	
	/*delete the DrugType*/
	public boolean deleteReferralMaster(long ref_id);
	
	/* edit */
	
	public ReferralMaster getReferralMasterbyId(long ref_id);
	/* update */
	
	public long updateReferralMaster(ReferralMaster referralMaster);
	
	

}
