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
@Table(name = "state_mst")
public class StateMasterEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	

	@Column(name = "state_id")
	private long state_id;
	
	@Column(name = "state_name")
	private String state_name;
	
	@Column(name = "state_created_by")
	private long state_created_by;

	@Column(name = "state_created_dt")
	private Date state_created_dt;
	
	@Column(name = "state_updated_by")
	private long state_updated_by;

	@Column(name = "state_updated_dt")
	private Date state_updated_dt;
	
	@Column(name = "country_id")
	private long country_id;

	//one to many
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "country_id", insertable = false, updatable = false)
	private CountryMasterEntity countryMasterEntity;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "stateMasterEntity")
	private Set<CityMasterEntity> cityMasterEntities;



	public long getState_id() {
		return state_id;
	}



	public void setState_id(long state_id) {
		this.state_id = state_id;
	}



	public String getState_name() {
		return state_name;
	}



	public void setState_name(String state_name) {
		this.state_name = state_name;
	}



	public long getState_created_by() {
		return state_created_by;
	}



	public void setState_created_by(long state_created_by) {
		this.state_created_by = state_created_by;
	}



	public Date getState_created_dt() {
		return state_created_dt;
	}



	public void setState_created_dt(Date state_created_dt) {
		this.state_created_dt = state_created_dt;
	}



	public long getState_updated_by() {
		return state_updated_by;
	}



	public void setState_updated_by(long state_updated_by) {
		this.state_updated_by = state_updated_by;
	}



	public Date getState_updated_dt() {
		return state_updated_dt;
	}



	public void setState_updated_dt(Date state_updated_dt) {
		this.state_updated_dt = state_updated_dt;
	}



	public long getCountry_id() {
		return country_id;
	}



	public void setCountry_id(long country_id) {
		this.country_id = country_id;
	}



	public CountryMasterEntity getCountryMasterEntity() {
		return countryMasterEntity;
	}



	public void setCountryMasterEntity(CountryMasterEntity countryMasterEntity) {
		this.countryMasterEntity = countryMasterEntity;
	}



	public Set<CityMasterEntity> getCityMasterEntities() {
		return cityMasterEntities;
	}



	public void setCityMasterEntities(Set<CityMasterEntity> cityMasterEntities) {
		this.cityMasterEntities = cityMasterEntities;
	}






/*
	public Set<CityMasterEntity> getCityMasterEntities() {
		return cityMasterEntities;
	}



	public void setCityMasterEntities(Set<CityMasterEntity> cityMasterEntities) {
		this.cityMasterEntities = cityMasterEntities;
	}*/
	
	

	
	
	
	
}
