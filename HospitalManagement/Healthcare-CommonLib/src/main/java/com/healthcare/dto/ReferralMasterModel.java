package com.healthcare.dto;

import java.util.Date;

public class ReferralMasterModel {
	
	private String ref_name;
	private String ref_code;
	private String contct_persn_nm;
	private String ref_ph_no;
	private String ref_mob_no;
	private String ref_alt_mob_no;
	private String ref_email;
	private Date ref_actv_frm;
	private Date ref_actv_to;
	private long area_id;
	private String ref_address;
	
	private String ref_pincode;
	private Date ref_dob;
	private Date ref_anniversary;
	private Date ref_crtd_dt;
	private long ref_crtd_by;
	private Date ref_updtd_dt;
	private long ref_updtd_by;
	private char ref_status;
	
	//List
	private long org_id;
	
	private long ref_typ_id;
	private long mrkt_prsn_id;
	
	
	
	
	
	
	
	public String getRef_address() {
		return ref_address;
	}
	public void setRef_address(String ref_address) {
		this.ref_address = ref_address;
	}
	public String getRef_pincode() {
		return ref_pincode;
	}
	public void setRef_pincode(String ref_pincode) {
		this.ref_pincode = ref_pincode;
	}
	public String getRef_mob_no() {
		return ref_mob_no;
	}
	public void setRef_mob_no(String ref_mob_no) {
		this.ref_mob_no = ref_mob_no;
	}
	public String getRef_alt_mob_no() {
		return ref_alt_mob_no;
	}
	public void setRef_alt_mob_no(String ref_alt_mob_no) {
		this.ref_alt_mob_no = ref_alt_mob_no;
	}
	public String getRef_name() {
		return ref_name;
	}
	public void setRef_name(String ref_name) {
		this.ref_name = ref_name;
	}
	public String getRef_code() {
		return ref_code;
	}
	public void setRef_code(String ref_code) {
		this.ref_code = ref_code;
	}
	public String getContct_persn_nm() {
		return contct_persn_nm;
	}
	public void setContct_persn_nm(String contct_persn_nm) {
		this.contct_persn_nm = contct_persn_nm;
	}
	public String getRef_ph_no() {
		return ref_ph_no;
	}
	public void setRef_ph_no(String ref_ph_no) {
		this.ref_ph_no = ref_ph_no;
	}
	public String getRef_email() {
		return ref_email;
	}
	public void setRef_email(String ref_email) {
		this.ref_email = ref_email;
	}
	public Date getRef_actv_frm() {
		return ref_actv_frm;
	}
	public void setRef_actv_frm(Date ref_actv_frm) {
		this.ref_actv_frm = ref_actv_frm;
	}
	public Date getRef_actv_to() {
		return ref_actv_to;
	}
	public void setRef_actv_to(Date ref_actv_to) {
		this.ref_actv_to = ref_actv_to;
	}
	public long getArea_id() {
		return area_id;
	}
	public void setArea_id(long area_id) {
		this.area_id = area_id;
	}
	
	public Date getRef_dob() {
		return ref_dob;
	}
	public void setRef_dob(Date ref_dob) {
		this.ref_dob = ref_dob;
	}
	public Date getRef_anniversary() {
		return ref_anniversary;
	}
	public void setRef_anniversary(Date ref_anniversary) {
		this.ref_anniversary = ref_anniversary;
	}
	public Date getRef_crtd_dt() {
		return ref_crtd_dt;
	}
	public void setRef_crtd_dt(Date ref_crtd_dt) {
		this.ref_crtd_dt = ref_crtd_dt;
	}
	public long getRef_crtd_by() {
		return ref_crtd_by;
	}
	public void setRef_crtd_by(long ref_crtd_by) {
		this.ref_crtd_by = ref_crtd_by;
	}
	public Date getRef_updtd_dt() {
		return ref_updtd_dt;
	}
	public void setRef_updtd_dt(Date ref_updtd_dt) {
		this.ref_updtd_dt = ref_updtd_dt;
	}
	public long getRef_updtd_by() {
		return ref_updtd_by;
	}
	public void setRef_updtd_by(long ref_updtd_by) {
		this.ref_updtd_by = ref_updtd_by;
	}
	public char getRef_status() {
		return ref_status;
	}
	public void setRef_status(char ref_status) {
		this.ref_status = ref_status;
	}
	public long getOrg_id() {
		return org_id;
	}
	public void setOrg_id(long org_id) {
		this.org_id = org_id;
	}
	public long getRef_typ_id() {
		return ref_typ_id;
	}
	public void setRef_typ_id(long ref_typ_id) {
		this.ref_typ_id = ref_typ_id;
	}
	public long getMrkt_prsn_id() {
		return mrkt_prsn_id;
	}
	public void setMrkt_prsn_id(long mrkt_prsn_id) {
		this.mrkt_prsn_id = mrkt_prsn_id;
	}
	
	
	
	

}
