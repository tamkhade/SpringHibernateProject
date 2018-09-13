package com.healthcare.converter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.healthcare.dto.EmployeeViewFormModel;
import com.healthcare.entities.DegreeMasterEntity;
import com.healthcare.entities.EmployeeDetailMasterEntity;
import com.healthcare.entities.EmployeeTypeMasterEntity;
import com.healthcare.entities.OrgnizationUserMasterEntity;

public class EmployeeViewConverter 
{

	public static List<EmployeeViewFormModel> convertEmployeeViewEntityToForm(
			List<OrgnizationUserMasterEntity> orgnizationUserMasterEntities) 
	{
		List<EmployeeViewFormModel> employeeViewFormModels = new ArrayList<EmployeeViewFormModel>();

		for (OrgnizationUserMasterEntity orgnizationUserMasterEntity : orgnizationUserMasterEntities)
		{
			EmployeeViewFormModel employeeViewFormModel = new EmployeeViewFormModel();
			employeeViewFormModel.setUser_id(orgnizationUserMasterEntity.getOrg_user_id());
			employeeViewFormModel.setUser_fullnm(orgnizationUserMasterEntity.getUser_fullnm());

			employeeViewFormModel.setMobile_no(orgnizationUserMasterEntity.getUser_mob_no());
			
			SimpleDateFormat newFormat = new SimpleDateFormat("dd-MM-yyyy");
			
			String dob = newFormat.format(orgnizationUserMasterEntity.getUser_dob());
			employeeViewFormModel.setDob(dob);
			
			String doj = newFormat.format(orgnizationUserMasterEntity.getUser_doj());
			employeeViewFormModel.setDoj(doj);
			
			DegreeMasterEntity degreeMasterEntity = orgnizationUserMasterEntity.getDegreeMasterEntity();

			employeeViewFormModel.setDegree_type(degreeMasterEntity.getDegree_nm());

			Set<EmployeeDetailMasterEntity> employeeDetailMasterEntities = orgnizationUserMasterEntity
					.getEmployeeDetailMasterEntities();

			for (EmployeeDetailMasterEntity employeeDetailMasterEntity : employeeDetailMasterEntities) 
			{
				EmployeeTypeMasterEntity employeeTypeMasterEntity = employeeDetailMasterEntity
						.getEmployeeTypeMasterEntity();
				employeeViewFormModel.setEmployee_type_id(employeeTypeMasterEntity.getEmp_type_id());
				employeeViewFormModel.setEmployee_type(employeeTypeMasterEntity.getEmp_type());

			}
			employeeViewFormModels.add(employeeViewFormModel);
		}
		return employeeViewFormModels;
	}
}
