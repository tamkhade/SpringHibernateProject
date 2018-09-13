package com.demo.springmvc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.demo.springmvc.entity.UserInfo;

public class Daoimpl implements Exceldao 
{
 @Autowired
 private SessionFactory sessionfactory;
	
	public void add(List<UserInfo> Userinfo) 
	{
	
		Session session=sessionfactory.openSession();
		
		for(UserInfo list2:Userinfo)
		{
			session.save(list2);
			session.beginTransaction().commit();
		
	 
		}	}
	

}

