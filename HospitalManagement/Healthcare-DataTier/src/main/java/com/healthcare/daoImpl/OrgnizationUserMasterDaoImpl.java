package com.healthcare.daoImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import com.healthcare.dao.OrgnizationUserMasterDao;
import com.healthcare.entities.OrgnizationUserMasterEntity;
import com.healthcare.utils.AbstractGenericDao;

public class OrgnizationUserMasterDaoImpl extends AbstractGenericDao<OrgnizationUserMasterEntity> implements OrgnizationUserMasterDao
{
	public List<OrgnizationUserMasterEntity> getConsultantUsersDao(long user_type_id) 
	{
		Criteria criteria = getSession().createCriteria(OrgnizationUserMasterEntity.class,"org_user").add(Restrictions.eq("org_user.user_type_id",user_type_id));
		return  criteria.list();
	}

}
