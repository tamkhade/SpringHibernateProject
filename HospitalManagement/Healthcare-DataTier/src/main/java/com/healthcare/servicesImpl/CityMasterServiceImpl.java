package com.healthcare.servicesImpl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.healthcare.dao.CityMasterDao;
import com.healthcare.entities.CityMasterEntity;
import com.healthcare.services.CityMasterService;

public class CityMasterServiceImpl implements CityMasterService {

	@Autowired
	CityMasterDao cityMasterDao;

	/*public List<CityMasterEntity> getcitylist(long state_id) {
	
	return cityMasterDao.getcitylist(state_id);
   }*/
	
	
	public long addCity(CityMasterEntity cityMasterEntity) {
		Serializable id = (Serializable) cityMasterDao.save(cityMasterEntity);
		System.out.println("service==" + id);
		Long r = (Long) id;
		long longValue = r.longValue();

		if (longValue != 0L || longValue > 0L) {

			return 1L;

		} else {
			return 0L;
		}
	}

	public CityMasterEntity getCityById(long city_id) {
		return cityMasterDao.findById(city_id);
	}

	public List<CityMasterEntity> cityMasterEntities() {
		return cityMasterDao.findAll();
	}

	public boolean deleteCity(long city_id) {
		return cityMasterDao.deletebyId(city_id);
	}

	public long updateCity(CityMasterEntity cityMasterEntity) {
		long longValue = cityMasterDao.update(cityMasterEntity);

		if (longValue != 0L || longValue > 0L) {

			return 1L;

		} else {
			return 0L;
		}
	}

	
	

}
