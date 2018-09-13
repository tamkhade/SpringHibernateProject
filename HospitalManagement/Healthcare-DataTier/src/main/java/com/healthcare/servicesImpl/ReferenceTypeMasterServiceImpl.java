package com.healthcare.servicesImpl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.healthcare.dao.ReferenceTypeMasterDao;
import com.healthcare.entities.ReferenceTypeMaster;
import com.healthcare.services.ReferenceTypeMasterService;

public class ReferenceTypeMasterServiceImpl implements ReferenceTypeMasterService {
	
	@Autowired
	ReferenceTypeMasterDao referenceTypeMasterDao;

	public Set<ReferenceTypeMaster> refTypelist() {
		List<ReferenceTypeMaster> desination1 = referenceTypeMasterDao.findAll();

		Set<ReferenceTypeMaster> desination2 = new HashSet<ReferenceTypeMaster>();

		for (ReferenceTypeMaster t : desination1) {
			System.out.println(t.getRef_type());
			desination2.add(t);
		}

		return desination2;

	}

}
