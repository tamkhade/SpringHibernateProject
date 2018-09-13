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
@Table(name = "org_user")
public class OrgnizationUserMasterEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "org_user_id")
	private long org_user_id;
	
	@Column(name = "user_fnm")
	private String user_fnm;
	
	@Column(name = "user_mnm")
	private String user_mnm;
	
	@Column(name = "user_lnm")
	private String user_lnm;
	
	@Column(name = "user_fullnm")
	private String user_fullnm;
	
	@Column(name = "user_dob")
	private Date user_dob;
	
	@Column(name = "user_doj")
	private Date user_doj;
	
	@Column(name = "user_img")
	private byte[] user_img;
	
	
	@Column(name = "user_age")
	private long user_age;
	
	@Column(name = "user_mob_no")
	private String user_mob_no;
	
	@Column(name = "user_alt_mob_no")
	private String user_alt_mob_no;
	
	@Column(name = "user_crtd_dt")
	private Date user_crtd_dt;
	
	@Column(name = "user_updtd_dt")
	private Date user_updtd_dt;
	
	@Column(name = "user_created_by")
	private long user_created_by;
	
	@Column(name = "user_updated_by")
	private long user_updated_by;
	
	
	@Column(name = "user_status")
	private char user_status;
	
	@Column(name = "user_type_id")
	private long user_type_id;
	
	
	@Column(name = "gender_id")
	private long gender_id;
	
	@Column(name = "title_id")
	private long title_id;
	
	@Column(name = "degree_id")
	private long degree_id;

	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "title_id", insertable = false, updatable = false)
	private TitleMasterEntity titleMasterEntity;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "degree_id", insertable = false, updatable = false)
	private DegreeMasterEntity degreeMasterEntity;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_type_id", insertable = false, updatable = false)
	private UserTypeMasterEnity userTypeMasterEnity;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "orgnizationUserMasterEntity")
	private Set<UserAddressMasterEntity> userAddressMasterEntities;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "orgnizationUserMasterEntity")
	private Set<UserBankDetailMaster> userBankDetailMasters;

	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "orgnizationUserMasterEntity")
	private Set<UserCredentialsEntity> userCredentialsEntities;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "orgnizationUserMasterEntity")
	private Set<UserDocuementDetailsMasterEntity> userDocuementDetailsMasters ;

	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "orgnizationUserMasterEntity")
	private Set<ConsultantDetailMasterEntity> consultantDetailMasterEntities ;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "orgnizationUserMasterEntity")
	private Set<EmployeeDetailMasterEntity> employeeDetailMasterEntities ;
	
	public long getOrg_user_id() {
		return org_user_id;
	}

	public void setOrg_user_id(long org_user_id) {
		this.org_user_id = org_user_id;
	}

	public String getUser_fnm() {
		return user_fnm;
	}

	public void setUser_fnm(String user_fnm) {
		this.user_fnm = user_fnm;
	}

	public String getUser_mnm() {
		return user_mnm;
	}

	public void setUser_mnm(String user_mnm) {
		this.user_mnm = user_mnm;
	}

	public String getUser_lnm() {
		return user_lnm;
	}

	public void setUser_lnm(String user_lnm) {
		this.user_lnm = user_lnm;
	}

	public String getUser_fullnm() {
		return user_fullnm;
	}

	public void setUser_fullnm(String user_fullnm) {
		this.user_fullnm = user_fullnm;
	}

	public Date getUser_dob() {
		return user_dob;
	}

	public void setUser_dob(Date user_dob) {
		this.user_dob = user_dob;
	}

	public Date getUser_doj() {
		return user_doj;
	}

	public void setUser_doj(Date user_doj) {
		this.user_doj = user_doj;
	}

	public byte[] getUser_img() {
		return user_img;
	}

	public void setUser_img(byte[] user_img) {
		this.user_img = user_img;
	}

	public long getUser_age() {
		return user_age;
	}

	public void setUser_age(long user_age) {
		this.user_age = user_age;
	}

	public String getUser_mob_no() {
		return user_mob_no;
	}

	public void setUser_mob_no(String user_mob_no) {
		this.user_mob_no = user_mob_no;
	}

	public String getUser_alt_mob_no() {
		return user_alt_mob_no;
	}

	public void setUser_alt_mob_no(String user_alt_mob_no) {
		this.user_alt_mob_no = user_alt_mob_no;
	}

	public Date getUser_crtd_dt() {
		return user_crtd_dt;
	}

	public void setUser_crtd_dt(Date user_crtd_dt) {
		this.user_crtd_dt = user_crtd_dt;
	}

	public Date getUser_updtd_dt() {
		return user_updtd_dt;
	}

	public void setUser_updtd_dt(Date user_updtd_dt) {
		this.user_updtd_dt = user_updtd_dt;
	}

	public long getUser_created_by() {
		return user_created_by;
	}

	public void setUser_created_by(long user_created_by) {
		this.user_created_by = user_created_by;
	}

	public long getUser_updated_by() {
		return user_updated_by;
	}

	public void setUser_updated_by(long user_updated_by) {
		this.user_updated_by = user_updated_by;
	}

	public char getUser_status() {
		return user_status;
	}

	public void setUser_status(char user_status) {
		this.user_status = user_status;
	}

	public long getUser_type_id() {
		return user_type_id;
	}

	public void setUser_type_id(long user_type_id) {
		this.user_type_id = user_type_id;
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

	public long getDegree_id() {
		return degree_id;
	}

	public void setDegree_id(long degree_id) {
		this.degree_id = degree_id;
	}

	public TitleMasterEntity getTitleMasterEntity() {
		return titleMasterEntity;
	}

	public void setTitleMasterEntity(TitleMasterEntity titleMasterEntity) {
		this.titleMasterEntity = titleMasterEntity;
	}

	public DegreeMasterEntity getDegreeMasterEntity() {
		return degreeMasterEntity;
	}

	public void setDegreeMasterEntity(DegreeMasterEntity degreeMasterEntity) {
		this.degreeMasterEntity = degreeMasterEntity;
	}

	public UserTypeMasterEnity getUserTypeMasterEnity() {
		return userTypeMasterEnity;
	}

	public void setUserTypeMasterEnity(UserTypeMasterEnity userTypeMasterEnity) {
		this.userTypeMasterEnity = userTypeMasterEnity;
	}

	public Set<UserAddressMasterEntity> getUserAddressMasterEntities() {
		return userAddressMasterEntities;
	}

	public void setUserAddressMasterEntities(Set<UserAddressMasterEntity> userAddressMasterEntities) {
		this.userAddressMasterEntities = userAddressMasterEntities;
	}

	public Set<UserBankDetailMaster> getUserBankDetailMasters() {
		return userBankDetailMasters;
	}

	public void setUserBankDetailMasters(Set<UserBankDetailMaster> userBankDetailMasters) {
		this.userBankDetailMasters = userBankDetailMasters;
	}

	public Set<UserCredentialsEntity> getUserCredentialsEntities() {
		return userCredentialsEntities;
	}

	public void setUserCredentialsEntities(Set<UserCredentialsEntity> userCredentialsEntities) {
		this.userCredentialsEntities = userCredentialsEntities;
	}

	public Set<UserDocuementDetailsMasterEntity> getUserDocuementDetailsMasters() {
		return userDocuementDetailsMasters;
	}

	public void setUserDocuementDetailsMasters(Set<UserDocuementDetailsMasterEntity> userDocuementDetailsMasters) {
		this.userDocuementDetailsMasters = userDocuementDetailsMasters;
	}

	public Set<ConsultantDetailMasterEntity> getConsultantDetailMasterEntities() {
		return consultantDetailMasterEntities;
	}

	public void setConsultantDetailMasterEntities(Set<ConsultantDetailMasterEntity> consultantDetailMasterEntities) {
		this.consultantDetailMasterEntities = consultantDetailMasterEntities;
	}

	public Set<EmployeeDetailMasterEntity> getEmployeeDetailMasterEntities() {
		return employeeDetailMasterEntities;
	}

	public void setEmployeeDetailMasterEntities(Set<EmployeeDetailMasterEntity> employeeDetailMasterEntities) {
		this.employeeDetailMasterEntities = employeeDetailMasterEntities;
	}
}
