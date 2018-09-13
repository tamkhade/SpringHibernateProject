package com.healthcare.converter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.healthcare.dto.CityMasterFormModel;
import com.healthcare.entities.CityMasterEntity;

public class CityMasterConverter {
	
	
	public static CityMasterEntity cityMasterFormToEntity(CityMasterFormModel cityMasterFormModel)
	{
		CityMasterEntity cityMasterEntity=new CityMasterEntity();
		cityMasterEntity.setCity_id(cityMasterFormModel.getCity_id());
		cityMasterEntity.setCity_name(cityMasterFormModel.getCity_name());
		cityMasterEntity.setCity_created_by(11);
		cityMasterEntity.setCity_creatd_dt(new Date());
		cityMasterEntity.setCity_updated_by(11);
		cityMasterEntity.setCity_updated_dt(new Date());
		cityMasterEntity.setState_id(cityMasterFormModel.getState_id());
		
		return cityMasterEntity;
		
	}
	
	public static CityMasterFormModel cityMasterEntityToForm(CityMasterEntity cityMasterEntity)
	{
		CityMasterFormModel cityMasterFormModel=new CityMasterFormModel();
		cityMasterFormModel.setCity_id(cityMasterEntity.getCity_id());
		cityMasterFormModel.setCity_name(cityMasterEntity.getCity_name());
		cityMasterFormModel.setState_id(cityMasterEntity.getState_id());
		return cityMasterFormModel;
		
	}
	
	public static List<CityMasterFormModel> cityMasterEntityToFormList(List<CityMasterEntity> cityMasterEntities)
	{
		List<CityMasterFormModel> cityMasterFormModels=new ArrayList<CityMasterFormModel>();
		for(CityMasterEntity cityMasterEntity:cityMasterEntities)
		{
			CityMasterFormModel cityMasterFormModel=new CityMasterFormModel();
			cityMasterFormModel.setCity_id(cityMasterEntity.getCity_id());
			cityMasterFormModel.setCity_name(cityMasterEntity.getCity_name());
			cityMasterFormModel.setState_id(cityMasterEntity.getState_id());
			cityMasterFormModels.add(cityMasterFormModel);
		}
		return cityMasterFormModels;
		
	}
}