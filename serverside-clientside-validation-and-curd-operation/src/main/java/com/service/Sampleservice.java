package com.service;

import java.util.List;

import com.model.Samplemodel;

public interface Sampleservice {
	
	public boolean savedata(Samplemodel samplemodel);

	public List<Samplemodel> samplList();
	
	public Samplemodel editname(int id);
	
	public boolean deleted(int id);
}
