package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Dao.DaoInterface;
import com.Model.Items;
import com.Model.User;
import com.Services.ServicesInterface;

@Controller
public class ShoppingController {
	@Autowired
	ServicesInterface service;

	@RequestMapping(value = "index", method = RequestMethod.GET)
	public String redirect(Model model) {

		User user = new User();

		List<Items> ItemList = new ArrayList<Items>();

		Items Item = new Items();
		Item.setUser(user);

		Items Item1 = new Items();
		Item1.setUser(user);

		ItemList.add(Item);
		ItemList.add(Item1);

		user.setList(ItemList);

		model.addAttribute("Userform", user);
		model.addAttribute("itemlist", getlist());
		System.out.println("hie");
		return "customer";
	}

	@RequestMapping(value = "/insert")
	public String insertform(Model model, @ModelAttribute User user) {
		service.addUser(user);
		return "redirect:index.htm";
	}

	@ModelAttribute("itemlist")
	public List<Items> getlist() {
		List<Items> user = service.getUserList();
		System.out.println(user);
		return user;
	}

}
