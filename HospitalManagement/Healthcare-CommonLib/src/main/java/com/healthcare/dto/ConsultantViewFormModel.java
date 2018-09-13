package com.healthcare.dto;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class ConsultantViewFormModel 
{
	private long user_id;
	
	private String user_fullnm;
	
	private long consult_detl_id;
	
	private String consult_reg_no;
	
	private long department_id;
	
	private String department_nm;
	
	private long degree_id;
	
	private String degree_type;
	
	private CommonsMultipartFile[] user_img;

	private long consult_fee_id;
	
	private String consult_newcase_fee_amount;
	
	private String serviceName;
	
	private String consult_type;
	
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

	public long getConsult_detl_id() {
		return consult_detl_id;
	}

	public void setConsult_detl_id(long consult_detl_id) {
		this.consult_detl_id = consult_detl_id;
	}

	public String getConsult_reg_no() {
		return consult_reg_no;
	}

	public void setConsult_reg_no(String consult_reg_no) {
		this.consult_reg_no = consult_reg_no;
	}

	public long getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(long department_id) {
		this.department_id = department_id;
	}

	public String getDepartment_nm() {
		return department_nm;
	}

	public void setDepartment_nm(String department_nm) {
		this.department_nm = department_nm;
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

	public long getConsult_fee_id() {
		return consult_fee_id;
	}

	public void setConsult_fee_id(long consult_fee_id) {
		this.consult_fee_id = consult_fee_id;
	}

	

	public String getConsult_newcase_fee_amount() {
		return consult_newcase_fee_amount;
	}

	public void setConsult_newcase_fee_amount(String consult_newcase_fee_amount) {
		this.consult_newcase_fee_amount = consult_newcase_fee_amount;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getConsult_type() {
		return consult_type;
	}

	public void setConsult_type(String consult_type) {
		this.consult_type = consult_type;
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
