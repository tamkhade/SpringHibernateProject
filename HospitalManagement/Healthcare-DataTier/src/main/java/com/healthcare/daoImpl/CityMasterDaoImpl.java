package com.healthcare.daoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import com.healthcare.dao.CityMasterDao;
import com.healthcare.entities.CityMasterEntity;
import com.healthcare.entities.StateMasterEntity;
import com.healthcare.utils.AbstractGenericDao;

public class CityMasterDaoImpl extends AbstractGenericDao<CityMasterEntity> implements CityMasterDao {

	/*public List<CityMasterEntity> getcitylist(long state_id) {
		Criteria criteria = getSession().createCriteria(CityMasterEntity.class,"cityEntity").add(Restrictions.eq("cityEntity.state_id",state_id));
		List<CityMasterEntity> list=criteria.list();
		System.out.println("af state_id  "+state_id);
		return list;
	}*/
	

}
