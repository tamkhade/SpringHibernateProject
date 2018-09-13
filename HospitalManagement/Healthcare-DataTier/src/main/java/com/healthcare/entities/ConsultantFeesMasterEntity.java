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
@Table(name = "consult_fee_mst")
public class ConsultantFeesMasterEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "consult_fee_mst_id")
	private long consult_fee_mst_id;

	@Column(name = "fees_amount")
	private String fees_amount;
	
	@Column(name = "no_dys_to_revisit")
	private long no_dys_to_revisit;
	
	@Column(name = "consult_fee_crtd_by")
	private long consult_fee_crtd_by;
	
	@Column(name = "consult_fee_crtd_dt")
	private Date consult_fee_crtd_dt;
	
	@Column(name = "consult_fee_updtd_by")
	private long consult_fee_updtd_by;
	
	@Column(name = "consult_fee_updtd_dt")
	private Date consult_fee_updtd_dt;
	
	@Column(name = "consult_fee_status")
	private char consult_fee_status;
	
	@Column(name = "service_id")
	private long service_id;
	
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "consult_dtl_id", insertable = false, updatable = false)
	private ConsultantDetailMasterEntity consultantDetailMasterEntity;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "service_id", insertable = false, updatable = false)
	private ServiceMasterEntity serviceMasterEntity;

	public long getConsult_fee_mst_id() {
		return consult_fee_mst_id;
	}

	public void setConsult_fee_mst_id(long consult_fee_mst_id) {
		this.consult_fee_mst_id = consult_fee_mst_id;
	}

	public String getFees_amount() {
		return fees_amount;
	}

	public void setFees_amount(String fees_amount) {
		this.fees_amount = fees_amount;
	}

	public long getNo_dys_to_revisit() {
		return no_dys_to_revisit;
	}

	public void setNo_dys_to_revisit(long no_dys_to_revisit) {
		this.no_dys_to_revisit = no_dys_to_revisit;
	}

	public long getConsult_fee_crtd_by() {
		return consult_fee_crtd_by;
	}

	public void setConsult_fee_crtd_by(long consult_fee_crtd_by) {
		this.consult_fee_crtd_by = consult_fee_crtd_by;
	}

	public Date getConsult_fee_crtd_dt() {
		return consult_fee_crtd_dt;
	}

	public void setConsult_fee_crtd_dt(Date consult_fee_crtd_dt) {
		this.consult_fee_crtd_dt = consult_fee_crtd_dt;
	}

	public long getConsult_fee_updtd_by() {
		return consult_fee_updtd_by;
	}

	public void setConsult_fee_updtd_by(long consult_fee_updtd_by) {
		this.consult_fee_updtd_by = consult_fee_updtd_by;
	}

	public Date getConsult_fee_updtd_dt() {
		return consult_fee_updtd_dt;
	}

	public void setConsult_fee_updtd_dt(Date consult_fee_updtd_dt) {
		this.consult_fee_updtd_dt = consult_fee_updtd_dt;
	}

	public char getConsult_fee_status() {
		return consult_fee_status;
	}

	public void setConsult_fee_status(char consult_fee_status) {
		this.consult_fee_status = consult_fee_status;
	}

	public long getService_id() {
		return service_id;
	}

	public void setService_id(long service_id) {
		this.service_id = service_id;
	}

	public ConsultantDetailMasterEntity getConsultantDetailMasterEntity() {
		return consultantDetailMasterEntity;
	}

	public void setConsultantDetailMasterEntity(ConsultantDetailMasterEntity consultantDetailMasterEntity) {
		this.consultantDetailMasterEntity = consultantDetailMasterEntity;
	}

	public ServiceMasterEntity getServiceMasterEntity() {
		return serviceMasterEntity;
	}

	public void setServiceMasterEntity(ServiceMasterEntity serviceMasterEntity) {
		this.serviceMasterEntity = serviceMasterEntity;
	}
	
}
