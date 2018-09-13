package com.healthcare.dto;

public class BankBranchMasterFormModel {

	private long bnk_brnch_id;
	private long area_id;
	private String ifsc_cd;
	private String micr_cd;
	private String bnk_brnch_add;
	/*private long created_by;
	private Date creatd_dt;
	private long updated_by;
	private Date updated_dt;
	private char bnk_brnch_status;*/
	private long bnk_id;
	public long getBnk_brnch_id() {
		return bnk_brnch_id;
	}
	public void setBnk_brnch_id(long bnk_brnch_id) {
		this.bnk_brnch_id = bnk_brnch_id;
	}
	public long getArea_id() {
		return area_id;
	}
	public void setArea_id(long area_id) {
		this.area_id = area_id;
	}
	public String getIfsc_cd() {
		return ifsc_cd;
	}
	public void setIfsc_cd(String ifsc_cd) {
		this.ifsc_cd = ifsc_cd;
	}
	public String getMicr_cd() {
		return micr_cd;
	}
	public void setMicr_cd(String micr_cd) {
		this.micr_cd = micr_cd;
	}
	public String getBnk_brnch_add() {
		return bnk_brnch_add;
	}
	public void setBnk_brnch_add(String bnk_brnch_add) {
		this.bnk_brnch_add = bnk_brnch_add;
	}
	public long getBnk_id() {
		return bnk_id;
	}
	public void setBnk_id(long bnk_id) {
		this.bnk_id = bnk_id;
	}
	
	
}
