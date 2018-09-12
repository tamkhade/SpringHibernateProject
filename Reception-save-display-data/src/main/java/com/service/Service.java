package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.Dao.IDao;
import com.model.Receptionist;


public class Service implements IService {


	@Autowired
	IDao idao ;

	public Boolean saveReception(Receptionist recp) {
		// TODO Auto-generated method stub
		return idao.saveReception(recp);
	}

	public List<Receptionist> getReceptionList() {
		// TODO Auto-generated method stub
		return idao.getReceptionList();
	}
	
}
