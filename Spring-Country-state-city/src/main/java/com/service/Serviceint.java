package com.service;

import java.util.List;

import com.model.City;
import com.model.Country;
import com.model.State;



public interface Serviceint {

	
	
	public List<Country> getCountryList();
	 
	public boolean addCountry(Country country);
	public List<State> getstatelist(Integer id);
	public List<City> getcitylist(Integer id);

	
}