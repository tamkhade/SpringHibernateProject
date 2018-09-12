package com.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.Dao.DaoInterface;
import com.Dto.ItemsConverter;
import com.Model.Items;
import com.Model.User;

public class ServicesImpl implements ServicesInterface {

	
	@Autowired
	DaoInterface Idao;
	public User addUser(User user) {
	
		return Idao.addUser(ItemsConverter
				.transferItemsFormToDto(user));
	}

	public List<Items> getUserList() {
		// TODO Auto-generated method stub
		return Idao.getUserList();
	}

	public User Deleteuser(int id) {
		// TODO Auto-generated method stub
		return Idao.Deleteuser(id);
	}

	public User editUser(int id) {
		// TODO Auto-generated method stub
		return Idao.editUser(id);
	}

	public void updateUser(User user) {
		// TODO Auto-generated method stub
	Idao.updateUser(user);
	}
	
	
	
	
	
	

}
