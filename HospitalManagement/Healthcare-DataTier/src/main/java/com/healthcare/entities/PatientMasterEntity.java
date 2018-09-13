package com.healthcare.entities;

import java.util.Arrays;
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
@Table(name = "pat_mst")

public class PatientMasterEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "pat_id")
	private long patient_master_id;

	@Column(name = "title_id")
	private long title_id;
	
	@Column(name = "patientphoto")
	private byte[] patientphoto;
	
	@Column(name = "pat_fnm")
	private String patient_fname;

	@Column(name = "pat_mnm")
	private String patient_mname;

	@Column(name = "pat_lnm")
	private String patient_lname;

	@Column(name = "pat_full_nm")
	private String patient_fullname;
	
	@Column(name = "pat_mob_no")
	private String pat_mob_no;
	
	@Column(name = "pat_alt_mob_no")
	private String pat_alt_mob_no;
	
	@Column(name = "pat_dob")
	private Date pat_dob;
	
	@Column(name = "pat_age")
	private String pat_age;
	
	@Column(name = "gender_id")
	private long gender_id;
	
	@Column(name = "pat_add_dtl")
	private String pat_add_dtl;
	
	@Column(name = "pat_email")
	private String pat_email;
	
	@Column(name = "pat_admi_tm")
	private Date pat_admi_tm;
	
	@Column(name = "pat_remark")
	private String pat_remark;
	
	@Column(name = "pincode_id")
	private long pincode_id;
	
	@Column(name = "area_id")
	private long area_id;
	
	@Column(name = "add_landmark")
	private String add_landmark;
	
	@Column(name = "pat_admi_dt")
	private Date pat_admi_dt;
	
	@Column(name = "reason_mst_id")
	private long reason_mst_id;
	
	@Column(name = "pat_crtd_dt")
	private Date pat_crtd_dt;
	
	@Column(name = "pat_crtd_by")
	private long pat_crtd_by;
	
	@Column(name = "pat_updtd_dt")
	private Date pat_updtd_dt;
	
	@Column(name = "pat_updtd_by")
	private long pat_updtd_by;
	
	@Column(name = "pat_status")
	private char pat_status;
	
	@Column(name = "blood_grp_id")
	private long blood_grp_id;
	
	@Column(name = "org_id", insertable = false, updatable = false)
	private String org_id;

	@Column(name = "ref_id")
	private long ref_id;
		
	@Column(name = "nationality_id")
	private long nationality_id;
	
	@Column(name = "religion_id")
	private long religion_id;
	
	@Column(name = "passport_nationalityid")
	private String passport_nationalityid;
	
	@Column(name = "pref_lang_id")
	private long pref_lang_id;
	

	
	public long getMartl_status_id() {
		return martl_status_id;
	}

	public void setMartl_status_id(long martl_status_id) {
		this.martl_status_id = martl_status_id;
	}

	@Column(name = "martl_status_id")
	private long martl_status_id;
	
	
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "patient_master")
	private Set<CasePaperEntity> casepaperEntity;

	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "blood_grp_id", insertable = false, updatable = false)
	private BloodGroupEntity bloodGroupEntity;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "religion_id", insertable = false, updatable = false)
	private ReligionMasterEntity religionMasterEntity;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "reason_mst_id", insertable = false, updatable = false)
	private ReasonMasterEntity raReasonMasterEntity;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "nationality_id", insertable = false, updatable = false)
	private NationalityMasterEntity nationalityMasterEntity;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "gender_id", insertable = false, updatable = false)
	private GenderDetailsEntity genderDetailsEntity;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "martl_status_id", insertable = false, updatable = false)
	private MaritalStatusEntity maritalStatusEntity;

	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "title_id", insertable = false, updatable = false)
	private TitleMasterEntity titleMasterEntity;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ref_id", insertable = false, updatable = false)
	private ReferralMaster referralMaster;
	
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pref_lang_id", insertable = false, updatable = false)
	private LanguageMasterEntity languageMasterEntity;
	

	

	public long getTitle_id() {
		return title_id;
	}

	public void setTitle_id(long title_id) {
		this.title_id = title_id;
	}

	public String getPatient_fname() {
		return patient_fname;
	}

	public void setPatient_fname(String patient_fname) {
		this.patient_fname = patient_fname;
	}

	public String getPatient_mname() {
		return patient_mname;
	}

	public void setPatient_mname(String patient_mname) {
		this.patient_mname = patient_mname;
	}

	public String getPatient_lname() {
		return patient_lname;
	}

	public void setPatient_lname(String patient_lname) {
		this.patient_lname = patient_lname;
	}

	public String getPatient_fullname() {
		return patient_fullname;
	}

	public void setPatient_fullname(String patient_fullname) {
		this.patient_fullname = patient_fullname;
	}

	public String getPat_mob_no() {
		return pat_mob_no;
	}

	public void setPat_mob_no(String pat_mob_no) {
		this.pat_mob_no = pat_mob_no;
	}

	public String getPat_alt_mob_no() {
		return pat_alt_mob_no;
	}

	public void setPat_alt_mob_no(String pat_alt_mob_no) {
		this.pat_alt_mob_no = pat_alt_mob_no;
	}

	public Date getPat_dob() {
		return pat_dob;
	}

	public void setPat_dob(Date pat_dob) {
		this.pat_dob = pat_dob;
	}

	public String getPat_age() {
		return pat_age;
	}

	public void setPat_age(String pat_age) {
		this.pat_age = pat_age;
	}

	public long getGender_id() {
		return gender_id;
	}

	public void setGender_id(long gender_id) {
		this.gender_id = gender_id;
	}

	public String getPat_add_dtl() {
		return pat_add_dtl;
	}

	public void setPat_add_dtl(String pat_add_dtl) {
		this.pat_add_dtl = pat_add_dtl;
	}

	public String getPat_email() {
		return pat_email;
	}

	public void setPat_email(String pat_email) {
		this.pat_email = pat_email;
	}

	public Date getPat_admi_tm() {
		return pat_admi_tm;
	}

	public void setPat_admi_tm(Date pat_admi_tm) {
		this.pat_admi_tm = pat_admi_tm;
	}

	public String getPat_remark() {
		return pat_remark;
	}

	public void setPat_remark(String pat_remark) {
		this.pat_remark = pat_remark;
	}

	public long getPincode_id() {
		return pincode_id;
	}

	public void setPincode_id(long pincode_id) {
		this.pincode_id = pincode_id;
	}



	public String getAdd_landmark() {
		return add_landmark;
	}

	public void setAdd_landmark(String add_landmark) {
		this.add_landmark = add_landmark;
	}

	public Date getPat_admi_dt() {
		return pat_admi_dt;
	}

	public void setPat_admi_dt(Date pat_admi_dt) {
		this.pat_admi_dt = pat_admi_dt;
	}

	public long getReason_mst_id() {
		return reason_mst_id;
	}

	public void setReason_mst_id(long reason_mst_id) {
		this.reason_mst_id = reason_mst_id;
	}

	public Date getPat_crtd_dt() {
		return pat_crtd_dt;
	}

	public void setPat_crtd_dt(Date pat_crtd_dt) {
		this.pat_crtd_dt = pat_crtd_dt;
	}

	public long getPat_crtd_by() {
		return pat_crtd_by;
	}

	public void setPat_crtd_by(long pat_crtd_by) {
		this.pat_crtd_by = pat_crtd_by;
	}

	public Date getPat_updtd_dt() {
		return pat_updtd_dt;
	}

	public void setPat_updtd_dt(Date pat_updtd_dt) {
		this.pat_updtd_dt = pat_updtd_dt;
	}

	

	public char getPat_status() {
		return pat_status;
	}

	public void setPat_status(char pat_status) {
		this.pat_status = pat_status;
	}

	public long getBlood_grp_id() {
		return blood_grp_id;
	}

	public void setBlood_grp_id(long blood_grp_id) {
		this.blood_grp_id = blood_grp_id;
	}

	

	public long getRef_id() {
		return ref_id;
	}

	public void setRef_id(long ref_id) {
		this.ref_id = ref_id;
	}

	public long getNationality_id() {
		return nationality_id;
	}

	public void setNationality_id(long nationality_id) {
		this.nationality_id = nationality_id;
	}

	public long getReligion_id() {
		return religion_id;
	}

	public void setReligion_id(long religion_id) {
		this.religion_id = religion_id;
	}

	public Set<CasePaperEntity> getCasepaperEntity() {
		return casepaperEntity;
	}

	public void setCasepaperEntity(Set<CasePaperEntity> casepaperEntity) {
		this.casepaperEntity = casepaperEntity;
	}

	public BloodGroupEntity getBloodGroupEntity() {
		return bloodGroupEntity;
	}

	public void setBloodGroupEntity(BloodGroupEntity bloodGroupEntity) {
		this.bloodGroupEntity = bloodGroupEntity;
	}

	public ReligionMasterEntity getReligionMasterEntity() {
		return religionMasterEntity;
	}

	public void setReligionMasterEntity(ReligionMasterEntity religionMasterEntity) {
		this.religionMasterEntity = religionMasterEntity;
	}

	public ReasonMasterEntity getRaReasonMasterEntity() {
		return raReasonMasterEntity;
	}

	public void setRaReasonMasterEntity(ReasonMasterEntity raReasonMasterEntity) {
		this.raReasonMasterEntity = raReasonMasterEntity;
	}

	public NationalityMasterEntity getNationalityMasterEntity() {
		return nationalityMasterEntity;
	}

	public void setNationalityMasterEntity(NationalityMasterEntity nationalityMasterEntity) {
		this.nationalityMasterEntity = nationalityMasterEntity;
	}

	public GenderDetailsEntity getGenderDetailsEntity() {
		return genderDetailsEntity;
	}

	public void setGenderDetailsEntity(GenderDetailsEntity genderDetailsEntity) {
		this.genderDetailsEntity = genderDetailsEntity;
	}

	public byte[] getPatientphoto() {
		return patientphoto;
	}

	public void setPatientphoto(byte[] patientphoto) {
		this.patientphoto = patientphoto;
	}

	public MaritalStatusEntity getMaritalStatusEntity() {
		return maritalStatusEntity;
	}

	public void setMaritalStatusEntity(MaritalStatusEntity maritalStatusEntity) {
		this.maritalStatusEntity = maritalStatusEntity;
	}

	public long getPat_updtd_by() {
		return pat_updtd_by;
	}

	public String getOrg_id() {
		return org_id;
	}

	public void setOrg_id(String org_id) {
		this.org_id = org_id;
	}

	public TitleMasterEntity getTitleMasterEntity() {
		return titleMasterEntity;
	}

	public void setTitleMasterEntity(TitleMasterEntity titleMasterEntity) {
		this.titleMasterEntity = titleMasterEntity;
	}

	public ReferralMaster getReferralMaster() {
		return referralMaster;
	}

	public void setReferralMaster(ReferralMaster referralMaster) {
		this.referralMaster = referralMaster;
	}

	public void setPat_updtd_by(long pat_updtd_by) {
		this.pat_updtd_by = pat_updtd_by;
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

	@Override
	public String toString() {
		return "PatientMasterEntity [patient_master_id=" + patient_master_id + ", title_id=" + title_id
				+ ", patientphoto=" + Arrays.toString(patientphoto) + ", patient_fname=" + patient_fname
				+ ", patient_mname=" + patient_mname + ", patient_lname=" + patient_lname + ", patient_fullname="
				+ patient_fullname + ", pat_mob_no=" + pat_mob_no + ", pat_alt_mob_no=" + pat_alt_mob_no + ", pat_dob="
				+ pat_dob + ", pat_age=" + pat_age + ", gender_id=" + gender_id + ", pat_add_dtl=" + pat_add_dtl
				+ ", pat_email=" + pat_email + ", pat_admi_tm=" + pat_admi_tm + ", pat_remark=" + pat_remark
				+ ", pincode_id=" + pincode_id + ", area_id=" + area_id + ", add_landmark=" + add_landmark
				+ ", pat_admi_dt=" + pat_admi_dt + ", reason_mst_id=" + reason_mst_id + ", pat_crtd_dt=" + pat_crtd_dt
				+ ", pat_crtd_by=" + pat_crtd_by + ", pat_updtd_dt=" + pat_updtd_dt + ", pat_updtd_by=" + pat_updtd_by
				+ ", pat_status=" + pat_status + ", blood_grp_id=" + blood_grp_id + ", org_id=" + org_id + ", ref_id="
				+ ref_id + ", nationality_id=" + nationality_id + ", religion_id=" + religion_id
				+ ", passport_nationalityid=" + passport_nationalityid + ", martl_status_id=" + martl_status_id
				+ ", casepaperEntity=" + casepaperEntity + ", bloodGroupEntity=" + bloodGroupEntity
				+ ", religionMasterEntity=" + religionMasterEntity + ", raReasonMasterEntity=" + raReasonMasterEntity
				+ ", nationalityMasterEntity=" + nationalityMasterEntity + ", genderDetailsEntity="
				+ genderDetailsEntity + ", maritalStatusEntity=" + maritalStatusEntity + ", titleMasterEntity="
				+ titleMasterEntity + ", referralMaster=" + referralMaster + "]";
	}

	public void setPatient_master_id(long patient_master_id) {
		this.patient_master_id = patient_master_id;
	}

	public long getArea_id() {
		return area_id;
	}

	public void setArea_id(long area_id) {
		this.area_id = area_id;
	}

	public long getPref_lang_id() {
		return pref_lang_id;
	}

	public void setPref_lang_id(long pref_lang_id) {
		this.pref_lang_id = pref_lang_id;
	}

	public LanguageMasterEntity getLanguageMasterEntity() {
		return languageMasterEntity;
	}

	public void setLanguageMasterEntity(LanguageMasterEntity languageMasterEntity) {
		this.languageMasterEntity = languageMasterEntity;
	}

	
	

	
}
