package com.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.model.Receptionist;

public class Dao implements IDao {

	@Autowired
	SessionFactory hibernateSessionFactory;

	
	public Boolean saveReception(Receptionist recp) {
		// TODO Auto-generated method stub
		
		Session session = hibernateSessionFactory.openSession();
		session.saveOrUpdate(recp);
		session.beginTransaction().commit();
		return session.beginTransaction().wasCommitted();
	}

	public List<Receptionist> getReceptionList() {
		// TODO Auto-generated method stub
		Session session = hibernateSessionFactory.openSession();
		
		return session.createCriteria(Receptionist.class).list();
	}

	
	
}
