package com.healthcare.services;

import java.util.List;

import com.healthcare.dao.StateMasterDao;
import com.healthcare.entities.StateMasterEntity;

public interface StateMasterService {

	/*This is for Showing DropDown list using countryid*/
	//public List<StateMasterEntity> getServiceListService(long country_id);
	
	
	/*for save*/
	public long addState(StateMasterEntity stateMasterEntity);
	
	/*for delete*/
	//public boolean deleteState(long state_id);
	
	public void deleteState(String state );
	
	/*for displaying list*/
	public List<StateMasterEntity> stateMasterEntities();
	
	/*for edit*/
	public StateMasterEntity getStateById(long state_id);
	
	/*for update*/
	public long updateState(StateMasterEntity stateMasterEntity);

	
}
