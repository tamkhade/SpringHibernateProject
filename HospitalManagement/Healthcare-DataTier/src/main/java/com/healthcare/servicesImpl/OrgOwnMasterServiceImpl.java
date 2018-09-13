package com.healthcare.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.healthcare.dao.OrgOwnMasterDao;
import com.healthcare.entities.OrgOwnMasterEntity;
import com.healthcare.services.OrgOwnMasterServices;

public class OrgOwnMasterServiceImpl implements OrgOwnMasterServices {
	
	@Autowired
	OrgOwnMasterDao orgOwnMasterDao;
	public List<OrgOwnMasterEntity> getdeplist()
	{
		
		return orgOwnMasterDao.getdeplist();
	}
}
