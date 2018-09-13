package com.healthcare.converter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.healthcare.dto.StateMasterFormModel;
import com.healthcare.entities.StateMasterEntity;

public class StateMasterConverter {

	public static StateMasterEntity stateMasterFormToEntity(StateMasterFormModel stateMasterFormModel) {
		StateMasterEntity stateMasterEntity = new StateMasterEntity();
		stateMasterEntity.setState_id(stateMasterFormModel.getState_id());
		stateMasterEntity.setState_name(stateMasterFormModel.getState_name());
		stateMasterEntity.setState_created_by(11);
		stateMasterEntity.setState_created_dt(new Date());
		stateMasterEntity.setState_updated_by(11);
		stateMasterEntity.setState_updated_dt(new Date());
		stateMasterEntity.setCountry_id(stateMasterFormModel.getCountry_id());	

		return stateMasterEntity;
	}

	public static List<StateMasterFormModel> stateMasterEntityToFormList(List<StateMasterEntity> stateMasterEntities) {

		List<StateMasterFormModel> countryMasterFormModels = new ArrayList<StateMasterFormModel>();

		for (StateMasterEntity stateMasterEntity : stateMasterEntities) {
			StateMasterFormModel stateMasterFormModel = new StateMasterFormModel();
			stateMasterFormModel.setCountry_id(stateMasterEntity.getCountry_id());
			stateMasterFormModel.setState_id(stateMasterEntity.getState_id());
			stateMasterFormModel.setState_name(stateMasterEntity.getState_name());
			countryMasterFormModels.add(stateMasterFormModel);
		}

		return countryMasterFormModels;

	}

	public static StateMasterFormModel stateMasterEntityToForm(StateMasterEntity stateMasterEntity) {

		StateMasterFormModel stateMasterFormModel = new StateMasterFormModel();
		stateMasterFormModel.setCountry_id(stateMasterEntity.getCountry_id());
		stateMasterFormModel.setState_id(stateMasterEntity.getState_id());
		stateMasterFormModel.setState_name(stateMasterEntity.getState_name());

		return stateMasterFormModel;

	}
}
