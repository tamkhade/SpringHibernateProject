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
@Table(name="org_mst")
public class OrgMasterEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name="org_id")
	private long org_id;
	
	@Column(name="org_name")
	private String org_name;
	
	@Column(name="org_reg_no")
	private String org_reg_no;
	
	@Column(name="org_bed_nos")
	private long org_bed_nos;
	
	@Column(name="org_landline_no")
	private String org_landline_no;
	
	@Column(name="org_mob_no")
	private String org_mob_no;
	
	@Column(name="org_email")
	private String org_email;
	
	@Column(name="org_logo")
	private byte org_logo;
	
	/*@Column(name="org_created_by")
	private long org_created_by;*/
	
	@Column(name="org_crtd_dt")
	private Date org_crtd_dt;
	
	/*@Column(name="org_updated_by")
	private long org_updated_by;*/
	
	@Column(name="org_updtd_dt")
	private Date org_updtd_dt;
	
	@Column(name="org_status")
	private char org_status;
	
/*	@Column(name="org_parnt_id")
	private long org_parnt_id;*/
	
	@Column(name="org_type_id")
	private long org_type_id;
	
	@Column(name="org_active_from")
	private String org_active_from;
	
	@Column(name="org_active_to")
	private String org_active_to;
	
	@Column(name="org_brnch_status")
	private char org_brnch_status;
	
	@Column(name="org_brnch_count")
	private long org_brnch_count;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY ,mappedBy="orgMasterEntity")
	private Set<OrgOwnMasterEntity> orgOwnMasterEntities;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY ,mappedBy="orgMasterEntity")
	private Set<OrgAddressDtlEntity> orgAddressDtlEntities;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY ,mappedBy="orgMasterEntity")
	private Set<OrgBankDtlMaster> orgBankDtlMasters;
	
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "org_type_id", insertable = false, updatable = false)
	private OrgTypeMasterEntity orgTypeMasterEntity;


	public long getOrg_id() {
		return org_id;
	}


	public void setOrg_id(long org_id) {
		this.org_id = org_id;
	}


	public String getOrg_name() {
		return org_name;
	}


	public void setOrg_name(String org_name) {
		this.org_name = org_name;
	}


	public String getOrg_reg_no() {
		return org_reg_no;
	}


	public void setOrg_reg_no(String org_reg_no) {
		this.org_reg_no = org_reg_no;
	}


	public long getOrg_bed_nos() {
		return org_bed_nos;
	}


	public void setOrg_bed_nos(long org_bed_nos) {
		this.org_bed_nos = org_bed_nos;
	}


	public String getOrg_landline_no() {
		return org_landline_no;
	}


	public void setOrg_landline_no(String org_landline_no) {
		this.org_landline_no = org_landline_no;
	}


	public String getOrg_mob_no() {
		return org_mob_no;
	}


	public void setOrg_mob_no(String org_mob_no) {
		this.org_mob_no = org_mob_no;
	}


	public String getOrg_email() {
		return org_email;
	}


	public void setOrg_email(String org_email) {
		this.org_email = org_email;
	}


	public byte getOrg_logo() {
		return org_logo;
	}


	public void setOrg_logo(byte org_logo) {
		this.org_logo = org_logo;
	}


	/*public long getOrg_created_by() {
		return org_created_by;
	}


	public void setOrg_created_by(long org_created_by) {
		this.org_created_by = org_created_by;
	}
*/

	public Date getOrg_crtd_dt() {
		return org_crtd_dt;
	}


	public void setOrg_crtd_dt(Date org_crtd_dt) {
		this.org_crtd_dt = org_crtd_dt;
	}

/*
	public long getOrg_updated_by() {
		return org_updated_by;
	}


	public void setOrg_updated_by(long org_updated_by) {
		this.org_updated_by = org_updated_by;
	}*/


	public Date getOrg_updtd_dt() {
		return org_updtd_dt;
	}


	public void setOrg_updtd_dt(Date org_updtd_dt) {
		this.org_updtd_dt = org_updtd_dt;
	}


	public char getOrg_status() {
		return org_status;
	}


	public void setOrg_status(char org_status) {
		this.org_status = org_status;
	}


/*	public long getOrg_parnt_id() {
		return org_parnt_id;
	}


	public void setOrg_parnt_id(long org_parnt_id) {
		this.org_parnt_id = org_parnt_id;
	}*/


	public long getOrg_type_id() {
		return org_type_id;
	}


	public void setOrg_type_id(long org_type_id) {
		this.org_type_id = org_type_id;
	}


	public String getOrg_active_from() {
		return org_active_from;
	}


	public void setOrg_active_from(String org_active_from) {
		this.org_active_from = org_active_from;
	}


	public String getOrg_active_to() {
		return org_active_to;
	}


	public void setOrg_active_to(String org_active_to) {
		this.org_active_to = org_active_to;
	}


	public char getOrg_brnch_status() {
		return org_brnch_status;
	}


	public void setOrg_brnch_status(char org_brnch_status) {
		this.org_brnch_status = org_brnch_status;
	}


	public long getOrg_brnch_count() {
		return org_brnch_count;
	}


	public void setOrg_brnch_count(long org_brnch_count) {
		this.org_brnch_count = org_brnch_count;
	}


	public Set<OrgOwnMasterEntity> getOrgOwnMasterEntities() {
		return orgOwnMasterEntities;
	}


	public void setOrgOwnMasterEntities(Set<OrgOwnMasterEntity> orgOwnMasterEntities) {
		this.orgOwnMasterEntities = orgOwnMasterEntities;
	}


	public Set<OrgAddressDtlEntity> getOrgAddressDtlEntities() {
		return orgAddressDtlEntities;
	}


	public void setOrgAddressDtlEntities(Set<OrgAddressDtlEntity> orgAddressDtlEntities) {
		this.orgAddressDtlEntities = orgAddressDtlEntities;
	}


	public Set<OrgBankDtlMaster> getOrgBankDtlMasters() {
		return orgBankDtlMasters;
	}


	public void setOrgBankDtlMasters(Set<OrgBankDtlMaster> orgBankDtlMasters) {
		this.orgBankDtlMasters = orgBankDtlMasters;
	}


	public OrgTypeMasterEntity getOrgTypeMasterEntity() {
		return orgTypeMasterEntity;
	}


	public void setOrgTypeMasterEntity(OrgTypeMasterEntity orgTypeMasterEntity) {
		this.orgTypeMasterEntity = orgTypeMasterEntity;
	}
	
	

	
}
