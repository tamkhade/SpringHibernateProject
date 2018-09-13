package com.healthcare.services;

import java.util.List;


import com.healthcare.entities.AreaMasterEntity;


public interface AreaMasterServices {

	/*for displaying list using */
	/*public List<AreaMasterEntity> getArealist(long city_id);*/
	
	
	/*for save*/
	public long addArea(AreaMasterEntity areaMasterEntity);
	
	
	/*for edit*/
	public AreaMasterEntity getAreabyId(long area_id);
	
	
	/* for Displaying List*/
	public List<AreaMasterEntity> areaMasterEntities();
	
	
	/*for delete*/
	public boolean deleteArea(long area_id);
	
	
	/*for update*/
	public long updateArea(AreaMasterEntity areaMasterEntity);
	
	
}
