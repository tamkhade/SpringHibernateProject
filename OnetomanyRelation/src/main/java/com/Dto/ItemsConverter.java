package com.Dto;

import java.util.ArrayList;
import java.util.List;

import com.Model.Items;
import com.Model.User;

public class ItemsConverter {

/*	public static User transferItemsFormToDto(User user)
	
	{
		User user1= new User();
		user1.setUserId(user.getUserId());
		user1.setUserName(user.getUserName());
		
		List<Items> Itemlist = new ArrayList<Items>();

		List<Items> Itemlist1 = user.getList();
	

	for (Items item : Itemlist1) {
		Items item2 = new Items();
		item2.setItemId(item.getItemId());
		item2.setItemsName(item.getItemsName());
		item2.setPrice(item.getPrice());
		item2.setUser(user1);
		Itemlist.add(item2);
	}
	user1.setList(Itemlist);
	
	
	
	
	
	
	
	
	
	


return user1;
	



}


*/

	public static User transferItemsFormToDto(User user){
	
	User user1 = new User();
	user1.setUserName(user.getUserName());
	
	user1.setUserId(user.getUserId());
	List<Items> list = new ArrayList<Items>();

	List<Items> user2 = user.getList();
	for (Items item : user2) {
		Items item2 = new Items();
		item2.setItemId(item.getItemId());
		item2.setItemsName(item.getItemsName());
		item2.setPrice(item.getPrice());
		item2.setUser(user1);
		list.add(item2);
	}

	user1.setList(list);
	return user1;

	
	
	
}


}




