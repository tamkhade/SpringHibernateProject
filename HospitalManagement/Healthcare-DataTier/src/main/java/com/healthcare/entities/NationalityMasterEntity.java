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
@Table(name = "nationality_mst")
public class NationalityMasterEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "nationality_id")
	private long nationality_id;

	@Column(name = "nationality_type")
	private String nationality_type;
	
	@Column(name = "nationality_crtd_by")
	private long nationality_crtd_by;
	
	@Column(name = "nationality_crtd_dt")
	private Date nationality_crtd_dt;
	
	@Column(name = "nationality_updtd_dt")
	private Date nationality_updtd_dt;
	
	@Column(name = "nationality_updtd_by")
	private long nationality_updtd_by;
	
	@Column(name = "nationality_status")
	private char nationality_status;
	
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "nationalityMasterEntity")
	private Set<PatientMasterEntity> patientMasterEntities;


	public long getNationality_id() {
		return nationality_id;
	}


	public void setNationality_id(long nationality_id) {
		this.nationality_id = nationality_id;
	}


	public String getNationality_type() {
		return nationality_type;
	}


	public void setNationality_type(String nationality_type) {
		this.nationality_type = nationality_type;
	}


	public long getNationality_crtd_by() {
		return nationality_crtd_by;
	}


	public void setNationality_crtd_by(long nationality_crtd_by) {
		this.nationality_crtd_by = nationality_crtd_by;
	}


	public Date getNationality_crtd_dt() {
		return nationality_crtd_dt;
	}


	public void setNationality_crtd_dt(Date nationality_crtd_dt) {
		this.nationality_crtd_dt = nationality_crtd_dt;
	}


	public Date getNationality_updtd_dt() {
		return nationality_updtd_dt;
	}


	public void setNationality_updtd_dt(Date nationality_updtd_dt) {
		this.nationality_updtd_dt = nationality_updtd_dt;
	}


	public long getNationality_updtd_by() {
		return nationality_updtd_by;
	}


	public void setNationality_updtd_by(long nationality_updtd_by) {
		this.nationality_updtd_by = nationality_updtd_by;
	}


	public char getNationality_status() {
		return nationality_status;
	}


	public void setNationality_status(char nationality_status) {
		this.nationality_status = nationality_status;
	}


	public Set<PatientMasterEntity> getPatientMasterEntities() {
		return patientMasterEntities;
	}


	public void setPatientMasterEntities(Set<PatientMasterEntity> patientMasterEntities) {
		this.patientMasterEntities = patientMasterEntities;
	}
	
	
	
	
	
	
}
