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
@Table(name = "pincode_master")
public class PincodeMasterEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "pincode_id")
	private long pincode_id;
	
	@Column(name = "pincode_number")
	private String pincode_number;
	
	@Column(name = "pincode_created_by")
	private long pincode_created_by;
	
	@Column(name = "pincode_creatd_dt")
	private Date pincode_creatd_dt;
	
	@Column(name = "pincode_updated_by")
	private long pincode_updated_by;
	
	@Column(name = "pincode_updated_dt")
	private Date pincode_updated_dt;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "pincodeMasterEntity")
	private Set<AreaMasterEntity> areaMasterEntities;

	public long getPincode_id() {
		return pincode_id;
	}

	public void setPincode_id(long pincode_id) {
		this.pincode_id = pincode_id;
	}

	public String getPincode_number() {
		return pincode_number;
	}

	public void setPincode_number(String pincode_number) {
		this.pincode_number = pincode_number;
	}

	public long getPincode_created_by() {
		return pincode_created_by;
	}

	public void setPincode_created_by(long pincode_created_by) {
		this.pincode_created_by = pincode_created_by;
	}

	public Date getPincode_creatd_dt() {
		return pincode_creatd_dt;
	}

	public void setPincode_creatd_dt(Date pincode_creatd_dt) {
		this.pincode_creatd_dt = pincode_creatd_dt;
	}

	public long getPincode_updated_by() {
		return pincode_updated_by;
	}

	public void setPincode_updated_by(long pincode_updated_by) {
		this.pincode_updated_by = pincode_updated_by;
	}

	public Date getPincode_updated_dt() {
		return pincode_updated_dt;
	}

	public void setPincode_updated_dt(Date pincode_updated_dt) {
		this.pincode_updated_dt = pincode_updated_dt;
	}

	/*public Set<AreaMasterEntity> getAreaMasterEntities() {
		return areaMasterEntities;
	}

	public void setAreaMasterEntities(Set<AreaMasterEntity> areaMasterEntities) {
		this.areaMasterEntities = areaMasterEntities;
	}*/
	
	
}
