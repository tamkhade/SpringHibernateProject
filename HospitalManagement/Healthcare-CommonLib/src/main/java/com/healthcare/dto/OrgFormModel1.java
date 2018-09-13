/**
 * 
 */
package com.healthcare.dto;

/**
 * @author ADMIN
 *
 */
public class OrgFormModel1 {
	//org-master table
	private long org_id;
	private String org_name;
	private String org_reg_no;
	private long org_bed_nos;
	private String org_landline_no;
	private String org_mob_no;
	private String org_email;
	private byte org_logo;
	private char org_status;
	private  long org_parnt_id;
	private long org_type_id;
	private String org_active_from;
	private String org_active_to;
	private char org_brnch_status;
	private long org_brnch_count;
	//bank dtl table
	private String bnk_acct_no;
	private char org_bnk_status;
	private long bnk_brnch_id;
	private long bnk_acct_type_id;
//	private long org_id;
	//org add dtl
	private long area_id;
	private long pincode_id;
	private String address_details;
	//private long org_id;
	private String org_add_landmark;
	private char org_add_status;
//org-own model  master
	private long user_max_cnt;
	private long remn_user_cnt;
	public long getOrg_id() {
		return org_id;
	}
	public void setOrg_id(long org_id) {
		this.org_id = org_id;
	}
	public String getOrg_name() {
		return org_name;
	}
	public void setOrg_name(String org_name) {
		this.org_name = org_name;
	}
	public String getOrg_reg_no() {
		return org_reg_no;
	}
	public void setOrg_reg_no(String org_reg_no) {
		this.org_reg_no = org_reg_no;
	}
	public long getOrg_bed_nos() {
		return org_bed_nos;
	}
	public void setOrg_bed_nos(long org_bed_nos) {
		this.org_bed_nos = org_bed_nos;
	}
	public String getOrg_landline_no() {
		return org_landline_no;
	}
	public void setOrg_landline_no(String org_landline_no) {
		this.org_landline_no = org_landline_no;
	}
	public String getOrg_mob_no() {
		return org_mob_no;
	}
	public void setOrg_mob_no(String org_mob_no) {
		this.org_mob_no = org_mob_no;
	}
	public String getOrg_email() {
		return org_email;
	}
	public void setOrg_email(String org_email) {
		this.org_email = org_email;
	}
	public byte getOrg_logo() {
		return org_logo;
	}
	public void setOrg_logo(byte org_logo) {
		this.org_logo = org_logo;
	}
	public char getOrg_status() {
		return org_status;
	}
	public void setOrg_status(char org_status) {
		this.org_status = org_status;
	}
	public long getOrg_parnt_id() {
		return org_parnt_id;
	}
	public void setOrg_parnt_id(long org_parnt_id) {
		this.org_parnt_id = org_parnt_id;
	}
	public long getOrg_type_id() {
		return org_type_id;
	}
	public void setOrg_type_id(long org_type_id) {
		this.org_type_id = org_type_id;
	}
	public String getOrg_active_from() {
		return org_active_from;
	}
	public void setOrg_active_from(String org_active_from) {
		this.org_active_from = org_active_from;
	}
	public String getOrg_active_to() {
		return org_active_to;
	}
	public void setOrg_active_to(String org_active_to) {
		this.org_active_to = org_active_to;
	}
	public char getOrg_brnch_status() {
		return org_brnch_status;
	}
	public void setOrg_brnch_status(char org_brnch_status) {
		this.org_brnch_status = org_brnch_status;
	}
	public long getOrg_brnch_count() {
		return org_brnch_count;
	}
	public void setOrg_brnch_count(long org_brnch_count) {
		this.org_brnch_count = org_brnch_count;
	}
	public String getBnk_acct_no() {
		return bnk_acct_no;
	}
	public void setBnk_acct_no(String bnk_acct_no) {
		this.bnk_acct_no = bnk_acct_no;
	}
	public char getOrg_bnk_status() {
		return org_bnk_status;
	}
	public void setOrg_bnk_status(char org_bnk_status) {
		this.org_bnk_status = org_bnk_status;
	}
	public long getBnk_brnch_id() {
		return bnk_brnch_id;
	}
	public void setBnk_brnch_id(long bnk_brnch_id) {
		this.bnk_brnch_id = bnk_brnch_id;
	}
	public long getBnk_acct_type_id() {
		return bnk_acct_type_id;
	}
	public void setBnk_acct_type_id(long bnk_acct_type_id) {
		this.bnk_acct_type_id = bnk_acct_type_id;
	}
	public long getArea_id() {
		return area_id;
	}
	public void setArea_id(long area_id) {
		this.area_id = area_id;
	}
	public long getPincode_id() {
		return pincode_id;
	}
	public void setPincode_id(long pincode_id) {
		this.pincode_id = pincode_id;
	}
	public String getAddress_details() {
		return address_details;
	}
	public void setAddress_details(String address_details) {
		this.address_details = address_details;
	}
	public String getOrg_add_landmark() {
		return org_add_landmark;
	}
	public void setOrg_add_landmark(String org_add_landmark) {
		this.org_add_landmark = org_add_landmark;
	}
	public char getOrg_add_status() {
		return org_add_status;
	}
	public void setOrg_add_status(char org_add_status) {
		this.org_add_status = org_add_status;
	}
	public long getUser_max_cnt() {
		return user_max_cnt;
	}
	public void setUser_max_cnt(long user_max_cnt) {
		this.user_max_cnt = user_max_cnt;
	}
	public long getRemn_user_cnt() {
		return remn_user_cnt;
	}
	public void setRemn_user_cnt(long remn_user_cnt) {
		this.remn_user_cnt = remn_user_cnt;
	}
	
	
	
	

}
