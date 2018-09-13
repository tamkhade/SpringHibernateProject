package com.healthcare.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "doc_type_mst")
public class DocumentTypeMasterEntity 
{
	@Id 
	@GeneratedValue
	@Column(name="doc_type_id")
	private long doc_type_id;
	
	@Column(name="doc_type")
	private String doc_type;
	
	@Column(name="doc_type_crtd_by")
	private long doc_type_crtd_by;
	
	@Column(name="doc_type_crtd_dt")
	private Date doc_type_crtd_dt;
	
	@Column(name="doc_type_updt_by")
	private long doc_type_updt_by;
	
	@Column(name="doc_type_updt_dt")
	private Date doc_type_updt_dt;
	
	@Column(name="doc_type_status")
	private String doc_type_status;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "documentTypeMasterEntity")
	private Set<UserDocuementDetailsMasterEntity> userDocuementDetailsMasterEntities;
}
