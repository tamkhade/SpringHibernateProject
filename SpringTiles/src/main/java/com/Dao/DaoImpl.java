package com.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.Model.Contact;

public class DaoImpl implements DaoInt{
	
	
	
	
	
	@Autowired
	SessionFactory hibernateSessionFactory;

	public Contact addContact(Contact contact) {
		
		
		Session session=hibernateSessionFactory.openSession();
		session.saveOrUpdate(contact);
		session.beginTransaction().commit();
		return contact;

}
}