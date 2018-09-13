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
@Table(name="user_bnk_dtl_mst")
public class UserBankDetailMaster 
{

	@Id 
	@GeneratedValue
	@Column(name="user_bnk_dtl_id")
	private long user_bnk_dtl_id;
	
	@Column(name="bnk_id")
	private long bnk_id;
	
	@Column(name="bnk_brnch_id")
	private long bnk_brnch_id;
	
	@Column(name="bnk_acc_type_id")
	private long bnk_acc_type_id;

	@Column(name="bnk_ac_no")
	private String bnk_ac_no;
	
	@Column(name="user_bnk_crtd_by")
	private long user_bnk_crtd_by;
	
	@Column(name="user_bnk_crtd_dt")
	private Date user_bnk_crtd_dt;
	
	
	@Column(name="user_bnk_updt_by")
	private long user_bnk_updt_by;
	
	@Column(name="user_bnk_updt_dt")
	private Date user_bnk_updt_dt;
	
	@Column(name="user_bnk_status")
	private char user_bnk_status;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "org_user_id", insertable = false, updatable = false)
	private OrgnizationUserMasterEntity orgnizationUserMasterEntity;

	public long getUser_bnk_dtl_id() {
		return user_bnk_dtl_id;
	}

	public void setUser_bnk_dtl_id(long user_bnk_dtl_id) {
		this.user_bnk_dtl_id = user_bnk_dtl_id;
	}

	public long getBnk_id() {
		return bnk_id;
	}

	public void setBnk_id(long bnk_id) {
		this.bnk_id = bnk_id;
	}

	public long getBnk_brnch_id() {
		return bnk_brnch_id;
	}

	public void setBnk_brnch_id(long bnk_brnch_id) {
		this.bnk_brnch_id = bnk_brnch_id;
	}

	public long getBnk_acc_type_id() {
		return bnk_acc_type_id;
	}

	public void setBnk_acc_type_id(long bnk_acc_type_id) {
		this.bnk_acc_type_id = bnk_acc_type_id;
	}

	public String getBnk_ac_no() {
		return bnk_ac_no;
	}

	public void setBnk_ac_no(String bnk_ac_no) {
		this.bnk_ac_no = bnk_ac_no;
	}

	public long getUser_bnk_crtd_by() {
		return user_bnk_crtd_by;
	}

	public void setUser_bnk_crtd_by(long user_bnk_crtd_by) {
		this.user_bnk_crtd_by = user_bnk_crtd_by;
	}

	public Date getUser_bnk_crtd_dt() {
		return user_bnk_crtd_dt;
	}

	public void setUser_bnk_crtd_dt(Date user_bnk_crtd_dt) {
		this.user_bnk_crtd_dt = user_bnk_crtd_dt;
	}

	public long getUser_bnk_updt_by() {
		return user_bnk_updt_by;
	}

	public void setUser_bnk_updt_by(long user_bnk_updt_by) {
		this.user_bnk_updt_by = user_bnk_updt_by;
	}

	public Date getUser_bnk_updt_dt() {
		return user_bnk_updt_dt;
	}

	public void setUser_bnk_updt_dt(Date user_bnk_updt_dt) {
		this.user_bnk_updt_dt = user_bnk_updt_dt;
	}

	public char getUser_bnk_status() {
		return user_bnk_status;
	}

	public void setUser_bnk_status(char user_bnk_status) {
		this.user_bnk_status = user_bnk_status;
	}

	public OrgnizationUserMasterEntity getOrgnizationUserMasterEntity() {
		return orgnizationUserMasterEntity;
	}

	public void setOrgnizationUserMasterEntity(OrgnizationUserMasterEntity orgnizationUserMasterEntity) {
		this.orgnizationUserMasterEntity = orgnizationUserMasterEntity;
	}
}
