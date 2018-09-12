package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.taglibs.standard.tag.common.core.SetSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.Dto;
import com.model.Batch;
import com.model.Student;
import com.service.Iservice;

@Controller
public class Mycontroller {

	@Autowired
	Iservice service;

	@RequestMapping(value = "studentpage")
	public String redirect(Model model) {
		// create student two new object
		Student jack = new Student();

		// create batch two new object
		Batch batch1 = new Batch();
		// Batch batch2 = new Batch();

		/*
		 * List<Student> studentlist = new ArrayList<Student>();
		 * 
		 * studentlist.add(jack); studentlist.add(peter);
		 * batch1.setStudentlist(studentlist);
		 * batch2.setStudentlist(studentlist);
		 */

		List<Batch> batchlist = new ArrayList<Batch>();

		batchlist.add(batch1);
		// batchlist.add(batch2);
		jack.setBatch_list(batchlist);

		model.addAttribute("studentform", jack);

		return "welcome1";
	}

	@RequestMapping(value = "saveContact")
	public String savestudent(Model model,
			@ModelAttribute("studentform") Student student, BindingResult result) {
		student.setEnroll(Dto.combine(service.getMaxEnroll()));
		service.addstudent(student);
		model.addAttribute("studentform", new Student());
		return "redirect:/studentpage";
	}

	@RequestMapping(value = "search")
	public String searchyear(Model model){
			
      model.addAttribute("serarching",new Student());
	return "display";
      
	}
	@RequestMapping(value="searchyear")
	public String searchstudent(Model model,@RequestParam(value="enroll")String enroll){
		System.out.println("controller"+enroll);
		List<Student> list=service.searchyear(enroll);
		
		
		
		model.addAttribute("serarching",list);
		
		return "welcome2";
	}
	


	
}
