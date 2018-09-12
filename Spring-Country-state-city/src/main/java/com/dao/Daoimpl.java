package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.model.City;
import com.model.Country;
import com.model.State;


public class Daoimpl  implements Daoint{

	@Autowired
	SessionFactory hibernateSessionFactory;
	public boolean addCountry(Country country) {
		
		

		Session session = hibernateSessionFactory.openSession();
		session.saveOrUpdate(country);
		System.out.println("in dao impl -->" + country.getCid());
		session.beginTransaction().commit();
		return session.beginTransaction().wasCommitted();
	}

	
	public List<Country> getCountryList() {
		
		Session session = hibernateSessionFactory.openSession();
		List<Country> list = session.createCriteria(Country.class).list();
		return list;
}
	public List<State> getstatelist(Integer id){
		Session session = hibernateSessionFactory.openSession();
		System.out.println("hiiii"+id);
		Query query=session.createQuery("From State s Where s.countryid = :id");
		query.setParameter("id",id);
		List<State> l=query.list();
		return l;
	}
	
	
	
	
	public List<City> getcitylist(Integer id){
		Session session = hibernateSessionFactory.openSession();
		System.out.println("hiiii"+id);
		Query query=session.createQuery("From City c Where c.stateid = :id");
		query.setParameter("id",id);
		List<City> l=query.list();
		return l;
	}
}

