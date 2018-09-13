package com.pdf.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.pdf.model.BookStore;

public class DaoImpl implements DaoInterface {

	@Autowired
	SessionFactory hibernateSessionFactory;

	public List<BookStore> getList() 
	{
	
		List<BookStore> list = null;
		Session session = hibernateSessionFactory.openSession();
		try {
			System.out.println("in daoimpl");
			list = session.createCriteria(BookStore.class).list();
			return list;
		} catch (HibernateException e)
		{
			e.printStackTrace();
			return list;
		}

	}
}
