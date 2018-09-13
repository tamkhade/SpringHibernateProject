package com.healthcare.converter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import com.healthcare.dto.ConsultantViewFormModel;
import com.healthcare.entities.ConsultantDetailMasterEntity;
import com.healthcare.entities.ConsultantFeesMasterEntity;
import com.healthcare.entities.ConsultantTypeMasterEntity;
import com.healthcare.entities.DegreeMasterEntity;

import com.healthcare.entities.OrgnizationUserMasterEntity;
import com.healthcare.entities.ServiceMasterEntity;

public class ConsultantViewConverter 
{
	public static List<ConsultantViewFormModel>  convertEmployeeToEntity(List<OrgnizationUserMasterEntity> orgnizationUserMasterEntities) 
	{
		List<ConsultantViewFormModel> consultantViewFormModels =new ArrayList<ConsultantViewFormModel>();
		
		for(OrgnizationUserMasterEntity orgnizationUserMasterEntity : orgnizationUserMasterEntities)
		{
			ConsultantViewFormModel consultantViewFormModel = new ConsultantViewFormModel();
			consultantViewFormModel.setUser_id(orgnizationUserMasterEntity.getOrg_user_id());
			consultantViewFormModel.setUser_fullnm(orgnizationUserMasterEntity.getUser_fullnm());
			
			SimpleDateFormat newFormat = new SimpleDateFormat("dd-MM-yyyy");
			
			String dob = newFormat.format(orgnizationUserMasterEntity.getUser_dob());
			consultantViewFormModel.setDob(dob);
			
			String doj = newFormat.format(orgnizationUserMasterEntity.getUser_doj());
			consultantViewFormModel.setDoj(doj);
			
			consultantViewFormModel.setMobile_no(orgnizationUserMasterEntity.getUser_alt_mob_no());
			
			
			DegreeMasterEntity degreeMasterEntity = orgnizationUserMasterEntity.getDegreeMasterEntity();
			
			consultantViewFormModel.setDegree_type(degreeMasterEntity.getDegree_nm());
			
			
			Set<ConsultantDetailMasterEntity> consultantDetailMasterEntities = orgnizationUserMasterEntity.getConsultantDetailMasterEntities();
			
			for(ConsultantDetailMasterEntity consultantDetailMasterEntity : consultantDetailMasterEntities)
			{
				System.out.println("reg no" + consultantDetailMasterEntity.getConsult_reg_no());
				consultantViewFormModel.setConsult_reg_no(consultantDetailMasterEntity.getConsult_reg_no());
				
				
				ConsultantTypeMasterEntity consultantTypeMasterEntity  = consultantDetailMasterEntity.getConsultantTypeMasterEntity();
				consultantViewFormModel.setConsult_type(consultantTypeMasterEntity.getConsult_type());
				
				Set<ConsultantFeesMasterEntity> consultantFeesMasterEntities = consultantDetailMasterEntity.getConsultantFeesMasterEntities();
				
				for(ConsultantFeesMasterEntity consultantFeesMasterEntity : consultantFeesMasterEntities)
				{
					
					consultantViewFormModel.setConsult_newcase_fee_amount(consultantFeesMasterEntity.getFees_amount());
					
					ServiceMasterEntity serviceMasterEntity = consultantFeesMasterEntity.getServiceMasterEntity();
					
					consultantViewFormModel.setServiceName(serviceMasterEntity.getService_name());
				}
			}
			
			consultantViewFormModels.add(consultantViewFormModel);
		}
		return consultantViewFormModels;	
	}
}
