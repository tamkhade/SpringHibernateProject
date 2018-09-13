package com.healthcare.servicesImpl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.healthcare.dao.NationalityMasterDao;
import com.healthcare.entities.BloodGroupEntity;
import com.healthcare.entities.NationalityMasterEntity;
import com.healthcare.services.NationalityMasterService;

public class NationalityMasterServiceimpl implements NationalityMasterService {
	@Autowired

	NationalityMasterDao nationalityMasterDao;
	public Set<NationalityMasterEntity> nationalityMasterEntitieslist() {
	List<NationalityMasterEntity> NationalityMasterEntitylist=nationalityMasterDao.findAll();
		
        Set<NationalityMasterEntity> nationalitylist= new HashSet<NationalityMasterEntity>();
		
		for(NationalityMasterEntity t:NationalityMasterEntitylist){
			nationalitylist.add(t);
		}
		return nationalitylist;
		
		}

	}


