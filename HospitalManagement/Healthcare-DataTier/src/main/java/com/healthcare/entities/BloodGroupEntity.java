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
@Table(name = "blood_grp_mst")
public class BloodGroupEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "blood_grp_id")
	private long blood_grp_id;

	@Column(name = "blood_grp_type")
	private String blood_grp_type;
	
	@Column(name = "blood_grp_crtd_dt")
	private Date blood_grp_crtd_dt;
	
	@Column(name = "blood_grp_crtd_by")
	private long blood_grp_crtd_by;
	

	@Column(name = "blood_grp_updtd_dt")
	private Date blood_grp_updtd_dt;
	
	@Column(name = "blood_grp_updtd_by")
	private long blood_grp_updtd_by;
	
	@Column(name = "blood_grp_status")
	private char blood_grp_status;
	

	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "bloodGroupEntity")
	private Set<PatientMasterEntity> patientMasterEntities;



	public long getBlood_grp_crtd_by() {
		return blood_grp_crtd_by;
	}


	public void setBlood_grp_crtd_by(long blood_grp_crtd_by) {
		this.blood_grp_crtd_by = blood_grp_crtd_by;
	}


	public Date getBlood_grp_crtd_dt() {
		return blood_grp_crtd_dt;
	}


	public void setBlood_grp_crtd_dt(Date blood_grp_crtd_dt) {
		this.blood_grp_crtd_dt = blood_grp_crtd_dt;
	}


	public Date getBlood_grp_updtd_dt() {
		return blood_grp_updtd_dt;
	}


	public void setBlood_grp_updtd_dt(Date blood_grp_updtd_dt) {
		this.blood_grp_updtd_dt = blood_grp_updtd_dt;
	}


	public long getBlood_grp_updtd_by() {
		return blood_grp_updtd_by;
	}


	public void setBlood_grp_updtd_by(long blood_grp_updtd_by) {
		this.blood_grp_updtd_by = blood_grp_updtd_by;
	}


	public char getBlood_grp_status() {
		return blood_grp_status;
	}


	public void setBlood_grp_status(char blood_grp_status) {
		this.blood_grp_status = blood_grp_status;
	}


	public Set<PatientMasterEntity> getPatientMasterEntities() {
		return patientMasterEntities;
	}


	public void setPatientMasterEntities(Set<PatientMasterEntity> patientMasterEntities) {
		this.patientMasterEntities = patientMasterEntities;
	}


	public long getBlood_grp_id() {
		return blood_grp_id;
	}


	public void setBlood_grp_id(long blood_grp_id) {
		this.blood_grp_id = blood_grp_id;
	}


	public String getBlood_grp_type() {
		return blood_grp_type;
	}


	public void setBlood_grp_type(String blood_grp_type) {
		this.blood_grp_type = blood_grp_type;
	}
	
	

	
	
}
