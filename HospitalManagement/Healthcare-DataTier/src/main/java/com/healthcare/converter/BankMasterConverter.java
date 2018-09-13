package com.healthcare.converter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.healthcare.dto.BankMasterFormModel;
import com.healthcare.entities.BankMasterEntity;

public class BankMasterConverter {

	public static BankMasterEntity bankMasterFormToEntity(BankMasterFormModel bankMasterFormModel)
	{
		
		BankMasterEntity bankMasterEntity=new BankMasterEntity();
		bankMasterEntity.setBnk_id(bankMasterFormModel.getBnk_id());
		bankMasterEntity.setBnk_name(bankMasterFormModel.getBnk_name());
		bankMasterEntity.setBnk_crtd_by(1);
		bankMasterEntity.setBnk_crtd_dt(new Date());
		bankMasterEntity.setBnk_updtd_by(1);
		bankMasterEntity.setBnk_updtd_dt(new Date());
		bankMasterEntity.setBnk_status('A');
		return bankMasterEntity;
		
	}
	
	public static BankMasterFormModel bankMasterEntityToForm(BankMasterEntity bankMasterEntity)
	{
		BankMasterFormModel bankMasterFormModel=new BankMasterFormModel();
		bankMasterFormModel.setBnk_id(bankMasterEntity.getBnk_id());
		bankMasterFormModel.setBnk_name(bankMasterEntity.getBnk_name());
		return bankMasterFormModel;
		
	}
	
	public static List<BankMasterFormModel> bankMasterEntityToFormList(List<BankMasterEntity> bankMasterEntities)
	{
		List<BankMasterFormModel>bankMasterFormModels=new ArrayList<BankMasterFormModel>();
		for(BankMasterEntity bankMasterEntity:bankMasterEntities)
		{
		BankMasterFormModel bankMasterFormModel=new BankMasterFormModel();
		bankMasterFormModel.setBnk_id(bankMasterEntity.getBnk_id());
		bankMasterFormModel.setBnk_name(bankMasterEntity.getBnk_name());
		bankMasterFormModels.add(bankMasterFormModel);
		}
		return bankMasterFormModels;
		
	}
}
