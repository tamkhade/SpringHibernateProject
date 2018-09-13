package com.healthcare.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.healthcare.dao.OrgModuleMstDao;
import com.healthcare.entities.OrgModuleMstEntity;
import com.healthcare.services.OrgModuleMstServices;

public class OrgModuleMstServiceImpl implements OrgModuleMstServices {

	@Autowired
	OrgModuleMstDao orgModuleMstDao;
	public List<OrgModuleMstEntity> getmodal() {

		return orgModuleMstDao.getlist();
	}
	

}
