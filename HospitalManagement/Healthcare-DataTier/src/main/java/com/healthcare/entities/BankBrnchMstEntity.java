/**
 * 
 */
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

/**
 * @author ADMIN
 *
 */
@Entity
@Table(name="bnk_brnch_mst")
public class BankBrnchMstEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long bnk_brnch_id;
	
	@Column(name="area_id")
	private long area_id;
	
	@Column(name="ifsc_cd")
	private String ifsc_cd;
	
	@Column(name="micr_cd")
	private String micr_cd;
	
	@Column(name="bnk_brnch_add")
	private String bnk_brnch_add;
	

	@Column(name="created_by")
    private long created_by;
	
	@Column(name="creatd_dt")
	private Date creatd_dt;
	
	@Column(name="updated_by")
	private long updated_by;
	
	@Column(name="updated_dt")
	private Date updated_dt;
	
	@Column(name="bnk_brnch_status")
	private String bnk_brnch_status;
	
	@Column(name="bnk_id")
	private long bnk_id;
	

	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY ,mappedBy="bankBrnchMstEntity")
	private Set<OrgBankDtlMaster> orgBankDtlMasters;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "bnk_id", insertable = false, updatable = false)
	private BankMasterEntity bankMasterEntity;

	public long getBnk_brnch_id() {
		return bnk_brnch_id;
	}

	public void setBnk_brnch_id(long bnk_brnch_id) {
		this.bnk_brnch_id = bnk_brnch_id;
	}

	public long getArea_id() {
		return area_id;
	}

	public void setArea_id(long area_id) {
		this.area_id = area_id;
	}

	public String getIfsc_cd() {
		return ifsc_cd;
	}

	public void setIfsc_cd(String ifsc_cd) {
		this.ifsc_cd = ifsc_cd;
	}

	public String getMicr_cd() {
		return micr_cd;
	}

	public void setMicr_cd(String micr_cd) {
		this.micr_cd = micr_cd;
	}

	public String getBnk_brnch_add() {
		return bnk_brnch_add;
	}

	public void setBnk_brnch_add(String bnk_brnch_add) {
		this.bnk_brnch_add = bnk_brnch_add;
	}

	public long getCreated_by() {
		return created_by;
	}

	public void setCreated_by(long created_by) {
		this.created_by = created_by;
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

	public String getBnk_brnch_status() {
		return bnk_brnch_status;
	}

	public void setBnk_brnch_status(String bnk_brnch_status) {
		this.bnk_brnch_status = bnk_brnch_status;
	}

	public long getBnk_id() {
		return bnk_id;
	}

	public void setBnk_id(long bnk_id) {
		this.bnk_id = bnk_id;
	}

	public Set<OrgBankDtlMaster> getOrgBankDtlMasters() {
		return orgBankDtlMasters;
	}

	public void setOrgBankDtlMasters(Set<OrgBankDtlMaster> orgBankDtlMasters) {
		this.orgBankDtlMasters = orgBankDtlMasters;
	}

	public BankMasterEntity getBankMasterEntity() {
		return bankMasterEntity;
	}

	public void setBankMasterEntity(BankMasterEntity bankMasterEntity) {
		this.bankMasterEntity = bankMasterEntity;
	}
	
	

}
