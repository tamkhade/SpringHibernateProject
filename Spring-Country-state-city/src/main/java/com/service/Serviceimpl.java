package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.Daoint;
import com.dto.StudentFormConverter;
import com.model.City;
import com.model.Country;
import com.model.State;


public class Serviceimpl implements Serviceint {

	@Autowired
	Daoint iDao;


	public boolean addCountry(Country country) {
		return iDao.addCountry(StudentFormConverter
				.transferStudentFormToDto(country));
	}

	public List<Country> getCountryList(){
		return iDao.getCountryList();
	}

	public List<State> getstatelist(Integer id) {
		// TODO Auto-generated method stub
		System.out.println("hii");
		
		return iDao.getstatelist(id);
	}

	public List<City> getcitylist(Integer id) {
		// TODO Auto-generated method stub
		return iDao.getcitylist(id);
	}

}