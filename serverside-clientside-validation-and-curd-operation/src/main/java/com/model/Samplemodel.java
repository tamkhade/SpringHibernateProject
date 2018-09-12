package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="sampletable")
public class Samplemodel {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "master_id")
	private int master_id;
	
	@NotEmpty(message="City is required field")
	@Column(name="firstname",length=50)
	String firstname;
	
	@NotEmpty(message="City is required field")
	@Column(name="lastname",length=50)
	String lastname;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getMaster_id() {
		return master_id;
	}
	public void setMaster_id(int master_id) {
		this.master_id = master_id;
	}
	
	
	
	
}
