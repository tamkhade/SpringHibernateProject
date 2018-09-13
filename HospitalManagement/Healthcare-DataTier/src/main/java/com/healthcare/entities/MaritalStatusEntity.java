package com.healthcare.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "martial_status_mst")
public class MaritalStatusEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "martial_status_id")
	private long martial_status_id;

	@Column(name = "martial_status")
	private String marital_status;

	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "maritalStatusEntity")
	private Set<PatientMasterEntity> patientMasterEntities;


	public long getMartial_status_id() {
		return martial_status_id;
	}

	public void setMartial_status_id(long martial_status_id) {
		this.martial_status_id = martial_status_id;
	}

	public String getMarital_status() {
		return marital_status;
	}

	public void setMarital_status(String marital_status) {
		this.marital_status = marital_status;
	}

	public Set<PatientMasterEntity> getPatientMasterEntities() {
		return patientMasterEntities;
	}

	public void setPatientMasterEntities(Set<PatientMasterEntity> patientMasterEntities) {
		this.patientMasterEntities = patientMasterEntities;
	}

	

	
	
}
