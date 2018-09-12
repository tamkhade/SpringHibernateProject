package com.Dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.Model.Items;
import com.Model.User;


public class DaoImpl implements DaoInterface {
	
	
	@Autowired
	SessionFactory hibernateSessionFactory;

	public User addUser(User user) {
		
		
		Session session=hibernateSessionFactory.openSession();
		session.saveOrUpdate(user);
		session.beginTransaction().commit();
		return user;
	}

	public List<Items> getUserList() {
		Session session = hibernateSessionFactory.openSession();
		List<Items> list = session.createCriteria(Items.class).list();
		return list;	
	}

	public User Deleteuser(int id) {
		Session session =hibernateSessionFactory.openSession();
		User user =(User) session.load(User.class, id);
		session.delete(user);
	    return user;

	}

	public User editUser(int id) {
		// TODO Auto-generated method stub
		
		
		Session session = hibernateSessionFactory.openSession();
		
		User user = (User) session.load(User.class, id);
		return user;


	}

	public void updateUser(User user) {
		Session session = hibernateSessionFactory.openSession();
		session.saveOrUpdate(user);
		session.beginTransaction().commit();
		 System.out.println("Command successfully executed....");
		
	}
}

	