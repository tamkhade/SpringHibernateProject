package com.healthcare.converter;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.healthcare.dto.ReceptionFormModel;
import com.healthcare.entities.BloodGroupEntity;
import com.healthcare.entities.CasePaperEntity;

import com.healthcare.entities.GenderDetailsEntity;
import com.healthcare.entities.MaritalStatusEntity;
import com.healthcare.entities.NationalityMasterEntity;
import com.healthcare.entities.PatientMasterEntity;
import com.healthcare.entities.ReasonMasterEntity;
import com.healthcare.entities.ReferralMaster;
import com.healthcare.entities.ReligionMasterEntity;
import com.healthcare.entities.TitleMasterEntity;


public class ReceptionModuleConverter {

	public static PatientMasterEntity PatientformtoEntity(ReceptionFormModel receptionFormModel) throws ParseException {

		PatientMasterEntity patientMasterEntity = new PatientMasterEntity();
		
		patientMasterEntity.setPatient_master_id(receptionFormModel.getPatient_master_id());
		
		patientMasterEntity.setPatient_fname(receptionFormModel.getPatient_first_Name());
	
		patientMasterEntity.setPatient_mname(receptionFormModel.getPatient_middle_Name());

		patientMasterEntity.setPatient_lname(receptionFormModel.getPatient_last_Namel());
		patientMasterEntity.setPatient_fullname(receptionFormModel.getPatient_first_Name() + " " + receptionFormModel.getPatient_middle_Name()
				+ " " + receptionFormModel.getPatient_last_Namel());
		patientMasterEntity.setPat_add_dtl(receptionFormModel.getPatient_address());
	
		patientMasterEntity.setPat_admi_dt(new Date());
		patientMasterEntity.setPat_admi_tm(new Date());
		
/*	for (CommonsMultipartFile r : receptionFormModel.getPatientphoto()) {
			patientMasterEntity.setPatientphoto(r.getBytes());
	}
	*/	
		patientMasterEntity.setPat_age(receptionFormModel.getPat_age());
		
		
		patientMasterEntity.setPat_alt_mob_no(receptionFormModel.getPatient_alt_Contno());
		
	
		patientMasterEntity.setPat_mob_no(receptionFormModel.getPatient_Contno());
		
		patientMasterEntity.setPat_remark(receptionFormModel.getPat_remark());
		
		patientMasterEntity.setPat_email(receptionFormModel.getEmail_id());
	
		patientMasterEntity.setAdd_landmark(receptionFormModel.getLandmark());
	   patientMasterEntity.setPassport_nationalityid(receptionFormModel.getPassport_nationalityid());
	
		
	    DateFormat formatter = new SimpleDateFormat("yyyy-MM-DD");
		String modelStringDob = receptionFormModel.getDob();;
		Date entityDateDob = (Date) formatter.parse(modelStringDob);
		
		patientMasterEntity.setPat_dob(entityDateDob);
		  
        patientMasterEntity.setTitle_id(receptionFormModel.getTitle_id());
 	   
        patientMasterEntity.setRef_id(receptionFormModel.getReferaldr_id());
 	   
	
		patientMasterEntity.setPat_status('a');
		patientMasterEntity.setPat_crtd_dt(new Date());
		patientMasterEntity.setPat_crtd_by(1);
		patientMasterEntity.setPat_updtd_dt(new Date());
		patientMasterEntity.setPat_updtd_by(1);
		
		patientMasterEntity.setBlood_grp_id(receptionFormModel.getBloodgroup_id());
		  	   
        patientMasterEntity.setGender_id(receptionFormModel.getGender_id());
 	  
        patientMasterEntity.setMartl_status_id(receptionFormModel.getMaritalStatus_id());
 	    
        patientMasterEntity.setNationality_id(receptionFormModel.getNationality_id());
 	 
        patientMasterEntity.setPref_lang_id(receptionFormModel.getLanguage_id());
 	   
    	patientMasterEntity.setPincode_id(receptionFormModel.getPincode_id());
    	
    	patientMasterEntity.setArea_id(receptionFormModel.getAreaid());
 	   
    	patientMasterEntity.setReligion_id(receptionFormModel.getReligion_id());
 	  
    	patientMasterEntity.setReason_mst_id(receptionFormModel.getPatientreason_id());
 	   
  
		CasePaperEntity casePaperEntity = new CasePaperEntity();
		Set<CasePaperEntity> casePaperEntitieslist=new HashSet<CasePaperEntity>();		
		casePaperEntity.setFollowup_date(new Date());
		casePaperEntity.setPat_bp(1L);
		casePaperEntity.setPat_pulse(1L);
		casePaperEntity.setPatient_height(receptionFormModel.getHeight());
		casePaperEntity.setPatient_weight(receptionFormModel.getWeight());
		casePaperEntity.setVisting_date(new Date());
		casePaperEntity.setPatient_master(patientMasterEntity);
		casePaperEntitieslist.add(casePaperEntity);
		patientMasterEntity.setCasepaperEntity(casePaperEntitieslist);
		return patientMasterEntity;
}
	
	
	public static Set<ReceptionFormModel> patiententitytoform(Set<PatientMasterEntity> patientMasterEntities)
	{
		
		Set<ReceptionFormModel> receptionFormModelslist=new HashSet<ReceptionFormModel>();
		for(PatientMasterEntity p:patientMasterEntities){
	     
			ReceptionFormModel receptionFormModel=new ReceptionFormModel();
			
			receptionFormModel.setPatient_fullname(p.getPatient_fullname());
			receptionFormModel.setPatient_master_id(p.getPatient_master_id());
			receptionFormModel.setPatient_Contno(p.getPat_mob_no());
			receptionFormModel.setGender_id(p.getGender_id());
			receptionFormModel.setPatient_address(p.getPat_add_dtl());
			
			/*byte[] file=p.getPatientphoto();
		
			 InputStream in1 = new ByteArrayInputStream(file);
			CommonsMultipartFile commonsMultipartFile;
			commonsMultipartFile.transferTo(in1);*/
		
			
			DateFormat formatter = new SimpleDateFormat("yyyy-MM-DD");
			Date modelStringDob = p.getPat_dob();
			String entityDateDob = formatter.format(modelStringDob);
			receptionFormModel.setDob(entityDateDob);
			receptionFormModelslist.add(receptionFormModel);	
		}
			
		return receptionFormModelslist;
	
	}
	
	    public static ReceptionFormModel particularpatiententitytoform(PatientMasterEntity patientMasterEntities) {
	    	ReceptionFormModel receptionFormModel = new ReceptionFormModel();

			receptionFormModel.setPatient_fullname(patientMasterEntities.getPatient_fullname());
			receptionFormModel.setPatient_master_id(patientMasterEntities.getPatient_master_id());
			receptionFormModel.setPatient_Contno(patientMasterEntities.getPat_mob_no());
			//receptionFormModel.setDob(entityDateDob);
			receptionFormModel.setPatient_first_Name(patientMasterEntities.getPatient_fname());
		    receptionFormModel.setPatient_middle_Name(patientMasterEntities.getPatient_mname());
		    receptionFormModel.setPatient_last_Namel(patientMasterEntities.getPatient_lname());
		    receptionFormModel.setPat_age(patientMasterEntities.getPat_age());
		    receptionFormModel.setPatient_Contno(patientMasterEntities.getPat_alt_mob_no());
		    receptionFormModel.setPatient_alt_Contno(patientMasterEntities.getPat_alt_mob_no());
		    receptionFormModel.setEmail_id(patientMasterEntities.getPat_email());
		    receptionFormModel.setPassport_nationalityid(patientMasterEntities.getPassport_nationalityid());
		    receptionFormModel.setPatient_address(patientMasterEntities.getPat_add_dtl());
	    
		    BloodGroupEntity bloodGroupEntity=patientMasterEntities.getBloodGroupEntity();
			receptionFormModel.setBloodgroup_id(bloodGroupEntity.getBlood_grp_id());
			GenderDetailsEntity genderDetailsEntity =patientMasterEntities.getGenderDetailsEntity();
			receptionFormModel.setGender_id(genderDetailsEntity.getGender_id());
			
		
			MaritalStatusEntity maritalStatusEntity =patientMasterEntities.getMaritalStatusEntity();
			receptionFormModel.setMaritalStatus_id(maritalStatusEntity.getMartial_status_id());
			TitleMasterEntity titleMasterEntity = patientMasterEntities.getTitleMasterEntity();
			receptionFormModel.setTitle_id(titleMasterEntity.getTitle_id());

			ReferralMaster referralMaster = patientMasterEntities.getReferralMaster();
			receptionFormModel.setReferaldr_id(referralMaster.getRef_id());
			
			ReasonMasterEntity reasonMasterEntity=patientMasterEntities.getRaReasonMasterEntity();
			receptionFormModel.setPatientreason_id(reasonMasterEntity.getReason_type_id());
			    
			NationalityMasterEntity nationalityMasterEntity=patientMasterEntities.getNationalityMasterEntity();
			receptionFormModel.setNationality_id(nationalityMasterEntity.getNationality_id());
		
			
			ReligionMasterEntity religionMasterEntity=patientMasterEntities.getReligionMasterEntity();
			receptionFormModel.setReligion_id(religionMasterEntity.getReligion_id());

		    for(CasePaperEntity casePaperEntity : patientMasterEntities.getCasepaperEntity()){
		    
		     receptionFormModel.setHeight(casePaperEntity.getPatient_height());
            receptionFormModel.setWeight(casePaperEntity.getPatient_weight());	
            receptionFormModel.setCasepaer_id(casePaperEntity.getCase_paper_id());
		    }
			
		       return receptionFormModel;

	}


	    
	    public static Set<ReceptionFormModel> patientfullentitytoform(Set<PatientMasterEntity> patientMasterEntities)
		{
			
			Set<ReceptionFormModel> receptionFormModelslist=new HashSet<ReceptionFormModel>();
			for(PatientMasterEntity p:patientMasterEntities){
		     
				ReceptionFormModel receptionFormModel=new ReceptionFormModel();
				
				receptionFormModel.setPatient_fullname(p.getPatient_fullname());
	
	           System.out.println("hiiii"+p.getPatient_fullname());
	           receptionFormModelslist.add(receptionFormModel);
	
}
			return receptionFormModelslist;
		}
}