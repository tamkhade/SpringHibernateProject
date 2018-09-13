package com.healthcare.daoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import com.healthcare.dao.GenderDao;
import com.healthcare.entities.GenderDetailsEntity;
import com.healthcare.utils.AbstractGenericDao;


public class GenderDaoImpl extends AbstractGenericDao<GenderDetailsEntity> implements GenderDao {

	
	/*public List<GenderDetailsEntity> genderEntitieslist(Long titleId) {
		Criteria criteria = getSession().createCriteria(GenderDetailsEntity.class).add(Restrictions.eq("title_id",titleId));
		
		List<GenderDetailsEntity> list=criteria.list();
		
		for(GenderDetailsEntity p:list)
		{
			System.out.println("gender type::"+p.getGender_type());
		}
		
		return list;
		
	}*/
	
}
