package com.healthcare.dto;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class EmployeeMasterFormModel 
{
	private long user_type_id;
	
	private long emp_type_id;
	
	private String user_name;
	
	private String user_password;
	
	private long gender_id;
	
	private long title_id;
	
	private String first_nm;
	
	private String middle_nm;
	
	private String last_nm;
	
	private String DOB;
	
	private String DOJ;
	
	private String moblie_no;
	
	private String alt_mob_no;
	
	private String email_id;
	
	private long area_id;
	
	private long country_id;
	
	private long state_id;
	
	private long city_id;
	
	private long pincode;
	
	private String address;
	
	private CommonsMultipartFile[] emp_photo;
	
	private CommonsMultipartFile[] aadhar_doc_image;
	
	private String aadhar_no;
	
	private CommonsMultipartFile[] pan_doc_image;
	
	private String pan_no;
	
	private String landmark;
	
	private long degree_id;
	
	

	public long getUser_type_id() {
		return user_type_id;
	}

	public void setUser_type_id(long user_type_id) {
		this.user_type_id = user_type_id;
	}

	public long getEmp_type_id() {
		return emp_type_id;
	}

	public void setEmp_type_id(long emp_type_id) {
		this.emp_type_id = emp_type_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public long getGender_id() {
		return gender_id;
	}

	public void setGender_id(long gender_id) {
		this.gender_id = gender_id;
	}

	public long getTitle_id() {
		return title_id;
	}

	public void setTitle_id(long title_id) {
		this.title_id = title_id;
	}

	public String getFirst_nm() {
		return first_nm;
	}

	public void setFirst_nm(String first_nm) {
		this.first_nm = first_nm;
	}

	public String getMiddle_nm() {
		return middle_nm;
	}

	public void setMiddle_nm(String middle_nm) {
		this.middle_nm = middle_nm;
	}

	public String getLast_nm() {
		return last_nm;
	}

	public void setLast_nm(String last_nm) {
		this.last_nm = last_nm;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getDOJ() {
		return DOJ;
	}

	public void setDOJ(String dOJ) {
		DOJ = dOJ;
	}

	public String getMoblie_no() {
		return moblie_no;
	}

	public void setMoblie_no(String moblie_no) {
		this.moblie_no = moblie_no;
	}

	public String getAlt_mob_no() {
		return alt_mob_no;
	}

	public void setAlt_mob_no(String alt_mob_no) {
		this.alt_mob_no = alt_mob_no;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public long getArea_id() {
		return area_id;
	}

	public void setArea_id(long area_id) {
		this.area_id = area_id;
	}

	public long getCountry_id() {
		return country_id;
	}

	public void setCountry_id(long country_id) {
		this.country_id = country_id;
	}

	public long getState_id() {
		return state_id;
	}

	public void setState_id(long state_id) {
		this.state_id = state_id;
	}

	public long getCity_id() {
		return city_id;
	}

	public void setCity_id(long city_id) {
		this.city_id = city_id;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public CommonsMultipartFile[] getEmp_photo() {
		return emp_photo;
	}

	public void setEmp_photo(CommonsMultipartFile[] emp_photo) {
		this.emp_photo = emp_photo;
	}

	public CommonsMultipartFile[] getAadhar_doc_image() {
		return aadhar_doc_image;
	}

	public void setAadhar_doc_image(CommonsMultipartFile[] aadhar_doc_image) {
		this.aadhar_doc_image = aadhar_doc_image;
	}

	public String getAadhar_no() {
		return aadhar_no;
	}

	public void setAadhar_no(String aadhar_no) {
		this.aadhar_no = aadhar_no;
	}

	public CommonsMultipartFile[] getPan_doc_image() {
		return pan_doc_image;
	}

	public void setPan_doc_image(CommonsMultipartFile[] pan_doc_image) {
		this.pan_doc_image = pan_doc_image;
	}

	public String getPan_no() {
		return pan_no;
	}

	public void setPan_no(String pan_no) {
		this.pan_no = pan_no;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	

	public long getDegree_id() {
		return degree_id;
	}

	public void setDegree_id(long degree_id) {
		this.degree_id = degree_id;
	}
}
