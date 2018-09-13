package com.healthcare.servicesImpl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.healthcare.dao.MaritalStatusDao;
import com.healthcare.entities.MaritalStatusEntity;
import com.healthcare.services.MaritalService;



public class MaritalStatusSeriveImpl implements MaritalService {

	@Autowired
	MaritalStatusDao maritalStatusDao;
	
	public Set<MaritalStatusEntity> maritalstatuslist() {
	
		
	List<MaritalStatusEntity> maritalstuslist=maritalStatusDao.findAll();
	Set<MaritalStatusEntity> maritalstatus=new HashSet<MaritalStatusEntity>();
	
	for(MaritalStatusEntity m:maritalstuslist)
	 	
		maritalstatus.add(m);
		
		return maritalstatus;
	}

}
