package com.healthcare.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.healthcare.dao.OrgOwnMasterDao;
import com.healthcare.entities.OrgModuleMstEntity;
import com.healthcare.entities.OrgOwnMasterEntity;

public class OrgOwnMasterDaoImpl implements OrgOwnMasterDao {

	@Autowired
	private SessionFactory hibernate4AnnotatedSessionFactory;

	Session session;
	
	public Session getSession() 
	{
		return hibernate4AnnotatedSessionFactory.openSession();
	}
	
	
	public List<OrgOwnMasterEntity> getdeplist() {
		List<OrgOwnMasterEntity> list =new ArrayList<OrgOwnMasterEntity> ();
		OrgOwnMasterEntity o = new OrgOwnMasterEntity();
		Query q= getSession().createSQLQuery("OrgModuleMstEntity o JOIN OrgOwnMasterEntity ow ON o.mod_id = ow.mod_id JOIN OrgMasterEntity og ON og.org_id = ow.org_id").addEntity(OrgOwnMasterEntity.class);
		list=q.list();
		return list;
		
	}


}
