package com.healthcare.services;

import java.util.List;

import com.healthcare.entities.CityMasterEntity;
public interface CityMasterService {
//for displaying list using state id
	/*public List<CityMasterEntity> getcitylist(long state_id);*/
	
	
	/*for save*/
	public long addCity(CityMasterEntity cityMasterEntity);
	
	
	/*for edit*/
	public CityMasterEntity getCityById(long city_id);
	
	
	/* for Displaying List*/
	public List<CityMasterEntity> cityMasterEntities();
	
	
	/*for delete*/
	public boolean deleteCity(long city_id);
	
	
	/*for update*/
	public long updateCity(CityMasterEntity cityMasterEntity);
	
}
