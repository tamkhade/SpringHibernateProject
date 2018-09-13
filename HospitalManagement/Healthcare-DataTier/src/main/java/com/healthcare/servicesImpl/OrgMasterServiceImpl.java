/**
 * 
 */
package com.healthcare.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.healthcare.dao.OrgMasterDao;
import com.healthcare.entities.OrgMasterEntity;
import com.healthcare.services.OrgMasterService;

/**
 * @author ADMIN
 *
 */

public class OrgMasterServiceImpl implements OrgMasterService {
	
	@Autowired
	OrgMasterDao orgMstrDao;
	
	public OrgMasterDao getOrgMstrDao() {
		return orgMstrDao;
	}

	public void setOrgMstrDao(OrgMasterDao orgMstrDao) {
		this.orgMstrDao = orgMstrDao;
	}

	public long saveOrg(OrgMasterEntity orgMasterEntity) {
		// TODO Auto-generated method stub
		/*OrgMasterDao orgMasterDao = new OrgMasterDaoImpl();*/
		orgMstrDao.save(orgMasterEntity);
		System.out.println("servicen impl work ok");
		return 1l;
	}

}
