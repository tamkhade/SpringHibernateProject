package com.dao;

import java.util.List;

import com.model.City;
import com.model.Country;
import com.model.State;

public interface Daoint {
	
	
	public boolean addCountry(Country country);
	
	public List<Country> getCountryList();
	public List<State> getstatelist(Integer id);
	public List<City> getcitylist(Integer id);
}
