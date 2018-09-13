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
@Table(name="user_credentials")
public class UserCredentialsEntity
{
	@Id 
	@GeneratedValue
	@Column(name="cred_id")
	private long cred_id;


	@Column(name="username")
	private String username;
	
	@Column(name="passwrd")
	private String passwrd;
	
	@Column(name="logged_in_sts")
	private int logged_in_sts;
	
	@Column(name="cred_created_by")
	private long cred_created_by;
	
	@Column(name="cred_crtd_dt")
	private Date cred_crtd_dt;
	
	@Column(name="cred_updtd_dt")
	private Date cred_updtd_dt;
	
	@Column(name="cred_updated_by")
	private long cred_updated_by;
	
	@Column(name="cred_sts")
	private char cred_sts;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "org_user_id", insertable = false, updatable = false)
	private OrgnizationUserMasterEntity orgnizationUserMasterEntity;

	public long getCred_id() {
		return cred_id;
	}

	public void setCred_id(long cred_id) {
		this.cred_id = cred_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasswrd() {
		return passwrd;
	}

	public void setPasswrd(String passwrd) {
		this.passwrd = passwrd;
	}

	public int getLogged_in_sts() {
		return logged_in_sts;
	}

	public void setLogged_in_sts(int logged_in_sts) {
		this.logged_in_sts = logged_in_sts;
	}

	public long getCred_created_by() {
		return cred_created_by;
	}

	public void setCred_created_by(long cred_created_by) {
		this.cred_created_by = cred_created_by;
	}

	public Date getCred_crtd_dt() {
		return cred_crtd_dt;
	}

	public void setCred_crtd_dt(Date cred_crtd_dt) {
		this.cred_crtd_dt = cred_crtd_dt;
	}

	public Date getCred_updtd_dt() {
		return cred_updtd_dt;
	}

	public void setCred_updtd_dt(Date cred_updtd_dt) {
		this.cred_updtd_dt = cred_updtd_dt;
	}

	public long getCred_updated_by() {
		return cred_updated_by;
	}

	public void setCred_updated_by(long cred_updated_by) {
		this.cred_updated_by = cred_updated_by;
	}

	public char getCred_sts() {
		return cred_sts;
	}

	public void setCred_sts(char cred_sts) {
		this.cred_sts = cred_sts;
	}

	public OrgnizationUserMasterEntity getOrgnizationUserMasterEntity() {
		return orgnizationUserMasterEntity;
	}

	public void setOrgnizationUserMasterEntity(OrgnizationUserMasterEntity orgnizationUserMasterEntity) {
		this.orgnizationUserMasterEntity = orgnizationUserMasterEntity;
	}
}
