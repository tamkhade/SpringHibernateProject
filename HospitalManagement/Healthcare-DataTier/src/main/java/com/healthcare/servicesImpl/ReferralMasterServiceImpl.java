package com.healthcare.servicesImpl;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.healthcare.dao.ReferralMasterDao;
import com.healthcare.entities.OrgModuleMstEntity;
import com.healthcare.entities.OrgOwnMasterEntity;
import com.healthcare.entities.ReferralMaster;
import com.healthcare.services.ReferralMasterService;

public class ReferralMasterServiceImpl implements  ReferralMasterService {

	
	@Autowired
	ReferralMasterDao referralMasterDao;

	public long referralsave(ReferralMaster referralMaster) {
		Serializable id = (Serializable) referralMasterDao.save(referralMaster);
		Long r = (Long) id;
		long longValue = r.longValue();

		if (longValue != 0L || longValue > 0L) {

			return 1L;

		} else {
			return 0L;
		}
	}



	public Set<ReferralMaster> referralMasterlist() {
		List<ReferralMaster> referalmasterlist=referralMasterDao.findAll();
		Set<ReferralMaster> referalmasterlist1=new HashSet<ReferralMaster>();
		
		for(ReferralMaster c:referalmasterlist)
			referalmasterlist1.add(c);
			
		
		return referalmasterlist1;
	}



	public boolean deleteReferralMaster(long ref_id) {
		
		 return referralMasterDao.deletebyId(ref_id);
	}



	public ReferralMaster getReferralMasterbyId(long ref_id) {
		
		return referralMasterDao.findById(ref_id);
	}



	public long updateReferralMaster(ReferralMaster referralMaster) {
		long longValue = referralMasterDao.update(referralMaster);

		if (longValue != 0L || longValue > 0L) {

			return 1L;

		} else {
			return 0L;
		}
	}



	

}
