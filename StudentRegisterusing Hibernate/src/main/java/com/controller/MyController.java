package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Batch;
import com.model.Student;
import com.service.Iservice;

@Controller
public class MyController {
	
	@Autowired
	Iservice iservice;
	
	@RequestMapping(value = "studentPage")
	public String redirect(Model model) {

		Student student = new Student();
		/*List<Batch> batch_list=new ArrayList<Batch>();
		
		Batch batch=new Batch();
		batch.setStudent(student);
		Batch batch1=new Batch();
		batch1.setStudent(student);
		batch_list.add(batch);
		batch_list.add(batch1);*/
		model.addAttribute("student", student);
		return "welcome";
	}
	
	
	
	
	
	
	@RequestMapping(value = "studentform")
	public String direct(Model model) {

		Student student = new Student();
		List<Batch> batch_list=new ArrayList<Batch>();
		
		Batch batch=new Batch();
		batch.setStudent(student);
		Batch batch1=new Batch();
		batch1.setStudent(student);
		batch_list.add(batch);
		batch_list.add(batch1);
		model.addAttribute("studentform1",student);
		return "studentform";
	}

	@RequestMapping(value = "insert")
	public String saveCartRegister(ModelMap modelMap,
			@ModelAttribute("student") Student student) {
		 iservice.addStudent(student);
		return "redirect:studentPage";
	}
	
	@ModelAttribute("studentPage")
	public List<Student> getStudentList() {
		return iservice.getStudentList();
	}
}
