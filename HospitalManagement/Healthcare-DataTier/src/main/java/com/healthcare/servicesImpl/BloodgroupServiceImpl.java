package com.healthcare.servicesImpl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.healthcare.dao.BloodGroupDao;
import com.healthcare.daoImpl.BloodGroupDaoImpl;
import com.healthcare.entities.BloodGroupEntity;

import com.healthcare.services.BloodGroupServices;

public class BloodgroupServiceImpl implements BloodGroupServices {

	@Autowired
	BloodGroupDaoImpl bloodgroup;
	
	public Set<BloodGroupEntity> bloodlist() {
		
		List<BloodGroupEntity> bloodgroupEntities=bloodgroup.findAll();
		
        Set<BloodGroupEntity> bloodGroup= new HashSet<BloodGroupEntity>();
		
		for(BloodGroupEntity t:bloodgroupEntities){
			bloodGroup.add(t);
		}
		return bloodGroup;
		
		}

}
