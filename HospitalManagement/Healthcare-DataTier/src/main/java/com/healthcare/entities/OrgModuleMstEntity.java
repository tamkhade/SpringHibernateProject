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
@Table(name="org_module_mst")
public class OrgModuleMstEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="mod_id")
	private long mod_id;
	
	@Column(name="mod_name")
	private String mod_name;
	
	@Column(name="mod_crtd_dt")
	private Date mod_crtd_dt;
	
	@Column(name="mod_updtd_dt")
	private Date mod_updtd_dt;
	
	@Column(name="mod_status")
	private char mod_status;
	
	@Column(name="mod_crtd_by")
	private long mod_crtd_by;
    

	@Column(name="mod_updtd_by")
	private long mod_updtd_by;
	
	@Column(name="org_mod_type")
	private char org_mod_type;
	
	
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY ,mappedBy="orgModuleMstEntity")
	private Set<OrgOwnMasterEntity> orgOwnMasterEntities;
	

	public long getMod_id() {
		return mod_id;
	}

	public void setMod_id(long mod_id) {
		this.mod_id = mod_id;
	}

	public String getMod_name() {
		return mod_name;
	}

	public void setMod_name(String mod_name) {
		this.mod_name = mod_name;
	}

	public Date getMod_crtd_dt() {
		return mod_crtd_dt;
	}

	public void setMod_crtd_dt(Date mod_crtd_dt) {
		this.mod_crtd_dt = mod_crtd_dt;
	}

	public Date getMod_updtd_dt() {
		return mod_updtd_dt;
	}

	public void setMod_updtd_dt(Date mod_updtd_dt) {
		this.mod_updtd_dt = mod_updtd_dt;
	}

	public char getMod_status() {
		return mod_status;
	}

	public void setMod_status(char mod_status) {
		this.mod_status = mod_status;
	}

	public long getMod_crtd_by() {
		return mod_crtd_by;
	}

	public void setMod_crtd_by(long mod_crtd_by) {
		this.mod_crtd_by = mod_crtd_by;
	}

	public long getMod_updtd_by() {
		return mod_updtd_by;
	}

	public void setMod_updtd_by(long mod_updtd_by) {
		this.mod_updtd_by = mod_updtd_by;
	}

	public char getOrg_mod_type() {
		return org_mod_type;
	}

	public void setOrg_mod_type(char org_mod_type) {
		this.org_mod_type = org_mod_type;
	}

	public Set<OrgOwnMasterEntity> getOrgOwnMasterEntities() {
		return orgOwnMasterEntities;
	}

	public void setOrgOwnMasterEntities(Set<OrgOwnMasterEntity> orgOwnMasterEntities) {
		this.orgOwnMasterEntities = orgOwnMasterEntities;
	}
	
	
}
