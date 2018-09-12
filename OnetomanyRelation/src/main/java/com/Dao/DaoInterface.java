package com.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.Model.Items;
import com.Model.User;

public interface DaoInterface {


	
	

	public User addUser(User user);
	public List<Items> getUserList();
	public User Deleteuser(int id);
	public User editUser(int id);
	void updateUser(User user);
		
		
	
}





























