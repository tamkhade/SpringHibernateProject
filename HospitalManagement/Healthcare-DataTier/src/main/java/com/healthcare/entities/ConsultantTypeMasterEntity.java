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
@Table(name = "consult_type_mst")
public class ConsultantTypeMasterEntity
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "consult_type_id")
	private long consult_type_id;

	@Column(name = "consult_type")
	private String consult_type;
	
	@Column(name = "consult_crted_by")
	private long consult_crted_by;
	
	@Column(name = "consult_crted_dt")
	private Date consult_crted_dt;
	
	@Column(name = "consult_updtd_by")
	private long consult_updtd_by;
	
	@Column(name = "consult_updtd_dt")
	private Date consult_updtd_dt;
	
	@Column(name = "consult_type_status")
	private char consult_type_status;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "consultantTypeMasterEntity")
	private Set<ConsultantDetailMasterEntity> consultantDetailMasterEntities;

	public long getConsult_type_id() {
		return consult_type_id;
	}

	public void setConsult_type_id(long consult_type_id) {
		this.consult_type_id = consult_type_id;
	}

	public String getConsult_type() {
		return consult_type;
	}

	public void setConsult_type(String consult_type) {
		this.consult_type = consult_type;
	}

	public long getConsult_crted_by() {
		return consult_crted_by;
	}

	public void setConsult_crted_by(long consult_crted_by) {
		this.consult_crted_by = consult_crted_by;
	}

	public Date getConsult_crted_dt() {
		return consult_crted_dt;
	}

	public void setConsult_crted_dt(Date consult_crted_dt) {
		this.consult_crted_dt = consult_crted_dt;
	}

	public long getConsult_updtd_by() {
		return consult_updtd_by;
	}

	public void setConsult_updtd_by(long consult_updtd_by) {
		this.consult_updtd_by = consult_updtd_by;
	}

	public Date getConsult_updtd_dt() {
		return consult_updtd_dt;
	}

	public void setConsult_updtd_dt(Date consult_updtd_dt) {
		this.consult_updtd_dt = consult_updtd_dt;
	}

	public char getConsult_type_status() {
		return consult_type_status;
	}

	public void setConsult_type_status(char consult_type_status) {
		this.consult_type_status = consult_type_status;
	}

	public Set<ConsultantDetailMasterEntity> getConsultantDetailMasterEntities() {
		return consultantDetailMasterEntities;
	}

	public void setConsultantDetailMasterEntities(Set<ConsultantDetailMasterEntity> consultantDetailMasterEntities) {
		this.consultantDetailMasterEntities = consultantDetailMasterEntities;
	}
}
