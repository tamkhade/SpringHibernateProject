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
@Table(name = "emp_type_mst")
public class EmployeeTypeMasterEntity 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_type_id")
	private long emp_type_id;

	@Column(name = "emp_type")
	private String emp_type;
	
	@Column(name = "emp_type_crtd_dt")
	private Date emp_type_crtd_dt;
	
	@Column(name = "emp_type_crted_by")
	private long emp_type_crted_by;
	

	@Column(name = "emp_type_updtd_dt")
	private Date emp_type_updtd_dt;
	
	@Column(name = "emp_type_updtd_by")
	private long emp_type_updtd_by;
	
	@Column(name = "emp_type_status")
	private char emp_type_status;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "employeeTypeMasterEntity")
	private Set<EmployeeDetailMasterEntity> employeeDetailMasterEntities;

	public long getEmp_type_id() {
		return emp_type_id;
	}

	public void setEmp_type_id(long emp_type_id) {
		this.emp_type_id = emp_type_id;
	}

	public String getEmp_type() {
		return emp_type;
	}

	public void setEmp_type(String emp_type) {
		this.emp_type = emp_type;
	}

	public Date getEmp_type_crtd_dt() {
		return emp_type_crtd_dt;
	}

	public void setEmp_type_crtd_dt(Date emp_type_crtd_dt) {
		this.emp_type_crtd_dt = emp_type_crtd_dt;
	}

	public long getEmp_type_crted_by() {
		return emp_type_crted_by;
	}

	public void setEmp_type_crted_by(long emp_type_crted_by) {
		this.emp_type_crted_by = emp_type_crted_by;
	}

	public Date getEmp_type_updtd_dt() {
		return emp_type_updtd_dt;
	}

	public void setEmp_type_updtd_dt(Date emp_type_updtd_dt) {
		this.emp_type_updtd_dt = emp_type_updtd_dt;
	}

	public long getEmp_type_updtd_by() {
		return emp_type_updtd_by;
	}

	public void setEmp_type_updtd_by(long emp_type_updtd_by) {
		this.emp_type_updtd_by = emp_type_updtd_by;
	}

	public char getEmp_type_status() {
		return emp_type_status;
	}

	public void setEmp_type_status(char emp_type_status) {
		this.emp_type_status = emp_type_status;
	}

	public Set<EmployeeDetailMasterEntity> getEmployeeDetailMasterEntities() {
		return employeeDetailMasterEntities;
	}

	public void setEmployeeDetailMasterEntities(Set<EmployeeDetailMasterEntity> employeeDetailMasterEntities) {
		this.employeeDetailMasterEntities = employeeDetailMasterEntities;
	}
}
