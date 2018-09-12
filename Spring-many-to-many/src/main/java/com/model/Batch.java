package com.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Batch {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name="year")
	private String year;
	@Column(name="percentage")
	private int percentage;
	@Column(name="grade")
	private String grade;
	
	
	@ManyToMany(mappedBy="batch_list")
	private List<Student> studentlist;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}


	public int getPercentage() {
		return percentage;
	}


	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	public List<Student> getStudentlist() {
		return studentlist;
	}


	public void setStudentlist(List<Student> studentlist) {
		this.studentlist = studentlist;
	}

	
	
	
	
}
