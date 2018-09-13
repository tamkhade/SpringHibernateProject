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

@Entity
@Table(name = "title_mst")
public class TitleMasterEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "title_id")
	private long title_id;
	
	@Column(name = "title_type")
	private String title_type;
	
	@Column(name = "title_created_by")
	private long title_created_by;
	
	@Column(name = "title_created_dt")
	private Date title_created_dt;
	
	@Column(name = "title_updated_by")
	private long title_updated_by;
	
	@Column(name = "title_updated_dt")
	private Date title_updated_dt;
	
	@Column(name = "title_status")
	private char title_status;
	
	

	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "titleMasterEntity")
	private Set<OrgnizationUserMasterEntity> orgnizationUserMasterEntities;
	
	/*@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "titleMasterEntity")
	private Set<GenderDetailsEntity> genderDetailsEntity; */
	
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "titleMasterEntity")
	private Set<PatientMasterEntity> patientMasterEntities;

	public long getTitle_id() {
		return title_id;
	}

	public void setTitle_id(long title_id) {
		this.title_id = title_id;
	}

	public String getTitle_type() {
		return title_type;
	}

	public void setTitle_type(String title_type) {
		this.title_type = title_type;
	}

	public long getTitle_created_by() {
		return title_created_by;
	}

	public void setTitle_created_by(long title_created_by) {
		this.title_created_by = title_created_by;
	}

	public Date getTitle_created_dt() {
		return title_created_dt;
	}

	public void setTitle_created_dt(Date title_created_dt) {
		this.title_created_dt = title_created_dt;
	}

	public long getTitle_updated_by() {
		return title_updated_by;
	}

	public void setTitle_updated_by(long title_updated_by) {
		this.title_updated_by = title_updated_by;
	}

	public Date getTitle_updated_dt() {
		return title_updated_dt;
	}

	public void setTitle_updated_dt(Date title_updated_dt) {
		this.title_updated_dt = title_updated_dt;
	}

	public char getTitle_status() {
		return title_status;
	}

	public void setTitle_status(char title_status) {
		this.title_status = title_status;
	}

	public Set<OrgnizationUserMasterEntity> getOrgnizationUserMasterEntities() {
		return orgnizationUserMasterEntities;
	}

	public void setOrgnizationUserMasterEntities(Set<OrgnizationUserMasterEntity> orgnizationUserMasterEntities) {
		this.orgnizationUserMasterEntities = orgnizationUserMasterEntities;
	}

	public Set<PatientMasterEntity> getPatientMasterEntities() {
		return patientMasterEntities;
	}

	public void setPatientMasterEntities(Set<PatientMasterEntity> patientMasterEntities) {
		this.patientMasterEntities = patientMasterEntities;
	}

	/*public Set<GenderDetailsEntity> getGenderDetailsEntity() {
		return genderDetailsEntity;
	}

	public void setGenderDetailsEntity(Set<GenderDetailsEntity> genderDetailsEntity) {
		this.genderDetailsEntity = genderDetailsEntity;
	}	
	*/
	
	
}
