package com.healthcare.servicesImpl;


import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.healthcare.dao.AreaMasterDao;
import com.healthcare.entities.AreaMasterEntity;
import com.healthcare.services.AreaMasterServices;

public class AreaMasterServiceImpl implements AreaMasterServices{
	@Autowired
	AreaMasterDao areaMasterDao;

	
	/*For displaying area list using City*/
	/*public List<AreaMasterEntity> getArealist(long city_id) {
		return areaMasterDao.getArealistDao(city_id);
	}*/
	
	public long addArea(AreaMasterEntity areaMasterEntity) {
		Serializable id = (Serializable) areaMasterDao.save(areaMasterEntity);
		Long r = (Long) id;
		long longValue = r.longValue();

		if (longValue != 0L || longValue > 0L) {

			return 1L;

		} else {
			return 0L;
		}
	}

	public AreaMasterEntity getAreabyId(long area_id) {
		return areaMasterDao.findById(area_id);
	}

	public List<AreaMasterEntity> areaMasterEntities() {
		return areaMasterDao.findAll();
	}

	public boolean deleteArea(long area_id) {
		return areaMasterDao.deletebyId(area_id);
	}

	public long updateArea(AreaMasterEntity areaMasterEntity) {
		long longValue = areaMasterDao.update(areaMasterEntity);

		if (longValue != 0L || longValue > 0L) {

			return 1L;

		} else {
			return 0L;
		}
	}


	
	
	

}
