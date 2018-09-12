package com.Services;

import org.springframework.beans.factory.annotation.Autowired;

import com.Dao.DaoInt;
import com.Model.Contact;

public class Tilesservicesimpl implements Tileservicesint{
	@Autowired
	DaoInt idao;

	
	
	public Contact addContact(Contact contact) {
		 return	idao.addContact(contact);

}
}
