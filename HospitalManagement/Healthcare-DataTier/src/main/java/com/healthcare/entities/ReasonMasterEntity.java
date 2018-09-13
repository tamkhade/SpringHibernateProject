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
@Table(name = "reason_type_mst")
public class ReasonMasterEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "reason_type_id")
	private long reason_type_id;	
	
	@Column(name = "reason_type")
	private String reason_type;
	
	@Column(name = "reason_type_crtd_by")
	private long reason_type_crtd_by;
	
	@Column(name = "reason_type_crtd_dt")
	private Date reason_type_crtd_dt;
	
	@Column(name = "reason_type_updtd_dt")
	private Date reason_type_updtd_dt;
	
	@Column(name = "reason_type_updtd_by")
	private long reason_type_updtd_by;
	
	@Column(name = "reason_type_status")
	private char reason_type_status;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "raReasonMasterEntity")
	private Set<PatientMasterEntity> patientMasterEntities;

	public long getReason_type_id() {
		return reason_type_id;
	}

	public void setReason_type_id(long reason_type_id) {
		this.reason_type_id = reason_type_id;
	}

	public String getReason_type() {
		return reason_type;
	}

	public void setReason_type(String reason_type) {
		this.reason_type = reason_type;
	}

	public long getReason_type_crtd_by() {
		return reason_type_crtd_by;
	}

	public void setReason_type_crtd_by(long reason_type_crtd_by) {
		this.reason_type_crtd_by = reason_type_crtd_by;
	}

	public Date getReason_type_crtd_dt() {
		return reason_type_crtd_dt;
	}

	public void setReason_type_crtd_dt(Date reason_type_crtd_dt) {
		this.reason_type_crtd_dt = reason_type_crtd_dt;
	}

	public Date getReason_type_updtd_dt() {
		return reason_type_updtd_dt;
	}

	public void setReason_type_updtd_dt(Date reason_type_updtd_dt) {
		this.reason_type_updtd_dt = reason_type_updtd_dt;
	}

	public long getReason_type_updtd_by() {
		return reason_type_updtd_by;
	}

	public void setReason_type_updtd_by(long reason_type_updtd_by) {
		this.reason_type_updtd_by = reason_type_updtd_by;
	}

	public char getReason_type_status() {
		return reason_type_status;
	}

	public void setReason_type_status(char reason_type_status) {
		this.reason_type_status = reason_type_status;
	}

	public Set<PatientMasterEntity> getPatientMasterEntities() {
		return patientMasterEntities;
	}

	public void setPatientMasterEntities(Set<PatientMasterEntity> patientMasterEntities) {
		this.patientMasterEntities = patientMasterEntities;
	}
	
}
