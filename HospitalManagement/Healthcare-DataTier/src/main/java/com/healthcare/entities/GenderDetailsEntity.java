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
@Table(name = "gender_mst")
public class GenderDetailsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "gender_id")
	private long gender_id;

	@Column(name = "gender_type")
	private String gender_type;
	
	@Column(name = "gender_created_dt")
	private Date gender_created_dt;
	
	@Column(name = "gender_created_by")
	private long gender_created_by;
	
	@Column(name = "gender_updated_date")
	private Date gender_updated_date;
	
	@Column(name = "gender_updated_by")
	private long gender_updated_by;
	
	/*@Column(name = "title_id")
	private long title_id;*/
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "genderDetailsEntity")
	private Set<PatientMasterEntity> patientMasterEntities;
	
	
	/*@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "title_id", insertable = false, updatable = false)
	private TitleMasterEntity titleMasterEntity;*/
	
	 



	public long getGender_id() {
		return gender_id;
	}



	public void setGender_id(long gender_id) {
		this.gender_id = gender_id;
	}



	public String getGender_type() {
		return gender_type;
	}



	public void setGender_type(String gender_type) {
		this.gender_type = gender_type;
	}



	public Date getGender_created_dt() {
		return gender_created_dt;
	}



	public void setGender_created_dt(Date gender_created_dt) {
		this.gender_created_dt = gender_created_dt;
	}



	public long getGender_created_by() {
		return gender_created_by;
	}



	public void setGender_created_by(long gender_created_by) {
		this.gender_created_by = gender_created_by;
	}



	public Date getGender_updated_date() {
		return gender_updated_date;
	}



	public void setGender_updated_date(Date gender_updated_date) {
		this.gender_updated_date = gender_updated_date;
	}



	public long getGender_updated_by() {
		return gender_updated_by;
	}



	public void setGender_updated_by(long gender_updated_by) {
		this.gender_updated_by = gender_updated_by;
	}



	public Set<PatientMasterEntity> getPatientMasterEntities() {
		return patientMasterEntities;
	}



	public void setPatientMasterEntities(Set<PatientMasterEntity> patientMasterEntities) {
		this.patientMasterEntities = patientMasterEntities;
	}



	/*public long getTitle_id() {
		return title_id;
	}



	public void setTitle_id(long title_id) {
		this.title_id = title_id;
	}



	public TitleMasterEntity getTitleMasterEntity() {
		return titleMasterEntity;
	}



	public void setTitleMasterEntity(TitleMasterEntity titleMasterEntity) {
		this.titleMasterEntity = titleMasterEntity;
	}*/

	
	
	
	
}
