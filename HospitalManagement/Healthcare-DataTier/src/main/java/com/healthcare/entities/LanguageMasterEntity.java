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
 * @author PC 2
 *
 */

@Entity
@Table(name = "pref_lang_master")
public class LanguageMasterEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "pref_lang_id")
	private long pref_lang_id;
	
	@Column(name ="pref_lang_name")
	private String pref_lang_name;
	
	@Column(name = "creatd_by")
	private long created_by;
	
	@Column(name = "creatd_date")
	private Date creatd_dt;
	
	@Column(name = "updated_by")
	private long updated_by;
	
	@Column(name = "updated_date")
	private Date updated_dt;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "languageMasterEntity")
	private Set<PatientMasterEntity> patientMasterEntities;

	

	public long getPref_lang_id() {
		return pref_lang_id;
	}

	public void setPref_lang_id(long pref_lang_id) {
		this.pref_lang_id = pref_lang_id;
	}

	public String getPref_lang_name() {
		return pref_lang_name;
	}

	public void setPref_lang_name(String pref_lang_name) {
		this.pref_lang_name = pref_lang_name;
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

	public Set<PatientMasterEntity> getPatientMasterEntities() {
		return patientMasterEntities;
	}

	public void setPatientMasterEntities(Set<PatientMasterEntity> patientMasterEntities) {
		this.patientMasterEntities = patientMasterEntities;
	}
	
	
}
