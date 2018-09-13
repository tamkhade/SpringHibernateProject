package com.healthcare.dto;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class EmployeeViewFormModel 
{
	private long user_id;
	
	private String user_fullnm;
	
	private long employee_type_id;
	
	private String employee_type;
	
	private long degree_id;
	
	private String degree_type;
	
	private CommonsMultipartFile[] user_img;

	private String mobile_no;
	
	private String dob;
	
	private String doj;
	
	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	public String getUser_fullnm() {
		return user_fullnm;
	}

	public void setUser_fullnm(String user_fullnm) {
		this.user_fullnm = user_fullnm;
	}

	public long getEmployee_type_id() {
		return employee_type_id;
	}

	public void setEmployee_type_id(long employee_type_id) {
		this.employee_type_id = employee_type_id;
	}

	public String getEmployee_type() {
		return employee_type;
	}

	public void setEmployee_type(String employee_type) {
		this.employee_type = employee_type;
	}

	public long getDegree_id() {
		return degree_id;
	}

	public void setDegree_id(long degree_id) {
		this.degree_id = degree_id;
	}

	public String getDegree_type() {
		return degree_type;
	}

	public void setDegree_type(String degree_type) {
		this.degree_type = degree_type;
	}

	public CommonsMultipartFile[] getUser_img() {
		return user_img;
	}

	public void setUser_img(CommonsMultipartFile[] user_img) {
		this.user_img = user_img;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}
}
