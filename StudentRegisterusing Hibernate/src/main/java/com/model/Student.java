package com.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int s_id;
	private int enroll;
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "student", fetch = FetchType.LAZY)
	private List<Batch> batch_list;

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public int getEnroll() {
		return enroll;
	}

	public void setEnroll(int enroll) {
		this.enroll = enroll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Batch> getBatch_list() {
		return batch_list;
	}

	public void setBatch_list(List<Batch> batch_list) {
		this.batch_list = batch_list;
	}
	
	
	
}
