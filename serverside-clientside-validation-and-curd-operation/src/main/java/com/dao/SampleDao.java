package com.dao;

import java.util.List;

import com.model.Samplemodel;

public interface SampleDao {

	public boolean savedata(Samplemodel samplemodel);
	
	public List<Samplemodel> listdata();
	
	public Samplemodel listodata(int id);
	
	public boolean deletedata(int id);
}
