package com.healthcare.converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.healthcare.dto.EmployeeMasterFormModel;
import com.healthcare.dto.EmployeeViewFormModel;
import com.healthcare.entities.EmployeeDetailMasterEntity;
import com.healthcare.entities.OrgnizationUserMasterEntity;
import com.healthcare.entities.UserAddressMasterEntity;
import com.healthcare.entities.UserBankDetailMaster;
import com.healthcare.entities.UserCredentialsEntity;
import com.healthcare.entities.UserDocuementDetailsMasterEntity;

public class EmployeeMasterFormConverter 
{
	public static OrgnizationUserMasterEntity  convertEmployeeFormToEntity(EmployeeMasterFormModel employeeMasterFormModel) throws ParseException
	{
		OrgnizationUserMasterEntity orgnizationUserMasterEntity = new OrgnizationUserMasterEntity();
		orgnizationUserMasterEntity.setUser_fnm(employeeMasterFormModel.getFirst_nm());
		orgnizationUserMasterEntity.setUser_mnm(employeeMasterFormModel.getMiddle_nm());
		orgnizationUserMasterEntity.setUser_lnm(employeeMasterFormModel.getLast_nm());
		
		//concatinating full nm
		String fullnm = employeeMasterFormModel.getFirst_nm() + " " 
		+ employeeMasterFormModel.getMiddle_nm() + " " 
		+ employeeMasterFormModel.getLast_nm();
		
		orgnizationUserMasterEntity.setUser_fullnm(fullnm);
		
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-DD");
		
		String modelStringDob = employeeMasterFormModel.getDOB();
		Date entityDateDob = (Date)formatter.parse(modelStringDob);
	
		orgnizationUserMasterEntity.setUser_dob(entityDateDob);
		
		String modelStringDoj = employeeMasterFormModel.getDOB();
	
		Date entityDateDoj = (Date)formatter.parse(modelStringDoj); 
		
		orgnizationUserMasterEntity.setUser_doj(entityDateDoj);
		
		orgnizationUserMasterEntity.setUser_age(20);
		orgnizationUserMasterEntity.setUser_mob_no(employeeMasterFormModel.getMoblie_no());
		orgnizationUserMasterEntity.setUser_alt_mob_no(employeeMasterFormModel.getAlt_mob_no());
		
		for (CommonsMultipartFile file : employeeMasterFormModel.getEmp_photo()) 
		{
			orgnizationUserMasterEntity.setUser_img(file.getBytes());
		}
		
		
		orgnizationUserMasterEntity.setUser_crtd_dt(new Date());
		orgnizationUserMasterEntity.setUser_created_by(1);
		
		orgnizationUserMasterEntity.setUser_updtd_dt(new Date());
		orgnizationUserMasterEntity.setUser_updated_by(1);
		
		// user type 1 for Employee & 2 for Consultant
		orgnizationUserMasterEntity.setUser_type_id(1);
		
		orgnizationUserMasterEntity.setDegree_id(1);
		
		orgnizationUserMasterEntity.setGender_id(1);
		
		orgnizationUserMasterEntity.setTitle_id(1);
		
		
		Set<UserAddressMasterEntity> userAddressMasterEntities = new HashSet<UserAddressMasterEntity>();
		
		UserAddressMasterEntity userAddressMasterEntity = new UserAddressMasterEntity();
		userAddressMasterEntity.setArea_id(employeeMasterFormModel.getArea_id());
		userAddressMasterEntity.setUser_add_landmark(employeeMasterFormModel.getLandmark());
		userAddressMasterEntity.setUser_address(employeeMasterFormModel.getAddress());
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
		
		UserCredentialsEntity userCredentialsEntity =  new UserCredentialsEntity();
		userCredentialsEntity.setUsername(employeeMasterFormModel.getUser_name());
		userCredentialsEntity.setPasswrd(employeeMasterFormModel.getUser_password());
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
		userDocuementDetailsMasterEntityPan.setUser_doc_no(employeeMasterFormModel.getPan_no());
		
		for (CommonsMultipartFile file : employeeMasterFormModel.getPan_doc_image()) 
		{
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
		userDocuementDetailsMasterEntityAadhar.setUser_doc_no(employeeMasterFormModel.getAadhar_no());
		for (CommonsMultipartFile file : employeeMasterFormModel.getAadhar_doc_image()) 
		{
			userDocuementDetailsMasterEntityAadhar.setUser_doc_img(file.getBytes());
		}
		
		userDocuementDetailsMasterEntityAadhar.setUser_doc_crtd_by(1);
		userDocuementDetailsMasterEntityAadhar.setUser_doc_crtd_dt(new Date());
		userDocuementDetailsMasterEntityAadhar.setUser_doc_updt_by(1);
		userDocuementDetailsMasterEntityAadhar.setUser_doc_updt_date(new Date());
		userDocuementDetailsMasterEntityAadhar.setUser_doc_status('A');
		userDocuementDetailsMasterEntityAadhar.setOrgnizationUserMasterEntity(orgnizationUserMasterEntity);
		
		userDocuementDetailsMasterEntities.add(userDocuementDetailsMasterEntityAadhar);
		
		Set<EmployeeDetailMasterEntity> employeeDetailMasterEntities = new HashSet<EmployeeDetailMasterEntity>();
		
		EmployeeDetailMasterEntity employeeDetailMasterEntity = new EmployeeDetailMasterEntity();
		employeeDetailMasterEntity.setEmp_type_id(employeeMasterFormModel.getEmp_type_id());
		employeeDetailMasterEntity.setEmp_mst_crtd_by(1);
		employeeDetailMasterEntity.setEmp_mst_crtd_dt(new Date());
		employeeDetailMasterEntity.setEmp_mst_updt_by(1);
		employeeDetailMasterEntity.setEmp_mst_updt_dt(new Date());
		employeeDetailMasterEntity.setEmp_dtl_status('A');
		
		employeeDetailMasterEntity.setOrgnizationUserMasterEntity(orgnizationUserMasterEntity);
		
		employeeDetailMasterEntities.add(employeeDetailMasterEntity);
		
		
		
		orgnizationUserMasterEntity.setEmployeeDetailMasterEntities(employeeDetailMasterEntities);
		orgnizationUserMasterEntity.setUserDocuementDetailsMasters(userDocuementDetailsMasterEntities);
		orgnizationUserMasterEntity.setUserCredentialsEntities(userCredentialsEntities);
		orgnizationUserMasterEntity.setUserBankDetailMasters(userBankDetailMasters);
		orgnizationUserMasterEntity.setUserAddressMasterEntities(userAddressMasterEntities);
		
		return orgnizationUserMasterEntity;		
	}
}
