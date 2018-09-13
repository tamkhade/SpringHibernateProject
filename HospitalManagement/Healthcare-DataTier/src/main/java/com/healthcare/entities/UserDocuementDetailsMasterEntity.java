package com.healthcare.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="user_doc_dtl_mst")
public class UserDocuementDetailsMasterEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_doc_dtl_id")
	private long user_doc_dtl_id;
	
	@Column(name = "user_doc_no")
	private String user_doc_no;
	
	@Column(name = "user_doc_img")
	private byte[] user_doc_img;
	
	
	@Column(name = "doc_type_id")
	private long doc_type_id;
	

	@Column(name = "user_doc_crtd_by")
	private long user_doc_crtd_by;

	@Column(name = "user_doc_crtd_dt")
	private Date user_doc_crtd_dt;
	
	@Column(name = "user_doc_updt_by")
	private long user_doc_updt_by;

	@Column(name = "user_doc_updt_date")
	private Date user_doc_updt_date;
	
	@Column(name = "user_doc_status")
	private char user_doc_status;

	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "doc_type_id", insertable = false, updatable = false)
	private DocumentTypeMasterEntity documentTypeMasterEntity;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "org_user_id", insertable = false, updatable = false)
	private OrgnizationUserMasterEntity orgnizationUserMasterEntity;

	public long getUser_doc_dtl_id() {
		return user_doc_dtl_id;
	}

	public void setUser_doc_dtl_id(long user_doc_dtl_id) {
		this.user_doc_dtl_id = user_doc_dtl_id;
	}

	public String getUser_doc_no() {
		return user_doc_no;
	}

	public void setUser_doc_no(String user_doc_no) {
		this.user_doc_no = user_doc_no;
	}

	public byte[] getUser_doc_img() {
		return user_doc_img;
	}

	public void setUser_doc_img(byte[] user_doc_img) {
		this.user_doc_img = user_doc_img;
	}

	public long getDoc_type_id() {
		return doc_type_id;
	}

	public void setDoc_type_id(long doc_type_id) {
		this.doc_type_id = doc_type_id;
	}

	public long getUser_doc_crtd_by() {
		return user_doc_crtd_by;
	}

	public void setUser_doc_crtd_by(long user_doc_crtd_by) {
		this.user_doc_crtd_by = user_doc_crtd_by;
	}

	public Date getUser_doc_crtd_dt() {
		return user_doc_crtd_dt;
	}

	public void setUser_doc_crtd_dt(Date user_doc_crtd_dt) {
		this.user_doc_crtd_dt = user_doc_crtd_dt;
	}

	public long getUser_doc_updt_by() {
		return user_doc_updt_by;
	}

	public void setUser_doc_updt_by(long user_doc_updt_by) {
		this.user_doc_updt_by = user_doc_updt_by;
	}

	public Date getUser_doc_updt_date() {
		return user_doc_updt_date;
	}

	public void setUser_doc_updt_date(Date user_doc_updt_date) {
		this.user_doc_updt_date = user_doc_updt_date;
	}

	public char getUser_doc_status() {
		return user_doc_status;
	}

	public void setUser_doc_status(char user_doc_status) {
		this.user_doc_status = user_doc_status;
	}

	public DocumentTypeMasterEntity getDocumentTypeMasterEntity() {
		return documentTypeMasterEntity;
	}

	public void setDocumentTypeMasterEntity(DocumentTypeMasterEntity documentTypeMasterEntity) {
		this.documentTypeMasterEntity = documentTypeMasterEntity;
	}

	public OrgnizationUserMasterEntity getOrgnizationUserMasterEntity() {
		return orgnizationUserMasterEntity;
	}

	public void setOrgnizationUserMasterEntity(OrgnizationUserMasterEntity orgnizationUserMasterEntity) {
		this.orgnizationUserMasterEntity = orgnizationUserMasterEntity;
	}
	
	
}
