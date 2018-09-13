package com.healthcare.services;

import java.util.Set;

import com.healthcare.dao.BloodGroupDao;
import com.healthcare.entities.BloodGroupEntity;


public interface BloodGroupServices   {
	
	public Set<BloodGroupEntity> bloodlist();
	

}
