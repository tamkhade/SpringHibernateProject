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
@Table(name="ref_typ_mst")
public class ReferenceTypeMaster {
	
public ReferenceTypeMaster(){
		
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ref_typ_id")
	private long ref_typ_id;
	
	@Column(name="ref_type")
	private String ref_type;
	
	@Column(name="ref_crtd_dt")
	private Date ref_crtd_dt;
	
	
	@Column(name="ref_typ_crtd_by")
	private long ref_typ_crtd_by;
	
	@Column(name="ref_typ_updtd_dt")
	private Date ref_typ_updtd_dt;
	

	@Column(name="ref_typ_updtd_by")
	private long ref_typ_updtd_by;
	
	@Column(name="ref_typ_crtd_dt")
	private Date ref_typ_crtd_dt;
	
	
	@Column(name="ref_typ_status")
	private char ref_typ_status;
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY ,mappedBy="referenceTypeMaster")
	private Set<ReferralMaster> referralMasters;



	public long getRef_typ_id() {
		return ref_typ_id;
	}

	public void setRef_typ_id(long ref_typ_id) {
		this.ref_typ_id = ref_typ_id;
	}

	public String getRef_type() {
		return ref_type;
	}

	public void setRef_type(String ref_type) {
		this.ref_type = ref_type;
	}

	public Date getRef_crtd_dt() {
		return ref_crtd_dt;
	}

	public void setRef_crtd_dt(Date ref_crtd_dt) {
		this.ref_crtd_dt = ref_crtd_dt;
	}

	public long getRef_typ_crtd_by() {
		return ref_typ_crtd_by;
	}

	public void setRef_typ_crtd_by(long ref_typ_crtd_by) {
		this.ref_typ_crtd_by = ref_typ_crtd_by;
	}

	public Date getRef_typ_updtd_dt() {
		return ref_typ_updtd_dt;
	}

	public void setRef_typ_updtd_dt(Date ref_typ_updtd_dt) {
		this.ref_typ_updtd_dt = ref_typ_updtd_dt;
	}

	public long getRef_typ_updtd_by() {
		return ref_typ_updtd_by;
	}

	public void setRef_typ_updtd_by(long ref_typ_updtd_by) {
		this.ref_typ_updtd_by = ref_typ_updtd_by;
	}

	public Date getRef_typ_crtd_dt() {
		return ref_typ_crtd_dt;
	}

	public void setRef_typ_crtd_dt(Date ref_typ_crtd_dt) {
		this.ref_typ_crtd_dt = ref_typ_crtd_dt;
	}

	public char getRef_typ_status() {
		return ref_typ_status;
	}

	public void setRef_typ_status(char ref_typ_status) {
		this.ref_typ_status = ref_typ_status;
	}

	public Set<ReferralMaster> getReferralMasters() {
		return referralMasters;
	}

	public void setReferralMasters(Set<ReferralMaster> referralMasters) {
		this.referralMasters = referralMasters;
	}
	
	
	

}
