package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.MappedSuperclass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Batch;
import com.model.Student;
import com.service.Iservice;

@Controller

public class Mycontroller {

	@Autowired
	Iservice service;

	@RequestMapping(value = "studentPage")
	public String redirect(Model model) {
		System.out.println("welcome");
		Student student = new Student();
		model.addAttribute("student", student);

		return "welcome";
		
	}
	@RequestMapping(value = "batchTransfer")
	public String Redirect(Model model) {
		System.out.println("t");
		Student student = new Student();

		Batch b1 = new Batch();
		b1.setStudent(student);

		List<Batch> batch_list = new ArrayList<Batch>();
		batch_list.add(b1);
		// batch_list.add(b2);
		student.setBatch_list(batch_list);

		model.addAttribute("student", student);
		// System.out.println(iservice.getMaxEnroll());

		return "Batchtransform";
	}

	@RequestMapping(value = "/insert")
	public String savestud(Model model,
			@ModelAttribute("student") Student student) {

		
		service.addStudent1(student);
		System.out.println("sucess");
		return "redirect:studentPage";

	}

	@RequestMapping(value = "insertbatch")
	public String savebatch(Model model,
			@ModelAttribute("student") Student student)
	{
		System.out.println(student.toString());
		service.addStudent(student);
		System.out.println("sucess");

		return "Batchtransform";

	}

}
