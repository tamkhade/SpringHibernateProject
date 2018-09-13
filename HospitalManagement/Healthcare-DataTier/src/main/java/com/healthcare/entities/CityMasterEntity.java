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
@Table(name = "city_mst")
public class CityMasterEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "city_id")
	private long city_id;

	@Column(name = "city_name")
	private String city_name;
	
	@Column(name = "city_created_by")
	private long city_created_by;
	
	@Column(name = "city_creatd_dt")
	private Date city_creatd_dt;
	
	@Column(name = "city_updated_by")
	private long city_updated_by;
	
	@Column(name = "city_updated_dt")
	private Date city_updated_dt;
	
	@Column(name = "state_id")
	private long state_id;	
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "state_id",insertable = false, updatable = false,nullable=false)
	private StateMasterEntity stateMasterEntity;
	
	

	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "cityMasterEntity")
	private Set<AreaMasterEntity> areaMasterEntities;	

	
	public Set<AreaMasterEntity> getAreaMasterEntities() {
		return areaMasterEntities;
	}

	public void setAreaMasterEntities(Set<AreaMasterEntity> areaMasterEntities) {
		this.areaMasterEntities = areaMasterEntities;
	}

	public long getCity_id() {
		return city_id;
	}

	public void setCity_id(long city_id) {
		this.city_id = city_id;
	}

	public String getCity_name() {
		return city_name;
	}

	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}

	public long getCity_created_by() {
		return city_created_by;
	}

	public void setCity_created_by(long city_created_by) {
		this.city_created_by = city_created_by;
	}

	public Date getCity_creatd_dt() {
		return city_creatd_dt;
	}

	public void setCity_creatd_dt(Date city_creatd_dt) {
		this.city_creatd_dt = city_creatd_dt;
	}

	public long getCity_updated_by() {
		return city_updated_by;
	}

	public void setCity_updated_by(long city_updated_by) {
		this.city_updated_by = city_updated_by;
	}

	public Date getCity_updated_dt() {
		return city_updated_dt;
	}

	public void setCity_updated_dt(Date city_updated_dt) {
		this.city_updated_dt = city_updated_dt;
	}

	
	public StateMasterEntity getStateMasterEntity() {
		return stateMasterEntity;
	}

	public void setStateMasterEntity(StateMasterEntity stateMasterEntity) {
		this.stateMasterEntity = stateMasterEntity;
	}

	public long getState_id() {
		return state_id;
	}

	public void setState_id(long state_id) {
		this.state_id = state_id;
	}
	
	
}
