package com.dto;

import java.util.ArrayList;
import java.util.List;

import com.model.Country;
import com.model.State;



public class StudentFormConverter {

	
	public static Country transferStudentFormToDto(Country country) {
		
		Country cou=new Country();
		cou.setCid(country.getCid());
		cou.setCountry(country.getCountry());
		
		
		List<State> stateList = new ArrayList<State>();

		List<State> state1 = country.getStatelist();
		
		for (State state :state1) {
	         State state2 = new State();
			state2.setSid(state.getSid());
			state2.setState(state.getState());
			state2.setCountry(cou);
			    
			stateList.add(state2);
		}
		
		cou.setStatelist(stateList);
		return cou;
		
		
		
		
	}
	
}