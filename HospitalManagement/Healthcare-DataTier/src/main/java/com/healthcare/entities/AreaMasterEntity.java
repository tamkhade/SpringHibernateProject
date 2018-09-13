package com.healthcare.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="area_mst")
public class AreaMasterEntity {
	
	@Id
	@GeneratedValue
	@Column(name="area_id")
	private long area_id;
	
	@Column(name="area_name")
	private String area_name;
	
	@Column(name="area_creatd_by")
	private long area_creatd_by;
	
	@Column(name="area_created_dt")
	private Date area_created_dt;
	
	@Column(name="area_updated_by")
	private long area_updated_by;
	
	@Column(name="area_upadted_dt")
	private Date area_upadted_dt;
	
	@Column(name="city_id")
	private long city_id;
	
	@Column(name="pincode_id")
	private long pincode_id;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "city_id", insertable = false, updatable = false, nullable=false)
	private CityMasterEntity cityMasterEntity;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pincode_id", insertable = false, updatable = false,nullable=false)
	private PincodeMasterEntity pincodeMasterEntity;
	
	 @OneToOne(mappedBy = "areaMasterEntity", cascade = CascadeType.ALL)  
	 private BankBranchMasterEntity bankBranchMasterEntity; 
	
	public long getArea_id() {
		return area_id;
	}

	public void setArea_id(long area_id) {
		this.area_id = area_id;
	}

	public String getArea_name() {
		return area_name;
	}

	public void setArea_name(String area_name) {
		this.area_name = area_name;
	}

	public long getArea_creatd_by() {
		return area_creatd_by;
	}

	public void setArea_creatd_by(long area_creatd_by) {
		this.area_creatd_by = area_creatd_by;
	}

	public Date getArea_created_dt() {
		return area_created_dt;
	}

	public void setArea_created_dt(Date area_created_dt) {
		this.area_created_dt = area_created_dt;
	}

	public long getArea_updated_by() {
		return area_updated_by;
	}

	public void setArea_updated_by(long area_updated_by) {
		this.area_updated_by = area_updated_by;
	}

	public Date getArea_upadted_dt() {
		return area_upadted_dt;
	}

	public void setArea_upadted_dt(Date area_upadted_dt) {
		this.area_upadted_dt = area_upadted_dt;
	}

	public long getCity_id() {
		return city_id;
	}

	public void setCity_id(long city_id) {
		this.city_id = city_id;
	}

	public long getPincode_id() {
		return pincode_id;
	}

	public void setPincode_id(long pincode_id) {
		this.pincode_id = pincode_id;
	}

	public CityMasterEntity getCityMasterEntity() {
		return cityMasterEntity;
	}

	public void setCityMasterEntity(CityMasterEntity cityMasterEntity) {
		this.cityMasterEntity = cityMasterEntity;
	}

	public PincodeMasterEntity getPincodeMasterEntity() {
		return pincodeMasterEntity;
	}

	public void setPincodeMasterEntity(PincodeMasterEntity pincodeMasterEntity) {
		this.pincodeMasterEntity = pincodeMasterEntity;
	}

	

	
}
