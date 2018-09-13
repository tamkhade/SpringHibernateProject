package com.healthcare.daoImpl;



import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.healthcare.dao.StateMasterDao;
import com.healthcare.entities.StateMasterEntity;
import com.healthcare.utils.AbstractGenericDao;

public class StateMasterDaoImpl extends AbstractGenericDao<StateMasterEntity> implements StateMasterDao {
	@Autowired
	private SessionFactory hibernate4AnnotatedSessionFactory;
	
	
	public void deleteState(StateMasterEntity stateMasterEntity) {
		hibernate4AnnotatedSessionFactory.getCurrentSession().createQuery("DELETE FROM state_mst WHERE state_name = "+stateMasterEntity.getState_name()).executeUpdate();
		
	}


	public void deleteState(String name) {
		// TODO Auto-generated method stub
		
	}

/*	public List<StateMasterEntity> getStateListDao(long country_id) {
		Criteria criteria = getSession().createCriteria(StateMasterEntity.class,"stateEntity").add(Restrictions.eq("stateEntity.country_id",country_id));
		List<StateMasterEntity> list=criteria.list();
		System.out.println("af country_id  "+country_id);
		return list;
	}*/
	
	//extra code
	/*public List<StateMasterEntity> getsatelist(Long couid) {
		System.out.println("id of  "+couid);		
		Criteria criteria = getSession().createCriteria(StateMasterEntity.class).add(Restrictions.eq("country_master_id",couid));
       List<StateMasterEntity> list=criteria.list();
		
		for(StateMasterEntity p:list)
		{
			System.out.println(""+p.getState_name());
		}
		
		return list;
	}*/


}
