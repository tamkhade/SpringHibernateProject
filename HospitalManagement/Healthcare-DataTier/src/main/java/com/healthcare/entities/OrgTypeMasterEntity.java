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
@Table(name="org_type_master")
public class OrgTypeMasterEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long org_type_id;
	
	@Column(name="org_type")
	private String org_type;
	
	@Column(name="org_type_created_by")
	private long org_type_created_by;
	
	@Column(name="org_type_created_date")
	private Date org_type_created_date;
	
	@Column(name="org_type_updated_by")
	private long org_type_updated_by;
	
	@Column(name="org_type_updated_date")
	private Date org_type_updated_date;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY ,mappedBy="orgTypeMasterEntity")
	private Set<OrgMasterEntity> orgMasterEntities;

	public long getOrg_type_id() {
		return org_type_id;
	}

	public void setOrg_type_id(long org_type_id) {
		this.org_type_id = org_type_id;
	}

	public String getOrg_type() {
		return org_type;
	}

	public void setOrg_type(String org_type) {
		this.org_type = org_type;
	}

	public long getOrg_type_created_by() {
		return org_type_created_by;
	}

	public void setOrg_type_created_by(long org_type_created_by) {
		this.org_type_created_by = org_type_created_by;
	}

	public Date getOrg_type_created_date() {
		return org_type_created_date;
	}

	public void setOrg_type_created_date(Date org_type_created_date) {
		this.org_type_created_date = org_type_created_date;
	}

	public long getOrg_type_updated_by() {
		return org_type_updated_by;
	}

	public void setOrg_type_updated_by(long org_type_updated_by) {
		this.org_type_updated_by = org_type_updated_by;
	}

	public Date getOrg_type_updated_date() {
		return org_type_updated_date;
	}

	public void setOrg_type_updated_date(Date org_type_updated_date) {
		this.org_type_updated_date = org_type_updated_date;
	}

	public Set<OrgMasterEntity> getOrgMasterEntities() {
		return orgMasterEntities;
	}

	public void setOrgMasterEntities(Set<OrgMasterEntity> orgMasterEntities) {
		this.orgMasterEntities = orgMasterEntities;
	}
	
	


}
