package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Employee;

@Controller
public class Pdfcontroller 
{
@RequestMapping(value = "pdf.htm", method = RequestMethod.GET)

ModelAndView generatePdf(HttpServletRequest request,   HttpServletResponse response) throws Exception 
{

	System.out.println("Calling generatePdf()...");
	  
	  Employee employee = new Employee();
	  employee.setFirstname("akash");
	  employee.setLastname("Jamhulkar");
	  
	  ModelAndView modelAndView = new ModelAndView("Pdfview", "command",employee);
	  
	  return modelAndView;
	  

}

}