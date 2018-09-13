package com.healthcare.servicesImpl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.healthcare.dao.MarketPersonMasterDao;
import com.healthcare.entities.MarketPersonMaster;

import com.healthcare.services.MarketPersonMasterService;

public class MarketPersonMasterServiceImpl implements MarketPersonMasterService{

	@Autowired
	MarketPersonMasterDao marketPersonMasterDao;
	
	public Set<MarketPersonMaster> marketPerMasterlist() {
		List<MarketPersonMaster> desination1 = marketPersonMasterDao.findAll();

		Set<MarketPersonMaster> desination2 = new HashSet<MarketPersonMaster>();

		for (MarketPersonMaster t : desination1) {
			System.out.println(t.getMrkt_prsn_nm());
			desination2.add(t);
		}

		return desination2;
	}

}
