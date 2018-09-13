package com.jarvis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jarvis.model.Address;
import com.jarvis.model.Student;
import com.jarvis.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	StudentService studentService;

	@RequestMapping(value = "link1")
	public String getPage(Model model) {

		Address address = new Address();
		Student student = new Student();

		address.setStudent(student);
		student.setAddress(address);

		model.addAttribute("studentform", student);
		return "registerForm";

	}

	@RequestMapping(value = "link2")
	public String saveEmployee(Model model,
			@ModelAttribute("studentform") Student s, BindingResult result) {
		System.out.println("in action");

		Student student = new Student();
		student.setFirstName(s.getFirstName());
		student.setLastName(s.getLastName());
		student.setSection(s.getSection());

		Address address = s.getAddress();
		address.setStreet(address.getStreet());
		address.setCity(address.getCity());
		address.setCountry(address.getCountry());
		address.setStudent(student);
		student.setAddress(address);

		studentService.addStudent(student);
		//model.addAttribute("studentform", new Student());
		model.addAttribute("studentList", studentService.getStudentList());
		
		return "viewForm";
	}

	@ModelAttribute("studentList")
	public List<Student> getStudentList() {
		return studentService.getStudentList();
	}
@RequestMapping(value="editStudent")
public String editStudent(Model model,@RequestParam long id){
	System.out.println("id = " + id);
	Student student=studentService.studentEdit( id);
	System.out.println("done"+student.getFirstName());
	model.addAttribute("studentform", student);
	
	return "registerForm";

	
}
@RequestMapping("/deleteStudent")
public String deleteEmployee(Model model,@RequestParam int id)
{
	System.out.println("id = " + id);
	try {
		studentService.studentDelete(id);
	} catch (Exception e) {
	
	}
	model.addAttribute("studentList", studentService.getStudentList());
	return "viewForm";
}
}
