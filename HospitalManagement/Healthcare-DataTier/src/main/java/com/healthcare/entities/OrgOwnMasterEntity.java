/**
 * 
 */
package com.healthcare.entities;

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
@Table(name="org_mod_own_mst")
public class OrgOwnMasterEntity {
	@Id
	@Column(name="org_id")
	private long org_id;
	
	@Column(name="mod_id")
	private long mod_id;
	
	@Column(name="user_max_cnt")
	private long user_max_cnt;
	
	@Column(name="remn_user_cnt")
	private long remn_user_cnt;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "org_id", insertable = false, updatable = false)
	private OrgMasterEntity orgMasterEntity;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "mod_id", insertable = false, updatable = false)
	private OrgModuleMstEntity orgModuleMstEntity;
	
	
	
	public long getOrg_id() {
		return org_id;
	}

	public void setOrg_id(long org_id) {
		this.org_id = org_id;
	}

	public long getMod_id() {
		return mod_id;
	}

	public void setMod_id(long mod_id) {
		this.mod_id = mod_id;
	}

	public long getUser_max_cnt() {
		return user_max_cnt;
	}

	public void setUser_max_cnt(long user_max_cnt) {
		this.user_max_cnt = user_max_cnt;
	}

	public long getRemn_user_cnt() {
		return remn_user_cnt;
	}

	public void setRemn_user_cnt(long remn_user_cnt) {
		this.remn_user_cnt = remn_user_cnt;
	}

	public OrgMasterEntity getOrgMasterEntity() {
		return orgMasterEntity;
	}

	public void setOrgMasterEntity(OrgMasterEntity orgMasterEntity) {
		this.orgMasterEntity = orgMasterEntity;
	}

	public OrgModuleMstEntity getOrgModuleMstEntity() {
		return orgModuleMstEntity;
	}

	public void setOrgModuleMstEntity(OrgModuleMstEntity orgModuleMstEntity) {
		this.orgModuleMstEntity = orgModuleMstEntity;
	}
	
	

}
