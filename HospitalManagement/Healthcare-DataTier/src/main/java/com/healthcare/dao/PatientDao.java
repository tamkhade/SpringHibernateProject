package com.healthcare.dao;

import java.util.List;
import java.util.Set;

import com.healthcare.entities.PatientMasterEntity;
import com.healthcare.utils.GenericDao;

public interface PatientDao  extends GenericDao<PatientMasterEntity>{
	
	public PatientMasterEntity patientlist(Long patId);
	
	public List<String> patientfullname();
	
	public Set<PatientMasterEntity> patientnamelist(String patient_fullname);

}
