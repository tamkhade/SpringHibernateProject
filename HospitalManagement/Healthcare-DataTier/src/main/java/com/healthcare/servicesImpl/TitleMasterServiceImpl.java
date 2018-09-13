package com.healthcare.servicesImpl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.healthcare.dao.TitleMasterDao;
import com.healthcare.entities.BloodGroupEntity;
import com.healthcare.entities.GenderDetailsEntity;
import com.healthcare.entities.TitleMasterEntity;
import com.healthcare.services.TitleMasterService;

public class TitleMasterServiceImpl implements TitleMasterService {
	@Autowired
	TitleMasterDao titleMasterDao;

	public Set<TitleMasterEntity> titlelist() {
		
      List<TitleMasterEntity> titlelist=titleMasterDao.findAll();
		
        Set<TitleMasterEntity> titlelist1= new HashSet<TitleMasterEntity>();
		
		for(TitleMasterEntity t:titlelist){
			titlelist1.add(t);
		}
		return titlelist1;
		
		}

	
	
	
	
	}
	
