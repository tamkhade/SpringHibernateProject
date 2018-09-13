package com.healthcare.services;

import java.util.List;
import java.util.Set;

import com.healthcare.entities.GenderDetailsEntity;


public interface GenderService  {
		
	Set<GenderDetailsEntity> genderstatuslist();	
	
	/*public List<GenderDetailsEntity> genderEntitieslist(Long titleId);
	*/
}
