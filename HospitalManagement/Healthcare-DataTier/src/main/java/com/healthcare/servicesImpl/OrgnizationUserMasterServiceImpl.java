package com.healthcare.servicesImpl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.healthcare.dao.OrgnizationUserMasterDao;
import com.healthcare.entities.OrgnizationUserMasterEntity;
import com.healthcare.services.OrgnizationUserMasterService;

public class OrgnizationUserMasterServiceImpl implements OrgnizationUserMasterService 
{
	@Autowired
	OrgnizationUserMasterDao orgnizationUserMasterDao;
	

	public long saveOrgUser(OrgnizationUserMasterEntity orgnizationUserMasterEntity) {
		
		Serializable id = (Serializable) orgnizationUserMasterDao.save(orgnizationUserMasterEntity);
		Long r = (Long) id;
		long longValue = r.longValue();

		if (longValue != 0L || longValue > 0L) {

			return 1L;

		} else {
			return 0L;
		}
	}


	public List<OrgnizationUserMasterEntity> getConsultantUsersService(long user_type_id) 
	{
		return orgnizationUserMasterDao.getConsultantUsersDao(user_type_id);
	}
}
