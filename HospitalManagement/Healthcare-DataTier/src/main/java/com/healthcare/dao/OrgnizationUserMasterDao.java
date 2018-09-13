package com.healthcare.dao;


import java.util.List;

import com.healthcare.entities.OrgnizationUserMasterEntity;
import com.healthcare.utils.GenericDao;

public interface OrgnizationUserMasterDao  extends GenericDao<OrgnizationUserMasterEntity> {

	public List<OrgnizationUserMasterEntity> getConsultantUsersDao(long user_type_id);
}
