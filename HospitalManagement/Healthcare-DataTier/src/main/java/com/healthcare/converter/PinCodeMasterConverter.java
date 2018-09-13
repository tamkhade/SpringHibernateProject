package com.healthcare.converter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.healthcare.dto.PinCodeMasterFormModel;
import com.healthcare.entities.PincodeMasterEntity;

public class PinCodeMasterConverter {

	public static PincodeMasterEntity pincodeMasterFormToEntity(PinCodeMasterFormModel pinCodeMasterFormModel)
	{
		PincodeMasterEntity pincodeMasterEntity=new PincodeMasterEntity();
		pincodeMasterEntity.setPincode_id(pinCodeMasterFormModel.getPincode_id());
		pincodeMasterEntity.setPincode_number(pinCodeMasterFormModel.getPincode_number());
		pincodeMasterEntity.setPincode_created_by(11);
		pincodeMasterEntity.setPincode_creatd_dt(new Date());
		pincodeMasterEntity.setPincode_updated_by(11);
		pincodeMasterEntity.setPincode_updated_dt(new Date());
		return pincodeMasterEntity;
		
	}
	
	public static PinCodeMasterFormModel pincodeMasterEntityToForm(PincodeMasterEntity pincodeMasterEntity)
	{
		PinCodeMasterFormModel pinCodeMasterFormModel=new PinCodeMasterFormModel();
		pinCodeMasterFormModel.setPincode_id(pincodeMasterEntity.getPincode_id());
		pinCodeMasterFormModel.setPincode_number(pincodeMasterEntity.getPincode_number());
		return pinCodeMasterFormModel;
	}
	
	public static List<PinCodeMasterFormModel> pincodeMasterEntityToFormList(List<PincodeMasterEntity>pincodeMasterEntities)
	{
		List<PinCodeMasterFormModel>pinCodeMasterFormModels=new ArrayList<PinCodeMasterFormModel>();
		for(PincodeMasterEntity pincodeMasterEntity:pincodeMasterEntities)
		{
			PinCodeMasterFormModel pinCodeMasterFormModel=new PinCodeMasterFormModel();
			pinCodeMasterFormModel.setPincode_id(pincodeMasterEntity.getPincode_id());
			pinCodeMasterFormModel.setPincode_number(pincodeMasterEntity.getPincode_number());
			pinCodeMasterFormModels.add(pinCodeMasterFormModel);			
		}
		return pinCodeMasterFormModels;
	}
	
}
