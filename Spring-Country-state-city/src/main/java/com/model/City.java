package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="city")

public class City {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name="idcity")
		private int idcity;
		@Column(name="city")
		private String city;
		
		@Column(name = "stateid", insertable = false, updatable = false)
		private int stateid;
	 @ManyToOne
	 @JoinColumn(name = "stateid")
	 private State state;
	 
	 
	public int getIdcity() {
		return idcity;
	}
	public void setIdcity(int idcity) {
		this.idcity = idcity;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public int getStateid() {
		return stateid;
	}
	public void setStateid(int stateid) {
		this.stateid = stateid;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
}
