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
@Table(name = "service_mst")
public class ServiceMasterEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "service_id")
	private long service_id;

	@Column(name = "service_name")
	private String service_name;
	
	@Column(name = "service_crtd_dt")
	private Date service_crtd_dt;
	
	@Column(name = "service_crtd_by")
	private long service_crtd_by;
	
	@Column(name = "service_updtd_dt")
	private Date service_updtd_dt;
	
	@Column(name = "service_updtd_by")
	private long service_updtd_by;
	
	@Column(name = "service_status")
	private char service_status;
	
	@Column(name = "cost_head_id")
	private long cost_head_id;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "serviceMasterEntity")
	private Set<ConsultantFeesMasterEntity> consultantFeesMasterEntities;

	public long getService_id() {
		return service_id;
	}

	public void setService_id(long service_id) {
		this.service_id = service_id;
	}

	public String getService_name() {
		return service_name;
	}

	public void setService_name(String service_name) {
		this.service_name = service_name;
	}

	public Date getService_crtd_dt() {
		return service_crtd_dt;
	}

	public void setService_crtd_dt(Date service_crtd_dt) {
		this.service_crtd_dt = service_crtd_dt;
	}

	public long getService_crtd_by() {
		return service_crtd_by;
	}

	public void setService_crtd_by(long service_crtd_by) {
		this.service_crtd_by = service_crtd_by;
	}

	public Date getService_updtd_dt() {
		return service_updtd_dt;
	}

	public void setService_updtd_dt(Date service_updtd_dt) {
		this.service_updtd_dt = service_updtd_dt;
	}

	public long getService_updtd_by() {
		return service_updtd_by;
	}

	public void setService_updtd_by(long service_updtd_by) {
		this.service_updtd_by = service_updtd_by;
	}

	public char getService_status() {
		return service_status;
	}

	public void setService_status(char service_status) {
		this.service_status = service_status;
	}

	public long getCost_head_id() {
		return cost_head_id;
	}

	public void setCost_head_id(long cost_head_id) {
		this.cost_head_id = cost_head_id;
	}

	public Set<ConsultantFeesMasterEntity> getConsultantFeesMasterEntities() {
		return consultantFeesMasterEntities;
	}

	public void setConsultantFeesMasterEntities(Set<ConsultantFeesMasterEntity> consultantFeesMasterEntities) {
		this.consultantFeesMasterEntities = consultantFeesMasterEntities;
	}
}
