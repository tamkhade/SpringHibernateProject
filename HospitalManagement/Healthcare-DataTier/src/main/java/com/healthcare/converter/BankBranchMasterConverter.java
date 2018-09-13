package com.healthcare.converter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.healthcare.dto.BankBranchMasterFormModel;
import com.healthcare.entities.BankBranchMasterEntity;

public class BankBranchMasterConverter {

	public static BankBranchMasterEntity bankBranchMasterFormToEntity(BankBranchMasterFormModel bankBranchMasterFormModel)
	{
		BankBranchMasterEntity bankBranchMasterEntity=new BankBranchMasterEntity();
		bankBranchMasterEntity.setBnk_brnch_id(bankBranchMasterFormModel.getBnk_brnch_id());
		bankBranchMasterEntity.setArea_id(bankBranchMasterFormModel.getArea_id());
		bankBranchMasterEntity.setIfsc_cd(bankBranchMasterFormModel.getIfsc_cd());
		bankBranchMasterEntity.setMicr_cd(bankBranchMasterFormModel.getMicr_cd());
		bankBranchMasterEntity.setBnk_brnch_add(bankBranchMasterFormModel.getBnk_brnch_add());
		bankBranchMasterEntity.setCreated_by(11);
		bankBranchMasterEntity.setCreatd_dt(new Date());
		bankBranchMasterEntity.setUpdated_by(11);
		bankBranchMasterEntity.setUpdated_dt(new Date());
		bankBranchMasterEntity.setBnk_brnch_status('A');
		bankBranchMasterEntity.setBnk_id(bankBranchMasterFormModel.getBnk_id());		
		return bankBranchMasterEntity;
	}
	
	public static BankBranchMasterFormModel bankBranchMasterEntityToForm(BankBranchMasterEntity bankBranchMasterEntity)
	{
		BankBranchMasterFormModel bankBranchMasterFormModel=new BankBranchMasterFormModel();
		bankBranchMasterFormModel.setBnk_brnch_id(bankBranchMasterEntity.getBnk_brnch_id());
		bankBranchMasterFormModel.setArea_id(bankBranchMasterEntity.getArea_id());
		bankBranchMasterFormModel.setIfsc_cd(bankBranchMasterEntity.getIfsc_cd());
		
		bankBranchMasterFormModel.setMicr_cd(bankBranchMasterEntity.getMicr_cd());
		bankBranchMasterFormModel.setBnk_brnch_add(bankBranchMasterEntity.getBnk_brnch_add());
		bankBranchMasterFormModel.setBnk_id(bankBranchMasterEntity.getBnk_id());
		return bankBranchMasterFormModel;
	}
	
	public static List<BankBranchMasterFormModel> bankBranchMasterEntityToFormList(List<BankBranchMasterEntity> bankBranchMasterEntities)
	{
		List<BankBranchMasterFormModel> bankBranchMasterFormModels=new ArrayList<BankBranchMasterFormModel>();
		for(BankBranchMasterEntity bankBranchMasterEntity:bankBranchMasterEntities)
		{
			
		BankBranchMasterFormModel bankBranchMasterFormModel=new BankBranchMasterFormModel();
		bankBranchMasterFormModel.setBnk_brnch_id(bankBranchMasterEntity.getBnk_brnch_id());
		bankBranchMasterFormModel.setArea_id(bankBranchMasterEntity.getArea_id());
		bankBranchMasterFormModel.setIfsc_cd(bankBranchMasterEntity.getIfsc_cd());
		bankBranchMasterFormModel.setMicr_cd(bankBranchMasterEntity.getMicr_cd());
		bankBranchMasterFormModel.setBnk_brnch_add(bankBranchMasterEntity.getBnk_brnch_add());
		bankBranchMasterFormModel.setBnk_id(bankBranchMasterEntity.getBnk_id());
		bankBranchMasterFormModels.add(bankBranchMasterFormModel);
		}
		return bankBranchMasterFormModels;
	}
}
