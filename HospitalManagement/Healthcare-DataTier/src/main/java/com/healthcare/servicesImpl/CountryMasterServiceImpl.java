package com.healthcare.servicesImpl;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.healthcare.dao.CountryMasterDao;
import com.healthcare.entities.CountryMasterEntity;
import com.healthcare.entities.StateMasterEntity;
import com.healthcare.services.CountryMasterService;

public class CountryMasterServiceImpl implements CountryMasterService {

	@Autowired
	CountryMasterDao countryMasterDao;

	public long addCountry(CountryMasterEntity countryMasterEntity) {
		Serializable id = (Serializable) countryMasterDao.save(countryMasterEntity);
		System.out.println("service==" + id);
		Long r = (Long) id;
		long longValue = r.longValue();

		if (longValue != 0L || longValue > 0L) {

			return 1L;

		} else {
			return 0L;
		}
	}

	public CountryMasterEntity getCountrybyId(long country_id) {
		return countryMasterDao.findById(country_id);
	}

	public List<CountryMasterEntity> countryMasterEntities() {
		return countryMasterDao.findAll();
	}


	public boolean deleteCountry(long country_id) {
		return countryMasterDao.deletebyId(country_id);
	}

	public long updateCountry(CountryMasterEntity countryMasterEntity) {
		long longValue = countryMasterDao.update(countryMasterEntity);

		if (longValue != 0L || longValue > 0L) {

			return 1L;

		} else {
			return 0L;
		}
	}


}
