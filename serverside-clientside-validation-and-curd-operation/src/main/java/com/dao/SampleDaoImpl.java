package com.dao;

import java.util.LinkedList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.model.Samplemodel;

public class SampleDaoImpl implements SampleDao {

	
	@Autowired
SessionFactory hibernateSessionFactory;
	public boolean savedata(Samplemodel samplemodel) {
		// TODO Auto-generated method stub
		Session session=hibernateSessionFactory.openSession();
		session.saveOrUpdate(samplemodel);
		session.beginTransaction().commit();
		boolean result=session.beginTransaction().wasCommitted();
		session.flush();
		return result;
	}
	public List<Samplemodel> listdata() {
		// TODO Auto-generated method stub
		Session session=hibernateSessionFactory.openSession();
		List<Samplemodel> sample= session.createCriteria(Samplemodel.class).list();
		return sample;
	}
	public Samplemodel listodata(int id) {
		// TODO Auto-generated method stub
		Session session=hibernateSessionFactory.openSession();
		Samplemodel samplemodel=(Samplemodel) session.load(Samplemodel.class, id);
	
		return samplemodel;
	}
	public boolean deletedata(int id) {
		// TODO Auto-generated method stub
	Session session=hibernateSessionFactory.openSession();
	System.out.println(""+id);
	Samplemodel samplemodel=(Samplemodel) session.load(Samplemodel.class, id);
	session.delete(samplemodel);
	session.beginTransaction().commit();
	boolean result=session.beginTransaction().wasCommitted();
	session.flush();
	return result;
	
	
}
	
	

}
