package com.healthcare.dao;



import com.healthcare.entities.StateMasterEntity;
import com.healthcare.utils.GenericDao;

public interface StateMasterDao extends GenericDao<StateMasterEntity> {

	//public List<StateMasterEntity> getStateListDao(long country_id);
	
	public void deleteState(String name);

}
