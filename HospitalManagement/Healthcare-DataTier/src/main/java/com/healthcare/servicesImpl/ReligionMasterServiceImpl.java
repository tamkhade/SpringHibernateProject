package com.healthcare.servicesImpl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.healthcare.dao.ReligionMasterDao;
import com.healthcare.entities.BloodGroupEntity;
import com.healthcare.entities.ReligionMasterEntity;
import com.healthcare.services.ReligionMasterServices;

public class ReligionMasterServiceImpl implements ReligionMasterServices {

	@Autowired
	ReligionMasterDao religionMasterDao;
	
	public Set<ReligionMasterEntity> religionMasterEntitieslist() {

		List<ReligionMasterEntity> religionlist=religionMasterDao.findAll();
		
        Set<ReligionMasterEntity> religionlist1= new HashSet<ReligionMasterEntity>();
		
		for(ReligionMasterEntity t:religionlist){
			religionlist1.add(t);
		}
		return religionlist1;
		
		}
	}

