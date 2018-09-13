package com.healthcare.servicesImpl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.healthcare.dao.ReasonMasterDao;
import com.healthcare.entities.BloodGroupEntity;
import com.healthcare.entities.ReasonMasterEntity;
import com.healthcare.entities.ReligionMasterEntity;
import com.healthcare.services.ReasonMasterService;

public class ReasonMasterServiceImpl implements ReasonMasterService {

	@Autowired
	ReasonMasterDao reasonMasterDao;
	
	public Set<ReasonMasterEntity> reasonMasterEntitieslist() {
		
  List<ReasonMasterEntity> reasonMasterEntitylist= reasonMasterDao.findAll();
		
        Set<ReasonMasterEntity> reasonlist= new HashSet<ReasonMasterEntity>();
		
		for(ReasonMasterEntity n:reasonMasterEntitylist)
		{
			reasonlist.add(n);
		}
		return reasonlist;
		
		}
	}


