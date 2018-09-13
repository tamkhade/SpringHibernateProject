package com.healthcare.converter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.healthcare.dto.AreaMasterFormModel;
import com.healthcare.entities.AreaMasterEntity;

public class AreaMasterConverter {

	public static AreaMasterEntity areaMasterFormToEntity(AreaMasterFormModel areaMasterFormModel) {
		AreaMasterEntity areaMasterEntity = new AreaMasterEntity();
		areaMasterEntity.setArea_id(areaMasterFormModel.getArea_id());
		areaMasterEntity.setArea_name(areaMasterFormModel.getArea_name());
		areaMasterEntity.setArea_creatd_by(11);
		areaMasterEntity.setArea_created_dt(new Date());
		areaMasterEntity.setArea_updated_by(11);
		areaMasterEntity.setArea_upadted_dt(new Date());
		areaMasterEntity.setPincode_id(areaMasterFormModel.getPincode_id());
		areaMasterEntity.setCity_id(areaMasterFormModel.getCity_id());
		return areaMasterEntity;
	}

	public static AreaMasterFormModel areaMasterEntityToForm(AreaMasterEntity areaMasterEntity) {
		AreaMasterFormModel areaMasterFormModel = new AreaMasterFormModel();
		areaMasterFormModel.setArea_id(areaMasterEntity.getArea_id());
		areaMasterFormModel.setArea_name(areaMasterEntity.getArea_name());
		areaMasterFormModel.setCity_id(areaMasterEntity.getCity_id());
		areaMasterFormModel.setPincode_id(areaMasterEntity.getPincode_id());
		return areaMasterFormModel;
	}

	public static List<AreaMasterFormModel> areaMasterEntityToFormList(List<AreaMasterEntity> areaMasterEntities) {
		List<AreaMasterFormModel> areaMasterFormModels = new ArrayList<AreaMasterFormModel>();
		for (AreaMasterEntity areaMasterEntity : areaMasterEntities) {
			AreaMasterFormModel areaMasterFormModel = new AreaMasterFormModel();
			areaMasterFormModel.setArea_id(areaMasterEntity.getArea_id());
			areaMasterFormModel.setArea_name(areaMasterEntity.getArea_name());
			areaMasterFormModel.setCity_id(areaMasterEntity.getCity_id());
			areaMasterFormModel.setPincode_id(areaMasterEntity.getPincode_id());
			areaMasterFormModels.add(areaMasterFormModel);
		}
		return areaMasterFormModels;

	}

}
