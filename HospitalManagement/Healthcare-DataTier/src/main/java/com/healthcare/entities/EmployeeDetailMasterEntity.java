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
@Table(name = "emp_dtl_mst")
public class EmployeeDetailMasterEntity 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_dtl_id")
	private long emp_dtl_id;

	@Column(name = "emp_mst_crtd_dt")
	private Date emp_mst_crtd_dt;
	
	@Column(name = "emp_mst_crtd_by")
	private long emp_mst_crtd_by;
	

	@Column(name = "emp_mst_updt_dt")
	private Date emp_mst_updt_dt;
	
	@Column(name = "emp_mst_updt_by")
	private long emp_mst_updt_by;
	
	@Column(name = "emp_dtl_status")
	private char emp_dtl_status;
	
	@Column(name = "emp_type_id")
	private long emp_type_id;
	
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "org_user_id", insertable = false, updatable = false)
	private OrgnizationUserMasterEntity orgnizationUserMasterEntity;
	
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "emp_type_id", insertable = false, updatable = false)
	private EmployeeTypeMasterEntity employeeTypeMasterEntity;


	public long getEmp_dtl_id() {
		return emp_dtl_id;
	}


	public void setEmp_dtl_id(long emp_dtl_id) {
		this.emp_dtl_id = emp_dtl_id;
	}


	public Date getEmp_mst_crtd_dt() {
		return emp_mst_crtd_dt;
	}


	public void setEmp_mst_crtd_dt(Date emp_mst_crtd_dt) {
		this.emp_mst_crtd_dt = emp_mst_crtd_dt;
	}


	public long getEmp_mst_crtd_by() {
		return emp_mst_crtd_by;
	}


	public void setEmp_mst_crtd_by(long emp_mst_crtd_by) {
		this.emp_mst_crtd_by = emp_mst_crtd_by;
	}


	public Date getEmp_mst_updt_dt() {
		return emp_mst_updt_dt;
	}


	public void setEmp_mst_updt_dt(Date emp_mst_updt_dt) {
		this.emp_mst_updt_dt = emp_mst_updt_dt;
	}


	public long getEmp_mst_updt_by() {
		return emp_mst_updt_by;
	}


	public void setEmp_mst_updt_by(long emp_mst_updt_by) {
		this.emp_mst_updt_by = emp_mst_updt_by;
	}


	public char getEmp_dtl_status() {
		return emp_dtl_status;
	}


	public void setEmp_dtl_status(char emp_dtl_status) {
		this.emp_dtl_status = emp_dtl_status;
	}


	public long getEmp_type_id() {
		return emp_type_id;
	}


	public void setEmp_type_id(long emp_type_id) {
		this.emp_type_id = emp_type_id;
	}


	public OrgnizationUserMasterEntity getOrgnizationUserMasterEntity() {
		return orgnizationUserMasterEntity;
	}


	public void setOrgnizationUserMasterEntity(OrgnizationUserMasterEntity orgnizationUserMasterEntity) {
		this.orgnizationUserMasterEntity = orgnizationUserMasterEntity;
	}


	public EmployeeTypeMasterEntity getEmployeeTypeMasterEntity() {
		return employeeTypeMasterEntity;
	}


	public void setEmployeeTypeMasterEntity(EmployeeTypeMasterEntity employeeTypeMasterEntity) {
		this.employeeTypeMasterEntity = employeeTypeMasterEntity;
	}
}
