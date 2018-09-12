package com.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="s_id")
	private int s_id;
	@Column(name="enroll")
	private String enroll;
	@Column(name="name")
	private String name;
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "STUDENT_batch", joinColumns = { @JoinColumn(name = "Student_id") }, inverseJoinColumns = { @JoinColumn(name = "batchid") })
	
	private List<Batch> batch_list;

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public String getEnroll() {
		return enroll;
	}

	public void setEnroll(String enroll) {
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

	@Override
	public String toString() {
		return "Student [s_id=" + s_id + ", enroll=" + enroll + ", name="
				+ name + ", batch_list=" + batch_list + "]";
	}

	public void setBatch_list(List<Batch> batch_list) {
		this.batch_list = batch_list;
	}
	
	
	
	
}
