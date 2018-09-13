package com.healthcare.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="user_add_mst")
public class UserAddressMasterEntity 
{

	@Id 
	@GeneratedValue
	@Column(name="user_add_id")
	private long user_add_id;
	
	@Column(name="area_id")
	private long area_id;
	
	@Column(name="user_add_landmark")
	private String user_add_landmark;
	
	@Column(name="user_address")
	private String user_address;
	
	@Column(name="user_add_crtd_by")
	private long user_add_crtd_by;
	
	@Column(name="user_add_crtd_dt")
	private Date user_add_crtd_dt;
	
	
	@Column(name="user_add_updt_by")
	private long user_add_updt_by;
	
	@Column(name="user_add_updt_dt")
	private Date user_add_updt_dt;
	
	@Column(name="user_add_status")
	private char user_add_status;
	
	
	
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "org_user_id", insertable = false, updatable = false)
	private OrgnizationUserMasterEntity orgnizationUserMasterEntity;

	public long getUser_add_id() {
		return user_add_id;
	}

	public void setUser_add_id(long user_add_id) {
		this.user_add_id = user_add_id;
	}

	public long getArea_id() {
		return area_id;
	}

	public void setArea_id(long area_id) {
		this.area_id = area_id;
	}

	public String getUser_add_landmark() {
		return user_add_landmark;
	}

	public void setUser_add_landmark(String user_add_landmark) {
		this.user_add_landmark = user_add_landmark;
	}

	public String getUser_address() {
		return user_address;
	}

	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}

	public long getUser_add_crtd_by() {
		return user_add_crtd_by;
	}

	public void setUser_add_crtd_by(long user_add_crtd_by) {
		this.user_add_crtd_by = user_add_crtd_by;
	}

	public Date getUser_add_crtd_dt() {
		return user_add_crtd_dt;
	}

	public void setUser_add_crtd_dt(Date user_add_crtd_dt) {
		this.user_add_crtd_dt = user_add_crtd_dt;
	}

	public long getUser_add_updt_by() {
		return user_add_updt_by;
	}

	public void setUser_add_updt_by(long user_add_updt_by) {
		this.user_add_updt_by = user_add_updt_by;
	}

	public Date getUser_add_updt_dt() {
		return user_add_updt_dt;
	}

	public void setUser_add_updt_dt(Date user_add_updt_dt) {
		this.user_add_updt_dt = user_add_updt_dt;
	}

	public char getUser_add_status() {
		return user_add_status;
	}

	public void setUser_add_status(char user_add_status) {
		this.user_add_status = user_add_status;
	}

	public OrgnizationUserMasterEntity getOrgnizationUserMasterEntity() {
		return orgnizationUserMasterEntity;
	}

	public void setOrgnizationUserMasterEntity(OrgnizationUserMasterEntity orgnizationUserMasterEntity) {
		this.orgnizationUserMasterEntity = orgnizationUserMasterEntity;
	}
}
