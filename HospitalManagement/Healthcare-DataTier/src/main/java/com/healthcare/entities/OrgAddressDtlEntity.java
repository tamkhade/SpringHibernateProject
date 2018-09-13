/**
 * 
 */
package com.healthcare.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author ADMIN
 *
 */
@Entity
@Table(name="org_add_dtl")
public class OrgAddressDtlEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long org_add_dtl_id;
	
	@Column(name="area_id")
	private long area_id;
	
	@Column(name="pincode_id")
    private long pincode_id;
	
	@Column(name="address_details")
    private String address_details;
	
	@Column(name="org_add_created_by")
    private long org_add_created_by;
	
	@Column(name="org_add_created_date")
    private Date org_add_created_date;
	
	@Column(name="org_add_updated_by")
    private long org_add_updated_by;
	
	@Column(name="org_add_updated_date")
    private Date org_add_updated_date;
	
	@Column(name="org_id")
    private long org_id;
	
	@Column(name="org_add_landmark")
    private String org_add_landmark;
	
	@Column(name="org_add_status")
    private char org_add_status;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "org_id", insertable = false, updatable = false)
	private OrgMasterEntity orgMasterEntity;

	public long getOrg_add_dtl_id() {
		return org_add_dtl_id;
	}

	public void setOrg_add_dtl_id(long org_add_dtl_id) {
		this.org_add_dtl_id = org_add_dtl_id;
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

	public long getOrg_add_created_by() {
		return org_add_created_by;
	}

	public void setOrg_add_created_by(long org_add_created_by) {
		this.org_add_created_by = org_add_created_by;
	}

	public Date getOrg_add_created_date() {
		return org_add_created_date;
	}

	public void setOrg_add_created_date(Date org_add_created_date) {
		this.org_add_created_date = org_add_created_date;
	}

	public long getOrg_add_updated_by() {
		return org_add_updated_by;
	}

	public void setOrg_add_updated_by(long org_add_updated_by) {
		this.org_add_updated_by = org_add_updated_by;
	}

	public Date getOrg_add_updated_date() {
		return org_add_updated_date;
	}

	public void setOrg_add_updated_date(Date org_add_updated_date) {
		this.org_add_updated_date = org_add_updated_date;
	}

	public long getOrg_id() {
		return org_id;
	}

	public void setOrg_id(long org_id) {
		this.org_id = org_id;
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

	public OrgMasterEntity getOrgMasterEntity() {
		return orgMasterEntity;
	}

	public void setOrgMasterEntity(OrgMasterEntity orgMasterEntity) {
		this.orgMasterEntity = orgMasterEntity;
	}
	
	

}
