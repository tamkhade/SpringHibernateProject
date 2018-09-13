package com.healthcare.servicesImpl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.healthcare.dao.GenderDao;
import com.healthcare.entities.GenderDetailsEntity;
import com.healthcare.services.GenderService;

public class GenderServiceImpl implements GenderService {

	
	@Autowired
	GenderDao genderDao;
	public Set<GenderDetailsEntity> genderstatuslist() {
		// TODO Auto-generated method stub
		
		List<GenderDetailsEntity> genderdetails=genderDao.findAll();
		
		Set<GenderDetailsEntity> genderdetails2=new HashSet<GenderDetailsEntity>();
		
		
		for(GenderDetailsEntity g:genderdetails)
		{
			genderdetails2.add(g);
		}
		
		
		return genderdetails2;
	}
	
	/*public List<GenderDetailsEntity> genderEntitieslist(Long titleId) {
		// TODO Auto-generated method stub
		return genderDao.genderEntitieslist(titleId);
	}
	*/

}
