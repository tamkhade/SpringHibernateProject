package com.healthcare.services;

import java.util.List;
import java.util.Set;

import com.healthcare.dao.PatientDao;
import com.healthcare.entities.PatientMasterEntity;

public interface PatientServices {

	public long savepatient(PatientMasterEntity patient_master);
	public Set<PatientMasterEntity> patientMasterEntitieslist();
	
	public PatientMasterEntity patientlist(Long patId);
	
	public Long patientupdate(PatientMasterEntity patientMasterEntity);
	
	 public List<String> getName(String name);
	 
    public Set<PatientMasterEntity> patientnamelist(String patient_fullname);
}
