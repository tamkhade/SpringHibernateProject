package com.service;

import java.util.List;

import com.model.Receptionist;

public interface IService {


	public Boolean saveReception(Receptionist recp);
	public List<Receptionist> getReceptionList();
	
}
