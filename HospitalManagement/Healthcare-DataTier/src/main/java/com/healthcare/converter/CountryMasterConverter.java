package com.healthcare.converter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.healthcare.dto.CountryMasterFormModel;
import com.healthcare.entities.CountryMasterEntity;
import com.healthcare.entities.StateMasterEntity;

public class CountryMasterConverter {

	public static CountryMasterEntity countryMasterFormToEntity(CountryMasterFormModel countryMasterFormModel) {

		CountryMasterEntity countryMasterEntity = new CountryMasterEntity();
		countryMasterEntity.setCountry_id(countryMasterFormModel.getCountry_id());
		countryMasterEntity.setCountry_name(countryMasterFormModel.getCountry_name());
		countryMasterEntity.setCountry_created_by(11);
		countryMasterEntity.setCountry_created_dt(new Date());
		countryMasterEntity.setCountry_updated_by(11);
		countryMasterEntity.setCountry_updated_dt(new Date());
	
		return countryMasterEntity;

	}

	public static CountryMasterFormModel countryMasterEntityToForm(CountryMasterEntity countryMasterEntity) {
		CountryMasterFormModel countryMasterFormModel = new CountryMasterFormModel();
		System.out.println("Convertercountry id"+countryMasterEntity.getCountry_id());
		countryMasterFormModel.setCountry_id(countryMasterEntity.getCountry_id());		
		countryMasterFormModel.setCountry_name(countryMasterEntity.getCountry_name());
		

		return countryMasterFormModel;

	}

	public static List<CountryMasterFormModel> countryMasterEntityToFormList(
			List<CountryMasterEntity> countryMasterEntities) {
		List<CountryMasterFormModel> countryMasterFormModels = new ArrayList<CountryMasterFormModel>();
		for (CountryMasterEntity countryMasterEntity : countryMasterEntities) {
			CountryMasterFormModel countryMasterFormModel = new CountryMasterFormModel();
			countryMasterFormModel.setCountry_id(countryMasterEntity.getCountry_id());
			countryMasterFormModel.setCountry_name(countryMasterEntity.getCountry_name());

			countryMasterFormModels.add(countryMasterFormModel);
		}
		return countryMasterFormModels;

	}
}
