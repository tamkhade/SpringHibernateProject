package com.healthcare.entities;

import java.util.Date;
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
@Table(name = "religion_mst")
public class ReligionMasterEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "religion_id")
	private long religion_id;

	@Column(name = "religion_type")
	private String religion_type;
	
	@Column(name = "religion_crtd_dt")
	private Date religion_crtd_dt;
	
	@Column(name = "religion_crtd_by")
	private long religion_crtd_by;
	
	@Column(name = "religion_updtd_dt")
	private Date religion_updtd_dt;
	
	@Column(name = "religion_updtd_by")
	private long religion_updtd_by;
	
	@Column(name = "religion_status")
	private char religion_status;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "religionMasterEntity")
	private Set<PatientMasterEntity> patientMasterEntities;
	
	

	public long getReligion_id() {
		return religion_id;
	}

	public void setReligion_id(long religion_id) {
		this.religion_id = religion_id;
	}

	public String getReligion_type() {
		return religion_type;
	}

	public void setReligion_type(String religion_type) {
		this.religion_type = religion_type;
	}

	public Date getReligion_crtd_dt() {
		return religion_crtd_dt;
	}

	public void setReligion_crtd_dt(Date religion_crtd_dt) {
		this.religion_crtd_dt = religion_crtd_dt;
	}

	public long getReligion_crtd_by() {
		return religion_crtd_by;
	}

	public void setReligion_crtd_by(long religion_crtd_by) {
		this.religion_crtd_by = religion_crtd_by;
	}

	public Date getReligion_updtd_dt() {
		return religion_updtd_dt;
	}

	public void setReligion_updtd_dt(Date religion_updtd_dt) {
		this.religion_updtd_dt = religion_updtd_dt;
	}

	public long getReligion_updtd_by() {
		return religion_updtd_by;
	}

	public void setReligion_updtd_by(long religion_updtd_by) {
		this.religion_updtd_by = religion_updtd_by;
	}

	public char getReligion_status() {
		return religion_status;
	}

	public void setReligion_status(char religion_status) {
		this.religion_status = religion_status;
	}

	public Set<PatientMasterEntity> getPatientMasterEntities() {
		return patientMasterEntities;
	}

	public void setPatientMasterEntities(Set<PatientMasterEntity> patientMasterEntities) {
		this.patientMasterEntities = patientMasterEntities;
	}
	
	
	
}
