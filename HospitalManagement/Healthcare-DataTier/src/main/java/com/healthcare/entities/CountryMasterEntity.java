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
@Table(name = "country_mst")
public class CountryMasterEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "country_id")
	private long country_id;

	@Column(name = "country_name")
	private String country_name;
	
	@Column(name = "country_created_by")
	private long country_created_by;

	@Column(name = "country_created_dt")
	private Date country_created_dt;
	
	@Column(name = "country_updated_by")
	private long country_updated_by;

	@Column(name = "country_updated_dt")
	private Date country_updated_dt;

	@JsonIgnore
	@OneToMany(cascade = CascadeType.DETACH, fetch = FetchType.LAZY, mappedBy = "countryMasterEntity",orphanRemoval=true)
	private Set<StateMasterEntity> stateMasterEntities;

	public long getCountry_id() {
		return country_id;
	}

	public void setCountry_id(long country_id) {
		this.country_id = country_id;
	}

	public String getCountry_name() {
		return country_name;
	}

	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}

	public long getCountry_created_by() {
		return country_created_by;
	}

	public void setCountry_created_by(long country_created_by) {
		this.country_created_by = country_created_by;
	}

	public Date getCountry_created_dt() {
		return country_created_dt;
	}

	public void setCountry_created_dt(Date country_created_dt) {
		this.country_created_dt = country_created_dt;
	}

	public long getCountry_updated_by() {
		return country_updated_by;
	}

	public void setCountry_updated_by(long country_updated_by) {
		this.country_updated_by = country_updated_by;
	}

	public Date getCountry_updated_dt() {
		return country_updated_dt;
	}

	public void setCountry_updated_dt(Date country_updated_dt) {
		this.country_updated_dt = country_updated_dt;
	}

	public Set<StateMasterEntity> getStateMasterEntities() {
		return stateMasterEntities;
	}

	public void setStateMasterEntities(Set<StateMasterEntity> stateMasterEntities) {
		this.stateMasterEntities = stateMasterEntities;
	}
	

	
}
