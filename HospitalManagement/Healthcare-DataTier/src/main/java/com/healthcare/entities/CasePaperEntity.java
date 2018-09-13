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
@Table(name = "case_paper")
public class CasePaperEntity {	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "case_paper_id")
	private long case_paper_id;
	
	@Column(name = "visting_date")
	private Date visting_date;
	
	@Column(name = "pat_bp")
	private long pat_bp;

	@Column(name = "pat_pulse")
	private long pat_pulse;
	
	@Column(name = "pat_height")
	private float patient_height;
	
	@Column(name = "pat_weight")
	private float patient_weight;

	@Column(name = "chief_complaint_det")
	private String chief_complaint_det;

	@Column(name = "allergy_det")
	private String allergy_det;
	
	
	@Column(name = "past_dieses_det")
	private String past_dieses_det;
	
	@Column(name = "personal_det")
	private String personal_det;
	
	@Column(name = "past_medicine_det")
	private String past_medicine_det;
	
	@Column(name = "diagnosis_det")
	private String diagnosis_det;
	
	@Column(name = "docs_note")
	private String docs_note;
	
	@Column(name = "followup_date")
	private Date followup_date;
	
	@Column(name = "consult_dtl_id", insertable = false, updatable = false)
	private String consult_dtl_id;
	


	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pat_id", nullable = false)
	private PatientMasterEntity patient_master;


	
	public long getCase_paper_id() {
		return case_paper_id;
	}


	public void setCase_paper_id(long case_paper_id) {
		this.case_paper_id = case_paper_id;
	}


	public Date getVisting_date() {
		return visting_date;
	}


	public void setVisting_date(Date visting_date) {
		this.visting_date = visting_date;
	}


	public long getPat_bp() {
		return pat_bp;
	}


	public void setPat_bp(long pat_bp) {
		this.pat_bp = pat_bp;
	}


	public long getPat_pulse() {
		return pat_pulse;
	}


	public void setPat_pulse(long pat_pulse) {
		this.pat_pulse = pat_pulse;
	}


	public float getPatient_height() {
		return patient_height;
	}


	public void setPatient_height(float patient_height) {
		this.patient_height = patient_height;
	}


	public float getPatient_weight() {
		return patient_weight;
	}


	public void setPatient_weight(float patient_weight) {
		this.patient_weight = patient_weight;
	}


	public String getChief_complaint_det() {
		return chief_complaint_det;
	}


	public void setChief_complaint_det(String chief_complaint_det) {
		this.chief_complaint_det = chief_complaint_det;
	}


	public String getAllergy_det() {
		return allergy_det;
	}


	public void setAllergy_det(String allergy_det) {
		this.allergy_det = allergy_det;
	}


	public String getPast_dieses_det() {
		return past_dieses_det;
	}


	public void setPast_dieses_det(String past_dieses_det) {
		this.past_dieses_det = past_dieses_det;
	}


	public String getPersonal_det() {
		return personal_det;
	}


	public void setPersonal_det(String personal_det) {
		this.personal_det = personal_det;
	}


	public String getPast_medicine_det() {
		return past_medicine_det;
	}


	public void setPast_medicine_det(String past_medicine_det) {
		this.past_medicine_det = past_medicine_det;
	}


	public String getDiagnosis_det() {
		return diagnosis_det;
	}


	public void setDiagnosis_det(String diagnosis_det) {
		this.diagnosis_det = diagnosis_det;
	}


	public String getDocs_note() {
		return docs_note;
	}


	public void setDocs_note(String docs_note) {
		this.docs_note = docs_note;
	}


	public Date getFollowup_date() {
		return followup_date;
	}


	public void setFollowup_date(Date followup_date) {
		this.followup_date = followup_date;
	}


	public String getConsult_dtl_id() {
		return consult_dtl_id;
	}


	public void setConsult_dtl_id(String consult_dtl_id) {
		this.consult_dtl_id = consult_dtl_id;
	}


	public PatientMasterEntity getPatient_master() {
		return patient_master;
	}


	public void setPatient_master(PatientMasterEntity patient_master) {
		this.patient_master = patient_master;
	}

	
	
	
}