package com.healthcare.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="degree_mst")
public class DegreeMasterEntity {

	@Id 
	@GeneratedValue
	@Column(name="degree_id")
	private long degree_id;
	
	@Column(name="degree_nm")
	private String  degree_nm;
	
	@Column(name="degree_crtd_by")
	private long  degree_crtd_by;
	
	@Column(name="degree_crted_dt")
	private Date  degree_crted_dt;
	
	@Column(name="degree_updt_by")
	private long  degree_updt_by;
	
	@Column(name="degree_updt_dt")
	private Date  degree_updt_dt;
	
	@Column(name="degree_status")
	private String  degree_status;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "degreeMasterEntity")
	private Set<OrgnizationUserMasterEntity> orgnizationUserMasterEntities;

	public long getDegree_id() {
		return degree_id;
	}

	public void setDegree_id(long degree_id) {
		this.degree_id = degree_id;
	}

	public String getDegree_nm() {
		return degree_nm;
	}

	public void setDegree_nm(String degree_nm) {
		this.degree_nm = degree_nm;
	}

	public long getDegree_crtd_by() {
		return degree_crtd_by;
	}

	public void setDegree_crtd_by(long degree_crtd_by) {
		this.degree_crtd_by = degree_crtd_by;
	}

	public Date getDegree_crted_dt() {
		return degree_crted_dt;
	}

	public void setDegree_crted_dt(Date degree_crted_dt) {
		this.degree_crted_dt = degree_crted_dt;
	}

	public long getDegree_updt_by() {
		return degree_updt_by;
	}

	public void setDegree_updt_by(long degree_updt_by) {
		this.degree_updt_by = degree_updt_by;
	}

	public Date getDegree_updt_dt() {
		return degree_updt_dt;
	}

	public void setDegree_updt_dt(Date degree_updt_dt) {
		this.degree_updt_dt = degree_updt_dt;
	}

	public String getDegree_status() {
		return degree_status;
	}

	public void setDegree_status(String degree_status) {
		this.degree_status = degree_status;
	}

	public Set<OrgnizationUserMasterEntity> getOrgnizationUserMasterEntities() {
		return orgnizationUserMasterEntities;
	}

	public void setOrgnizationUserMasterEntities(Set<OrgnizationUserMasterEntity> orgnizationUserMasterEntities) {
		this.orgnizationUserMasterEntities = orgnizationUserMasterEntities;
	}
}
