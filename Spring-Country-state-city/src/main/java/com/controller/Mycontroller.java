package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.City;
import com.model.Country;
import com.model.State;
import com.service.Serviceint;
import com.sun.xml.internal.ws.wsdl.writer.document.Service;

@Controller
public class Mycontroller {
	@Autowired
	Serviceint service;

	@RequestMapping(value = "/index" )

	public String redirect(Model model) {

		/*Country country = new Country();

		List<State> stateList = new ArrayList<State>();
		State state = new State();

		state.setCountry(country);

		State state1 = new State();
		state1.setCountry(country);

		stateList.add(state);
		stateList.add(state1);
		country.setStatelist(stateList);*/

		model.addAttribute("countryForm", new Country());
		return "New1";
	}

	@RequestMapping(value = "/insertbatch")
	public String insertform(Model model, @ModelAttribute Country country) {

		service.addCountry(country);

		return "redirect:index.htm";

	}

	@ModelAttribute(value = "displaylist")
	public List<Country> getcountry() {

		return service.getCountryList();

	}

	@RequestMapping(value = "add.htm", method = RequestMethod.POST)
	@ResponseBody
	public String add(HttpServletRequest request, HttpServletResponse response, @RequestParam("id") Integer id)
			throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		List<State> lis = service.getstatelist(id);
		

		String value = mapper.writeValueAsString(lis);

		return value;

	}

	
	@RequestMapping(value = "state.htm", method = RequestMethod.POST)
	@ResponseBody
	public String addcity(HttpServletRequest request, HttpServletResponse response, @RequestParam("id") Integer id)
			throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		List<City> lis = service.getcitylist(id);
		

		String value = mapper.writeValueAsString(lis);

		return value;

	}
	
	
}