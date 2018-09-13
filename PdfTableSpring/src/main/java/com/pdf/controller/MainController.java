package com.pdf.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pdf.dao.DaoImpl;
import com.pdf.dao.DaoInterface;
import com.pdf.model.BookStore;
import com.pdf.service.serviceInterface;

@Controller
public class MainController
{
	

	@Autowired
	serviceInterface pdfService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String Homepage(Model model) {
		return "home";
	}

	@RequestMapping(value = "/retrive", method = RequestMethod.GET)
	public ModelAndView getData(Model model) 
	{
		System.out.println("!!! in getController !!!");
	
		List<BookStore> list = null;
		try {
			list = pdfService.getList();

			System.out.println("after list");

			model.addAttribute("list", list);

			System.out.println("after dao");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return new ModelAndView("PDFBuilder", "list", list);
	
	}
}
