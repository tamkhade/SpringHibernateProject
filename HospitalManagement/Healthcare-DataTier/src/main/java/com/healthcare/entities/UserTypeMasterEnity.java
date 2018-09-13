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
@Table(name="user_type_mst")
public class UserTypeMasterEnity 
{
	@Id 
	@GeneratedValue
	@Column(name="user_type_id")
	private long user_type_id;
	
	@Column(name="user_type")
	private String user_type;
	
	@Column(name="user_type_created_by")
	private long user_type_created_by;
	
	@Column(name="user_type_created_dt")
	private Date user_type_created_dt;
	
	@Column(name="user_type_upadted_by")
	private long user_type_upadted_by;
	
	@Column(name="user_type_updated_date")
	private Date user_type_updated_date;
	
	@Column(name="user_type_status")
	private char user_type_status;
	
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "userTypeMasterEnity")
	private Set<OrgnizationUserMasterEntity> orgnizationUserMasterEntities;


	public long getUser_type_id() {
		return user_type_id;
	}


	public void setUser_type_id(long user_type_id) {
		this.user_type_id = user_type_id;
	}


	public String getUser_type() {
		return user_type;
	}


	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}


	public long getUser_type_created_by() {
		return user_type_created_by;
	}


	public void setUser_type_created_by(long user_type_created_by) {
		this.user_type_created_by = user_type_created_by;
	}


	public Date getUser_type_created_dt() {
		return user_type_created_dt;
	}


	public void setUser_type_created_dt(Date user_type_created_dt) {
		this.user_type_created_dt = user_type_created_dt;
	}


	public long getUser_type_upadted_by() {
		return user_type_upadted_by;
	}


	public void setUser_type_upadted_by(long user_type_upadted_by) {
		this.user_type_upadted_by = user_type_upadted_by;
	}


	public Date getUser_type_updated_date() {
		return user_type_updated_date;
	}


	public void setUser_type_updated_date(Date user_type_updated_date) {
		this.user_type_updated_date = user_type_updated_date;
	}

	public char getUser_type_status() {
		return user_type_status;
	}


	public void setUser_type_status(char user_type_status) {
		this.user_type_status = user_type_status;
	}


	public Set<OrgnizationUserMasterEntity> getOrgnizationUserMasterEntities() {
		return orgnizationUserMasterEntities;
	}


	public void setOrgnizationUserMasterEntities(Set<OrgnizationUserMasterEntity> orgnizationUserMasterEntities) {
		this.orgnizationUserMasterEntities = orgnizationUserMasterEntities;
	}
}
