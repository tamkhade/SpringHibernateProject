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
@Table(name = "dep_mst")
public class DepartMentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "dep_id")
	private long dep_id;

	@Column(name = "dep_name")
	private String dep_name;
	
	@Column(name = "dep_crtd_by")
	private long dep_crtd_by;
	
	@Column(name = "dep_crtd_dt")
	private Date dep_crtd_dt;
	
	@Column(name = "dep_updt_by")
	private long dep_updt_by;
	
	@Column(name = "dep_updt_dt")
	private Date dep_updt_dt;
	
	@Column(name = "dep_status")
	private char dep_status;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "departMentEntity")
	private Set<ConsultantDetailMasterEntity> consultantDetailMasters;
	
	
	public long getDep_id() {
		return dep_id;
	}

	public void setDep_id(long dep_id) {
		this.dep_id = dep_id;
	}

	public String getDep_name() {
		return dep_name;
	}

	public void setDep_name(String dep_name) {
		this.dep_name = dep_name;
	}

	public long getDep_crtd_by() {
		return dep_crtd_by;
	}

	public void setDep_crtd_by(long dep_crtd_by) {
		this.dep_crtd_by = dep_crtd_by;
	}

	public Date getDep_crtd_dt() {
		return dep_crtd_dt;
	}

	public void setDep_crtd_dt(Date dep_crtd_dt) {
		this.dep_crtd_dt = dep_crtd_dt;
	}

	public long getDep_updt_by() {
		return dep_updt_by;
	}

	public void setDep_updt_by(long dep_updt_by) {
		this.dep_updt_by = dep_updt_by;
	}

	public Date getDep_updt_dt() {
		return dep_updt_dt;
	}

	public void setDep_updt_dt(Date dep_updt_dt) {
		this.dep_updt_dt = dep_updt_dt;
	}

	public char getDep_status() {
		return dep_status;
	}

	public void setDep_status(char dep_status) {
		this.dep_status = dep_status;
	}
}
