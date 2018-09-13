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

@Entity
@Table(name="mrkt_prsn_mst")
public class MarketPersonMaster {
	
public MarketPersonMaster(){
		
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="mrkt_prsn_id")
	private long mrkt_prsn_id;
	
	@Column(name="mrkt_prsn_nm")
	private String mrkt_prsn_nm;
	
	@Column(name="mrkt_crtd_dt")
	private Date mrkt_crtd_dt;
	
	
	@Column(name="mrkt_crtd_by")
	private long mrkt_crtd_by;
	
	
	
	@Column(name="mrkt_updtd_dt")
	private Date mrkt_updtd_dt;
	
	@Column(name="mrkt_updtd_by")
	private long mrkt_updtd_by;
	
	@Column(name="mrkt_prsn_status")
	private char mrkt_prsn_status;
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY ,mappedBy="marketPersonMaster")
	private Set<ReferralMaster> referralMasters;

	public long getMrkt_prsn_id() {
		return mrkt_prsn_id;
	}

	public void setMrkt_prsn_id(long mrkt_prsn_id) {
		this.mrkt_prsn_id = mrkt_prsn_id;
	}

	public String getMrkt_prsn_nm() {
		return mrkt_prsn_nm;
	}

	public void setMrkt_prsn_nm(String mrkt_prsn_nm) {
		this.mrkt_prsn_nm = mrkt_prsn_nm;
	}

	public Date getMrkt_crtd_dt() {
		return mrkt_crtd_dt;
	}

	public void setMrkt_crtd_dt(Date mrkt_crtd_dt) {
		this.mrkt_crtd_dt = mrkt_crtd_dt;
	}

	public long getMrkt_crtd_by() {
		return mrkt_crtd_by;
	}

	public void setMrkt_crtd_by(long mrkt_crtd_by) {
		this.mrkt_crtd_by = mrkt_crtd_by;
	}

	public Date getMrkt_updtd_dt() {
		return mrkt_updtd_dt;
	}

	public void setMrkt_updtd_dt(Date mrkt_updtd_dt) {
		this.mrkt_updtd_dt = mrkt_updtd_dt;
	}

	public long getMrkt_updtd_by() {
		return mrkt_updtd_by;
	}

	public void setMrkt_updtd_by(long mrkt_updtd_by) {
		this.mrkt_updtd_by = mrkt_updtd_by;
	}

	public char getMrkt_prsn_status() {
		return mrkt_prsn_status;
	}

	public void setMrkt_prsn_status(char mrkt_prsn_status) {
		this.mrkt_prsn_status = mrkt_prsn_status;
	}

	public Set<ReferralMaster> getReferralMasters() {
		return referralMasters;
	}

	public void setReferralMasters(Set<ReferralMaster> referralMasters) {
		this.referralMasters = referralMasters;
	}
	
	
		
	
	
	
	
	

}
