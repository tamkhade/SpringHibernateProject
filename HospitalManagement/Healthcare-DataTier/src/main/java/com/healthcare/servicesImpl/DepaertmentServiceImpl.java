package com.healthcare.servicesImpl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.healthcare.dao.DepartMentDao;
import com.healthcare.entities.DepartMentEntity;
import com.healthcare.services.DepartMentService;

public class DepaertmentServiceImpl implements DepartMentService {

	@Autowired
	DepartMentDao departMentDao;
	public Set<DepartMentEntity> departMentEntitieslist() {
		// TODO Auto-generated method stub
		
		List<DepartMentEntity> departMentEntitieslist=departMentDao.findAll();
		Set<DepartMentEntity> departMentEntities=new HashSet<DepartMentEntity>();

		for(DepartMentEntity d:departMentEntitieslist)

		{
			departMentEntities.add(d);
		}
		return departMentEntities;
	}

}
