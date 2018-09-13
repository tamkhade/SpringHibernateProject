package com.model;

public class Employee {
	
	private int id;
	private String name;
	private String address;
	private String mobile;
	private String emailid;
	private String gender;
	private String country;
	private String favLanguages;
	
	
	public String getFavLanguages() 
	{
		return favLanguages;
	}
	
	public void setFavLanguages(String favLanguages) 
	{
		this.favLanguages = favLanguages;
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
