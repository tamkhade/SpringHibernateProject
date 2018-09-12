package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.SampleDao;
import com.model.Samplemodel;

public class SampleServiceImpl implements Sampleservice {

	@Autowired
	SampleDao sampleDao;
	public boolean savedata(Samplemodel samplemodel) {
		// TODO Auto-generated method stub
		return sampleDao.savedata(samplemodel);
	}
	public List<Samplemodel> samplList() {
		// TODO Auto-generated method stub
		return sampleDao.listdata();
	}
	public Samplemodel editname(int id) {
		// TODO Auto-generated method stub
		return sampleDao.listodata(id);
	}
	public boolean deleted(int id) {
		// TODO Auto-generated method stub
		return sampleDao.deletedata(id);
	}

}
