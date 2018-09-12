package com.Dao;

import java.util.List;

import com.model.Receptionist;


public interface IDao {

	
	public Boolean saveReception(Receptionist recp);
	public List<Receptionist> getReceptionList();
}
