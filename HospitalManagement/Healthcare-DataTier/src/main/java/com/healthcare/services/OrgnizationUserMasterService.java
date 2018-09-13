package com.healthcare.services;

import java.util.List;

import com.healthcare.entities.OrgnizationUserMasterEntity;

public interface OrgnizationUserMasterService 
{
	public long saveOrgUser(OrgnizationUserMasterEntity orgnizationUserMasterEntity);
	
	public List<OrgnizationUserMasterEntity> getConsultantUsersService(long user_type_id);
}
