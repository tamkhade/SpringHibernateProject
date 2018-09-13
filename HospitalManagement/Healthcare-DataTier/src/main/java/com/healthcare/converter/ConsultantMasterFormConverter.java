package com.healthcare.converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.healthcare.dto.ConsultantMasterFormModel;
import com.healthcare.entities.ConsultantDetailMasterEntity;
import com.healthcare.entities.ConsultantFeesMasterEntity;
import com.healthcare.entities.OrgnizationUserMasterEntity;
import com.healthcare.entities.UserAddressMasterEntity;
import com.healthcare.entities.UserBankDetailMaster;
import com.healthcare.entities.UserCredentialsEntity;
import com.healthcare.entities.UserDocuementDetailsMasterEntity;

public class ConsultantMasterFormConverter 
{
	public static OrgnizationUserMasterEntity convertConsultantMasterFormToEntity(
		ConsultantMasterFormModel consultantMasterFormModel) throws ParseException 
	{
		OrgnizationUserMasterEntity orgnizationUserMasterEntity = new OrgnizationUserMasterEntity();
		orgnizationUserMasterEntity.setUser_fnm(consultantMasterFormModel.getFirst_nm());
		orgnizationUserMasterEntity.setUser_mnm(consultantMasterFormModel.getMiddle_nm());
		orgnizationUserMasterEntity.setUser_lnm(consultantMasterFormModel.getLast_nm());

		// concatinating full nm
		String fullnm = consultantMasterFormModel.getFirst_nm() + " " + consultantMasterFormModel.getMiddle_nm() + " "
				+ consultantMasterFormModel.getLast_nm();

		orgnizationUserMasterEntity.setUser_fullnm(fullnm);

		DateFormat formatter = new SimpleDateFormat("yyyy-MM-DD");

		String modelStringDob = consultantMasterFormModel.getDOB();
		Date entityDateDob = (Date) formatter.parse(modelStringDob);

		orgnizationUserMasterEntity.setUser_dob(entityDateDob);

		String modelStringDoj = consultantMasterFormModel.getDOB();

		Date entityDateDoj = (Date) formatter.parse(modelStringDoj);

		orgnizationUserMasterEntity.setUser_doj(entityDateDoj);

		orgnizationUserMasterEntity.setUser_age(20);
		orgnizationUserMasterEntity.setUser_mob_no(consultantMasterFormModel.getMoblie_no());
		orgnizationUserMasterEntity.setUser_alt_mob_no(consultantMasterFormModel.getAlt_mob_no());

		for (CommonsMultipartFile file : consultantMasterFormModel.getEmp_photo()) {
			orgnizationUserMasterEntity.setUser_img(file.getBytes());
		}

		orgnizationUserMasterEntity.setUser_crtd_dt(new Date());
		orgnizationUserMasterEntity.setUser_created_by(1);

		orgnizationUserMasterEntity.setUser_updtd_dt(new Date());
		orgnizationUserMasterEntity.setUser_updated_by(1);

		// user type 1 for Employee & 2 for Consultant
		orgnizationUserMasterEntity.setUser_type_id(2);

		orgnizationUserMasterEntity.setDegree_id(consultantMasterFormModel.getDegree_id());

		orgnizationUserMasterEntity.setGender_id(consultantMasterFormModel.getGender_id());

		orgnizationUserMasterEntity.setTitle_id(consultantMasterFormModel.getGender_id());

		Set<UserAddressMasterEntity> userAddressMasterEntities = new HashSet<UserAddressMasterEntity>();

		UserAddressMasterEntity userAddressMasterEntity = new UserAddressMasterEntity();
		userAddressMasterEntity.setArea_id(consultantMasterFormModel.getArea_id());
		userAddressMasterEntity.setUser_add_landmark(consultantMasterFormModel.getLandmark());
		userAddressMasterEntity.setUser_address(consultantMasterFormModel.getAddress());
		userAddressMasterEntity.setUser_add_crtd_dt(new Date());
		userAddressMasterEntity.setUser_add_crtd_by(1);
		userAddressMasterEntity.setUser_add_updt_dt(new Date());
		userAddressMasterEntity.setUser_add_updt_by(1);
		userAddressMasterEntity.setUser_add_status('A');
		userAddressMasterEntity.setOrgnizationUserMasterEntity(orgnizationUserMasterEntity);

		userAddressMasterEntities.add(userAddressMasterEntity);

		Set<UserBankDetailMaster> userBankDetailMasters = new HashSet<UserBankDetailMaster>();

		UserBankDetailMaster userBankDetailMaster = new UserBankDetailMaster();
		userBankDetailMaster.setBnk_ac_no("11222");
		userBankDetailMaster.setBnk_acc_type_id(1);
		userBankDetailMaster.setBnk_brnch_id(1);
		userBankDetailMaster.setBnk_id(1);
		userBankDetailMaster.setUser_bnk_crtd_by(1);
		userBankDetailMaster.setUser_bnk_crtd_dt(new Date());
		userBankDetailMaster.setUser_bnk_updt_by(1);
		userBankDetailMaster.setUser_bnk_updt_dt(new Date());
		userBankDetailMaster.setUser_bnk_status('A');
		userBankDetailMaster.setOrgnizationUserMasterEntity(orgnizationUserMasterEntity);

		userBankDetailMasters.add(userBankDetailMaster);

		Set<UserCredentialsEntity> userCredentialsEntities = new HashSet<UserCredentialsEntity>();

		UserCredentialsEntity userCredentialsEntity = new UserCredentialsEntity();
		userCredentialsEntity.setUsername(consultantMasterFormModel.getUser_name());
		userCredentialsEntity.setPasswrd(consultantMasterFormModel.getUser_password());
		userCredentialsEntity.setLogged_in_sts(0);
		userCredentialsEntity.setCred_crtd_dt(new Date());
		userCredentialsEntity.setCred_created_by(1);
		userCredentialsEntity.setCred_updtd_dt(new Date());
		userCredentialsEntity.setCred_updated_by(1);
		userCredentialsEntity.setCred_sts('A');
		userCredentialsEntity.setOrgnizationUserMasterEntity(orgnizationUserMasterEntity);

		userCredentialsEntities.add(userCredentialsEntity);

		Set<UserDocuementDetailsMasterEntity> userDocuementDetailsMasterEntities = new HashSet<UserDocuementDetailsMasterEntity>();

		UserDocuementDetailsMasterEntity userDocuementDetailsMasterEntityPan = new UserDocuementDetailsMasterEntity();
		userDocuementDetailsMasterEntityPan.setDoc_type_id(1);
		userDocuementDetailsMasterEntityPan.setUser_doc_no(consultantMasterFormModel.getPan_no());

		for (CommonsMultipartFile file : consultantMasterFormModel.getPan_doc_image()) {
			userDocuementDetailsMasterEntityPan.setUser_doc_img(file.getBytes());
		}

		userDocuementDetailsMasterEntityPan.setUser_doc_crtd_by(1);
		userDocuementDetailsMasterEntityPan.setUser_doc_crtd_dt(new Date());
		userDocuementDetailsMasterEntityPan.setUser_doc_updt_by(1);
		userDocuementDetailsMasterEntityPan.setUser_doc_updt_date(new Date());
		userDocuementDetailsMasterEntityPan.setUser_doc_status('A');
		userDocuementDetailsMasterEntityPan.setOrgnizationUserMasterEntity(orgnizationUserMasterEntity);

		userDocuementDetailsMasterEntities.add(userDocuementDetailsMasterEntityPan);

		UserDocuementDetailsMasterEntity userDocuementDetailsMasterEntityAadhar = new UserDocuementDetailsMasterEntity();
		userDocuementDetailsMasterEntityAadhar.setDoc_type_id(2);
		userDocuementDetailsMasterEntityAadhar.setUser_doc_no(consultantMasterFormModel.getAadhar_no());
		for (CommonsMultipartFile file : consultantMasterFormModel.getAadhar_doc_image()) {
			userDocuementDetailsMasterEntityAadhar.setUser_doc_img(file.getBytes());
		}

		userDocuementDetailsMasterEntityAadhar.setUser_doc_crtd_by(1);
		userDocuementDetailsMasterEntityAadhar.setUser_doc_crtd_dt(new Date());
		userDocuementDetailsMasterEntityAadhar.setUser_doc_updt_by(1);
		userDocuementDetailsMasterEntityAadhar.setUser_doc_updt_date(new Date());
		userDocuementDetailsMasterEntityAadhar.setUser_doc_status('A');
		userDocuementDetailsMasterEntityAadhar.setOrgnizationUserMasterEntity(orgnizationUserMasterEntity);

		userDocuementDetailsMasterEntities.add(userDocuementDetailsMasterEntityAadhar);

		// to add fees of consultant
		Set<ConsultantFeesMasterEntity> consultantFeesMasterEntities = new HashSet<ConsultantFeesMasterEntity>();

		// to set new Casepaper fees
		ConsultantFeesMasterEntity consultantFeesMasterEntityNewCasePaper = new ConsultantFeesMasterEntity();
		consultantFeesMasterEntityNewCasePaper.setFees_amount(consultantMasterFormModel.getNew_case_fees());
		consultantFeesMasterEntityNewCasePaper.setNo_dys_to_revisit(consultantMasterFormModel.getDays_for_revisited());

		// service 1 for new case paper fees & 2 for revisited fees
		consultantFeesMasterEntityNewCasePaper.setService_id(1);
		consultantFeesMasterEntityNewCasePaper.setConsult_fee_crtd_by(1);
		consultantFeesMasterEntityNewCasePaper.setConsult_fee_crtd_dt(new Date());
		consultantFeesMasterEntityNewCasePaper.setConsult_fee_updtd_by(2);
		consultantFeesMasterEntityNewCasePaper.setConsult_fee_updtd_dt(new Date());
		consultantFeesMasterEntityNewCasePaper.setConsult_fee_status('A');

		consultantFeesMasterEntities.add(consultantFeesMasterEntityNewCasePaper);

		// to set revisted fees
		ConsultantFeesMasterEntity consultantFeesMasterEntityRevisitedFees = new ConsultantFeesMasterEntity();
		consultantFeesMasterEntityRevisitedFees.setFees_amount(consultantMasterFormModel.getRevisited_fees());
		consultantFeesMasterEntityRevisitedFees.setNo_dys_to_revisit(consultantMasterFormModel.getDays_for_revisited());

		// service 1 for new case paper fees & 2 for revisited fees
		consultantFeesMasterEntityRevisitedFees.setService_id(2);
		consultantFeesMasterEntityRevisitedFees.setConsult_fee_crtd_by(1);
		consultantFeesMasterEntityRevisitedFees.setConsult_fee_crtd_dt(new Date());
		consultantFeesMasterEntityRevisitedFees.setConsult_fee_updtd_by(2);
		consultantFeesMasterEntityRevisitedFees.setConsult_fee_updtd_dt(new Date());
		consultantFeesMasterEntityRevisitedFees.setConsult_fee_status('A');

		consultantFeesMasterEntities.add(consultantFeesMasterEntityRevisitedFees);

		// to add consultant details
		Set<ConsultantDetailMasterEntity> consultantDetailMasterEntities = new HashSet<ConsultantDetailMasterEntity>();

		ConsultantDetailMasterEntity consultantDetailMasterEntity = new ConsultantDetailMasterEntity();
		consultantDetailMasterEntity.setConsult_reg_no(consultantMasterFormModel.getConult_reg_no());
		consultantDetailMasterEntity.setConsult_type_id(consultantMasterFormModel.getConsult_type_id());
		consultantDetailMasterEntity.setDep_id(consultantMasterFormModel.getDep_id());
		consultantDetailMasterEntity.setConsult_crtd_by(1);
		consultantDetailMasterEntity.setConsult_crtd_dt(new Date());
		consultantDetailMasterEntity.setConsult_updtd_by(1);
		consultantDetailMasterEntity.setConsult_updtd_dt(new Date());
		consultantDetailMasterEntity.setConsult_dtl_status('A');
		
		// to set new case paper fees & revisited fees specific consultant details
		consultantDetailMasterEntity.setConsultantFeesMasterEntities(consultantFeesMasterEntities);
		
		//to set user
		consultantDetailMasterEntity.setOrgnizationUserMasterEntity(orgnizationUserMasterEntity);
		
		
		consultantDetailMasterEntities.add(consultantDetailMasterEntity);

		
		orgnizationUserMasterEntity.setConsultantDetailMasterEntities(consultantDetailMasterEntities);
		orgnizationUserMasterEntity.setUserDocuementDetailsMasters(userDocuementDetailsMasterEntities);
		orgnizationUserMasterEntity.setUserCredentialsEntities(userCredentialsEntities);
		orgnizationUserMasterEntity.setUserBankDetailMasters(userBankDetailMasters);
		orgnizationUserMasterEntity.setUserAddressMasterEntities(userAddressMasterEntities);

		return orgnizationUserMasterEntity;
	}
}
