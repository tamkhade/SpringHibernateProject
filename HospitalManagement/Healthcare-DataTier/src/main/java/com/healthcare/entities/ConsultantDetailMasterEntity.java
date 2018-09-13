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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "consult_dtl_mst")
public class ConsultantDetailMasterEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "consult_dtl_id")
	private long consult_dtl_id;

	@Column(name = "consult_reg_no")
	private String consult_reg_no;
	
	@Column(name = "consult_crtd_dt")
	private Date consult_crtd_dt;
	
	@Column(name = "consult_crtd_by")
	private long consult_crtd_by;
	
	@Column(name = "consult_updtd_dt")
	private Date consult_updtd_dt;
	
	@Column(name = "consult_updtd_by")
	private long consult_updtd_by;
	
	@Column(name = "consult_dtl_status")
	private char consult_dtl_status;
	
	@Column(name = "consult_type_id")
	private long consult_type_id;

	@Column(name = "dep_id")
	private long dep_id;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "consult_type_id", insertable = false, updatable = false)
	private ConsultantTypeMasterEntity consultantTypeMasterEntity;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "dep_id", insertable = false, updatable = false)
	private DepartMentEntity departMentEntity;
	
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "org_user_id", insertable = false, updatable = false)
	private OrgnizationUserMasterEntity orgnizationUserMasterEntity;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "consultantDetailMasterEntity")
	private Set<ConsultantFeesMasterEntity> consultantFeesMasterEntities;

	public long getConsult_dtl_id() {
		return consult_dtl_id;
	}

	public void setConsult_dtl_id(long consult_dtl_id) {
		this.consult_dtl_id = consult_dtl_id;
	}

	public String getConsult_reg_no() {
		return consult_reg_no;
	}

	public void setConsult_reg_no(String consult_reg_no) {
		this.consult_reg_no = consult_reg_no;
	}

	public Date getConsult_crtd_dt() {
		return consult_crtd_dt;
	}

	public void setConsult_crtd_dt(Date consult_crtd_dt) {
		this.consult_crtd_dt = consult_crtd_dt;
	}

	public long getConsult_crtd_by() {
		return consult_crtd_by;
	}

	public void setConsult_crtd_by(long consult_crtd_by) {
		this.consult_crtd_by = consult_crtd_by;
	}

	public Date getConsult_updtd_dt() {
		return consult_updtd_dt;
	}

	public void setConsult_updtd_dt(Date consult_updtd_dt) {
		this.consult_updtd_dt = consult_updtd_dt;
	}

	public long getConsult_updtd_by() {
		return consult_updtd_by;
	}

	public void setConsult_updtd_by(long consult_updtd_by) {
		this.consult_updtd_by = consult_updtd_by;
	}

	public char getConsult_dtl_status() {
		return consult_dtl_status;
	}

	public void setConsult_dtl_status(char consult_dtl_status) {
		this.consult_dtl_status = consult_dtl_status;
	}

	public long getConsult_type_id() {
		return consult_type_id;
	}

	public void setConsult_type_id(long consult_type_id) {
		this.consult_type_id = consult_type_id;
	}


	public long getDep_id() {
		return dep_id;
	}

	public void setDep_id(long dep_id) {
		this.dep_id = dep_id;
	}

	public ConsultantTypeMasterEntity getConsultantTypeMasterEntity() {
		return consultantTypeMasterEntity;
	}

	public void setConsultantTypeMasterEntity(ConsultantTypeMasterEntity consultantTypeMasterEntity) {
		this.consultantTypeMasterEntity = consultantTypeMasterEntity;
	}

	public DepartMentEntity getDepartMentEntity() {
		return departMentEntity;
	}

	public void setDepartMentEntity(DepartMentEntity departMentEntity) {
		this.departMentEntity = departMentEntity;
	}

	public OrgnizationUserMasterEntity getOrgnizationUserMasterEntity() {
		return orgnizationUserMasterEntity;
	}

	public void setOrgnizationUserMasterEntity(OrgnizationUserMasterEntity orgnizationUserMasterEntity) {
		this.orgnizationUserMasterEntity = orgnizationUserMasterEntity;
	}

	public Set<ConsultantFeesMasterEntity> getConsultantFeesMasterEntities() {
		return consultantFeesMasterEntities;
	}

	public void setConsultantFeesMasterEntities(Set<ConsultantFeesMasterEntity> consultantFeesMasterEntities) {
		this.consultantFeesMasterEntities = consultantFeesMasterEntities;
	}
}
