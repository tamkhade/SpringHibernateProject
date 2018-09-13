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
@Table(name="bnk_mst")
public class BankMasterEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "bnk_id")
	private long bnk_id;
	
	@Column(name = "bnk_name")
	private String bnk_name;
	
	@Column(name = "bnk_crtd_by")
	private long bnk_crtd_by;
	
	@Column(name = "bnk_crtd_dt")
	private Date bnk_crtd_dt;
	
	@Column(name = "bnk_updtd_by")
	private long bnk_updtd_by;
	
	@Column(name = "bnk_updtd_dt")
	private Date bnk_updtd_dt;
	
	@Column(name = "bnk_status")
	private char bnk_status;
	
	@JsonIgnore
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="bankMasterEntity",orphanRemoval=true)
	private Set<BankBranchMasterEntity>bankBranchMasterEntities;

	public long getBnk_id() {
		return bnk_id;
	}

	public void setBnk_id(long bnk_id) {
		this.bnk_id = bnk_id;
	}

	public String getBnk_name() {
		return bnk_name;
	}

	public void setBnk_name(String bnk_name) {
		this.bnk_name = bnk_name;
	}

	public long getBnk_crtd_by() {
		return bnk_crtd_by;
	}

	public void setBnk_crtd_by(long bnk_crtd_by) {
		this.bnk_crtd_by = bnk_crtd_by;
	}

	public Date getBnk_crtd_dt() {
		return bnk_crtd_dt;
	}

	public void setBnk_crtd_dt(Date bnk_crtd_dt) {
		this.bnk_crtd_dt = bnk_crtd_dt;
	}

	public long getBnk_updtd_by() {
		return bnk_updtd_by;
	}

	public void setBnk_updtd_by(long bnk_updtd_by) {
		this.bnk_updtd_by = bnk_updtd_by;
	}

	public Date getBnk_updtd_dt() {
		return bnk_updtd_dt;
	}

	public void setBnk_updtd_dt(Date bnk_updtd_dt) {
		this.bnk_updtd_dt = bnk_updtd_dt;
	}

	public char getBnk_status() {
		return bnk_status;
	}

	public void setBnk_status(char bnk_status) {
		this.bnk_status = bnk_status;
	}

	
	
}
