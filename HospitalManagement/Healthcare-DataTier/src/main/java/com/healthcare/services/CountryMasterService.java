package com.healthcare.services;

import java.util.List;

import com.healthcare.entities.CountryMasterEntity;

public interface CountryMasterService {

	/*for save*/
	public long addCountry(CountryMasterEntity countryMasterEntity);
	
	
	/*for edit*/
	public CountryMasterEntity getCountrybyId(long country_id);
	
	
	/* for Displaying List*/
	public List<CountryMasterEntity> countryMasterEntities();
	
	
	/*for delete*/
	public boolean deleteCountry(long country_id);
	
	
	/*for update*/
	public long updateCountry(CountryMasterEntity countryMasterEntity);
	
}
