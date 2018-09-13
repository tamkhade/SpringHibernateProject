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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author ADMIN
 *
 */
@Entity
@Table(name="bnk_ac_typ_mst")
public class BankAccTypeMstEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long bnk_acct_type_id;
	
	@Column(name="bnk_acct_type")
	private String bnk_acct_type;
	
	@Column(name="creatd_by")
	private long creatd_by;
	
	@Column(name="creatd_date")
	private Date creatd_date;
	
	@Column(name="updated_by")
	private long updated_by;
	
	@Column(name="updated_date")
	private Date updated_date;
	
	@Column(name="bnk_acct_type_staus")
	private char bnk_acct_type_staus;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY ,mappedBy="bankAccTypeMstEntity")
	private Set<OrgBankDtlMaster> orgBankDtlMasters;

	public long getBnk_acct_type_id() {
		return bnk_acct_type_id;
	}

	public void setBnk_acct_type_id(long bnk_acct_type_id) {
		this.bnk_acct_type_id = bnk_acct_type_id;
	}

	public String getBnk_acct_type() {
		return bnk_acct_type;
	}

	public void setBnk_acct_type(String bnk_acct_type) {
		this.bnk_acct_type = bnk_acct_type;
	}

	public long getCreatd_by() {
		return creatd_by;
	}

	public void setCreatd_by(long creatd_by) {
		this.creatd_by = creatd_by;
	}

	public Date getCreatd_date() {
		return creatd_date;
	}

	public void setCreatd_date(Date creatd_date) {
		this.creatd_date = creatd_date;
	}

	public long getUpdated_by() {
		return updated_by;
	}

	public void setUpdated_by(long updated_by) {
		this.updated_by = updated_by;
	}

	public Date getUpdated_date() {
		return updated_date;
	}

	public void setUpdated_date(Date updated_date) {
		this.updated_date = updated_date;
	}

	public char getBnk_acct_type_staus() {
		return bnk_acct_type_staus;
	}

	public void setBnk_acct_type_staus(char bnk_acct_type_staus) {
		this.bnk_acct_type_staus = bnk_acct_type_staus;
	}

	public Set<OrgBankDtlMaster> getOrgBankDtlMasters() {
		return orgBankDtlMasters;
	}

	public void setOrgBankDtlMasters(Set<OrgBankDtlMaster> orgBankDtlMasters) {
		this.orgBankDtlMasters = orgBankDtlMasters;
	}
	
	


}
