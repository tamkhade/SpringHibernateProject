package com.Services;

import java.util.List;

import com.Model.Items;
import com.Model.User;

public interface ServicesInterface {

	
	

	public User addUser(User user);
	public List<Items> getUserList();
	public User Deleteuser(int id);
	public User editUser(int id);
	 void updateUser(User user);
		
		
	
	
}
