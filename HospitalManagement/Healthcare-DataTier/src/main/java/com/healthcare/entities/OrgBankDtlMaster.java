/**
 * 
 */
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

/**
 * @author ADMIN
 *
 */
@Entity
@Table(name="org_bnk_dtl_mst")
public class OrgBankDtlMaster {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long org_bnk_dtl_id;
	@Column(name="bnk_acct_no")
	private String bnk_acct_no;
	
	@Column(name="creatd_by")
	private long creatd_by;
	
	@Column(name="creatd_dt")
	private Date creatd_dt;
	
	@Column(name="updated_by")
	private long updated_by;
	
	@Column(name="updated_dt")
	private Date updated_dt;
	
	@Column(name="org_bnk_status")
	private char org_bnk_status;
	
	@Column(name="bnk_brnch_id")
	private long bnk_brnch_id;
	
	@Column(name="bnk_acct_type_id")
	private long bnk_acct_type_id;
	
	@Column(name="org_id")
	private long org_id;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "org_id", insertable = false, updatable = false)
	private OrgMasterEntity orgMasterEntity;

	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "bnk_acct_type_id", insertable = false, updatable = false)
	private BankAccTypeMstEntity bankAccTypeMstEntity;
	
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "bnk_brnch_id", insertable = false, updatable = false)
	private BankBrnchMstEntity bankBrnchMstEntity;


	public long getOrg_bnk_dtl_id() {
		return org_bnk_dtl_id;
	}


	public void setOrg_bnk_dtl_id(long org_bnk_dtl_id) {
		this.org_bnk_dtl_id = org_bnk_dtl_id;
	}


	public String getBnk_acct_no() {
		return bnk_acct_no;
	}


	public void setBnk_acct_no(String bnk_acct_no) {
		this.bnk_acct_no = bnk_acct_no;
	}


	public long getCreatd_by() {
		return creatd_by;
	}


	public void setCreatd_by(long creatd_by) {
		this.creatd_by = creatd_by;
	}


	public Date getCreatd_dt() {
		return creatd_dt;
	}


	public void setCreatd_dt(Date creatd_dt) {
		this.creatd_dt = creatd_dt;
	}


	public long getUpdated_by() {
		return updated_by;
	}


	public void setUpdated_by(long updated_by) {
		this.updated_by = updated_by;
	}


	public Date getUpdated_dt() {
		return updated_dt;
	}


	public void setUpdated_dt(Date updated_dt) {
		this.updated_dt = updated_dt;
	}


	public char getOrg_bnk_status() {
		return org_bnk_status;
	}


	public void setOrg_bnk_status(char org_bnk_status) {
		this.org_bnk_status = org_bnk_status;
	}


	public long getBnk_brnch_id() {
		return bnk_brnch_id;
	}


	public void setBnk_brnch_id(long bnk_brnch_id) {
		this.bnk_brnch_id = bnk_brnch_id;
	}


	public long getBnk_acct_type_id() {
		return bnk_acct_type_id;
	}


	public void setBnk_acct_type_id(long bnk_acct_type_id) {
		this.bnk_acct_type_id = bnk_acct_type_id;
	}


	public long getOrg_id() {
		return org_id;
	}


	public void setOrg_id(long org_id) {
		this.org_id = org_id;
	}


	public OrgMasterEntity getOrgMasterEntity() {
		return orgMasterEntity;
	}


	public void setOrgMasterEntity(OrgMasterEntity orgMasterEntity) {
		this.orgMasterEntity = orgMasterEntity;
	}


	public BankAccTypeMstEntity getBankAccTypeMstEntity() {
		return bankAccTypeMstEntity;
	}


	public void setBankAccTypeMstEntity(BankAccTypeMstEntity bankAccTypeMstEntity) {
		this.bankAccTypeMstEntity = bankAccTypeMstEntity;
	}


	public BankBrnchMstEntity getBankBrnchMstEntity() {
		return bankBrnchMstEntity;
	}


	public void setBankBrnchMstEntity(BankBrnchMstEntity bankBrnchMstEntity) {
		this.bankBrnchMstEntity = bankBrnchMstEntity;
	}
	
	
	
	

}
