package com.healthcare.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.healthcare.dao.OrgMasterDao;
import com.healthcare.dao.OrgModuleMstDao;
import com.healthcare.entities.OrgModuleMstEntity;

public class OrgModuleMstDaoImpl implements OrgModuleMstDao {

	
	@Autowired
	private SessionFactory hibernate4AnnotatedSessionFactory;

	Session session;
	
	public Session getSession() 
	{
		return hibernate4AnnotatedSessionFactory.openSession();
	}
	public List<OrgModuleMstEntity> getlist() {
		// TODO Auto-generated method stub
		List<OrgModuleMstEntity> list =new ArrayList<OrgModuleMstEntity> ();
		OrgModuleMstEntity o = new OrgModuleMstEntity();
		Query q= getSession().createSQLQuery("SELECT * FROM org_module_mst WHERE org_mod_type='c'").addEntity(OrgModuleMstEntity.class);
		list=q.list();
		return list;
	}

	
}
