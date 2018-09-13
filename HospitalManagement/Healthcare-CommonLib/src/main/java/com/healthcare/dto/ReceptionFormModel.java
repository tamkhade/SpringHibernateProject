package com.healthcare.dto;

import java.util.Date;

import org.springframework.web.multipart.commons.CommonsMultipartFile;



public class ReceptionFormModel {

    private long patient_master_id;
    
    private long casepaer_id;
    
	private long departement_id;
		
	private long consultant_id;
	
	private String bloodgrouptype;
	
	private String consultant_fee;
	
	private CommonsMultipartFile[] patientphoto;
	
	private long title_id;
	
	private String patient_first_Name;
	
	private String patient_middle_Name;
	
	private String patient_last_Namel;
	
	private String patient_fullname;
	
	private long gender_id;
	
	private String dob;
	
	private long maritalStatus_id;
	
	private long bloodgroup_id;
	
	private long referaldr_id;
	
	private long patientreason_id;

	private long religion_id;
	
	private long language_id;
	
	private long nationality_id;
	
	private String passport_nationalityid;
	
	private String patient_Contno;
	
	private String patient_alt_Contno;
	
	private String patient_address;
	
	
	
	private long adharno;

    private long panno;
	
    private float weight;
	
	private float height;
	
	private String Email_id;
	
	private String landmark;
	
	private String Pat_remark;
	
	private String pat_age;
	
	private String gendertype;
	
	private String maritilstatus;
	
	private String departmenttype;
	
	private String titletype;
	
	private String referraldr;
	
	private String reasontype;
	
	private String nationality;
	
	private String religion_type;
	
	private long areaid;

	private long pincode_id;
	
	private long stateid;
	
	private long countryid;
 
	private long cityid;
	

	
	public String getReligion_type() {
		return religion_type;
	}

	public void setReligion_type(String religion_type) {
		this.religion_type = religion_type;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getReasontype() {
		return reasontype;
	}

	public void setReasontype(String reasontype) {
		this.reasontype = reasontype;
	}

	public String getReferraldr() {
		return referraldr;
	}

	public void setReferraldr(String referraldr) {
		this.referraldr = referraldr;
	}

	public String getDepartmenttype() {
		return departmenttype;
	}

	public void setDepartmenttype(String departmenttype) {
		this.departmenttype = departmenttype;
	}

	public String getTitletype() {
		return titletype;
	}

	public void setTitletype(String titletype) {
		this.titletype = titletype;
	}

	public String getMaritilstatus() {
		return maritilstatus;
	}

	public void setMaritilstatus(String maritilstatus) {
		this.maritilstatus = maritilstatus;
	}

	public String getGendertype() {
		return gendertype;
	}

	public void setGendertype(String gendertype) {
		this.gendertype = gendertype;
	}

	public String getBloodgrouptype() {
		return bloodgrouptype;
	}

	public void setBloodgrouptype(String bloodgrouptype) {
		this.bloodgrouptype = bloodgrouptype;
	}

	public String getPat_remark() {
		return Pat_remark;
	}

	public void setPat_remark(String pat_remark) {
		Pat_remark = pat_remark;
	}

	public long getDepartement_id() {
		return departement_id;
	}

	public void setDepartement_id(long departement_id) {
		this.departement_id = departement_id;
	}

	public long getConsultant_id() {
		return consultant_id;
	}

	public void setConsultant_id(long consultant_id) {
		this.consultant_id = consultant_id;
	}

	public String getConsultant_fee() {
		return consultant_fee;
	}

	public void setConsultant_fee(String consultant_fee) {
		this.consultant_fee = consultant_fee;
	}

	public CommonsMultipartFile[] getPatientphoto() {
		return patientphoto;
	}

	public void setPatientphoto(CommonsMultipartFile[] patientphoto) {
		this.patientphoto = patientphoto;
	}

	public long getTitle_id() {
		return title_id;
	}

	public void setTitle_id(long title_id) {
		this.title_id = title_id;
	}

	public String getPatient_first_Name() {
		return patient_first_Name;
	}

	public void setPatient_first_Name(String patient_first_Name) {
		this.patient_first_Name = patient_first_Name;
	}

	public String getPatient_middle_Name() {
		return patient_middle_Name;
	}

	public void setPatient_middle_Name(String patient_middle_Name) {
		this.patient_middle_Name = patient_middle_Name;
	}

	public String getPatient_last_Namel() {
		return patient_last_Namel;
	}

	public void setPatient_last_Namel(String patient_last_Namel) {
		this.patient_last_Namel = patient_last_Namel;
	}

	public String getPatient_fullname() {
		return patient_fullname;
	}

	public void setPatient_fullname(String patient_fullname) {
		this.patient_fullname = patient_fullname;
	}

	public long getGender_id() {
		return gender_id;
	}

	public void setGender_id(long gender_id) {
		this.gender_id = gender_id;
	}


	public long getMaritalStatus_id() {
		return maritalStatus_id;
	}

	public void setMaritalStatus_id(long maritalStatus_id) {
		this.maritalStatus_id = maritalStatus_id;
	}

	public long getBloodgroup_id() {
		return bloodgroup_id;
	}

	public void setBloodgroup_id(long bloodgroup_id) {
		this.bloodgroup_id = bloodgroup_id;
	}

	public long getReferaldr_id() {
		return referaldr_id;
	}

	public void setReferaldr_id(long referaldr_id) {
		this.referaldr_id = referaldr_id;
	}

	public long getPatientreason_id() {
		return patientreason_id;
	}

	public void setPatientreason_id(long patientreason_id) {
		this.patientreason_id = patientreason_id;
	}

	public long getNationality_id() {
		return nationality_id;
	}

	public void setNationality_id(long nationality_id) {
		this.nationality_id = nationality_id;
	}

	public String getPatient_Contno() {
		return patient_Contno;
	}

	public void setPatient_Contno(String patient_Contno) {
		this.patient_Contno = patient_Contno;
	}

	public String getPatient_alt_Contno() {
		return patient_alt_Contno;
	}

	public void setPatient_alt_Contno(String patient_alt_Contno) {
		this.patient_alt_Contno = patient_alt_Contno;
	}

	public String getPatient_address() {
		return patient_address;
	}

	public void setPatient_address(String patient_address) {
		this.patient_address = patient_address;
	}

	public long getPincode_id() {
		return pincode_id;
	}

	public void setPincode_id(long pincode_id) {
		this.pincode_id = pincode_id;
	}

	
	public long getAdharno() {
		return adharno;
	}

	public void setAdharno(long adharno) {
		this.adharno = adharno;
	}

	public long getPanno() {
		return panno;
	}

	public void setPanno(long panno) {
		this.panno = panno;
	}

	
	public String getPat_age() {
		return pat_age;
	}

	public void setPat_age(String pat_age) {
		this.pat_age = pat_age;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public String getEmail_id() {
		return Email_id;
	}

	public void setEmail_id(String email_id) {
		Email_id = email_id;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public long getReligion_id() {
		return religion_id;
	}

	public void setReligion_id(long religion_id) {
		this.religion_id = religion_id;
	}

	public long getLanguage_id() {
		return language_id;
	}

	public void setLanguage_id(long language_id) {
		this.language_id = language_id;
	}



	public String getPassport_nationalityid() {
		return passport_nationalityid;
	}

	public void setPassport_nationalityid(String passport_nationalityid) {
		this.passport_nationalityid = passport_nationalityid;
	}

	public long getPatient_master_id() {
		return patient_master_id;
	}

	public void setPatient_master_id(long patient_master_id) {
		this.patient_master_id = patient_master_id;
	}

	public long getCasepaer_id() {
		return casepaer_id;
	}

	public void setCasepaer_id(long casepaer_id) {
		this.casepaer_id = casepaer_id;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Long getAreaid() {
		return areaid;
	}

	public void setAreaid(Long areaid) {
		this.areaid = areaid;
	}

	public long getStateid() {
		return stateid;
	}

	public void setStateid(long stateid) {
		this.stateid = stateid;
	}

	public long getCountryid() {
		return countryid;
	}

	public void setCountryid(long countryid) {
		this.countryid = countryid;
	}

	public void setAreaid(long areaid) {
		this.areaid = areaid;
	}

	public long getCityid() {
		return cityid;
	}

	public void setCityid(long cityid) {
		this.cityid = cityid;
	}


	
	

}
