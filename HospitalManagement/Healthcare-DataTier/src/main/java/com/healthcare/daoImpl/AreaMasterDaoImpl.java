package com.healthcare.daoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import com.healthcare.dao.AreaMasterDao;
import com.healthcare.entities.AreaMasterEntity;
import com.healthcare.utils.AbstractGenericDao;

public class AreaMasterDaoImpl extends AbstractGenericDao<AreaMasterEntity> implements AreaMasterDao{

	

	/*public List<AreaMasterEntity> getArealistDaoByCountryId(long city_id) {
		Criteria criteria = getSession().createCriteria(AreaMasterEntity.class,"areaEntity").add(Restrictions.eq("areaEntity.city_id",city_id));
		List<AreaMasterEntity> list=criteria.list();
		System.out.println("af area_id  "+city_id);
		return list;
	}

	public List<AreaMasterEntity> getArealistDaoByPinCodeId(long pincode_id) {
		// TODO Auto-generated method stub
		return null;
	}*/


}
