package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Employee;
import com.service.EmployeeServices;
import com.sun.xml.internal.org.jvnet.staxex.NamespaceContextEx.Binding;



@Controller
public class EmployeeController {
	
	
	@Autowired
	EmployeeServices Service;

	@RequestMapping(value = "/index")
	public String redirect(Model model)
	{
		Employee employee=new Employee();
		model.addAttribute("employeeForm",new Employee());
		return "registration";
		
	}
	
	@RequestMapping(value = "/saveContact.htm")
	public String insertform(Model model,@ModelAttribute("employeeSave") Employee employee,BindingResult result )
	{
	
		System.out.println(employee.getName()+" "+employee.getAddress());
		Service.addEmployee(employee);
		
		model.addAttribute("list",getlist());
		
		return "welcome";
	
		
	}

	@ModelAttribute("list")
	public List<Employee> getlist()
	{
		return Service.getEmployeeList();
		
	}
	
	@RequestMapping(value="delete.htm")
	public String delete(@ModelAttribute Employee employee,Model model)
	
	{
	Employee employee1=Service.DeleteEmployee(employee.getId());	
	model.addAttribute("employeeForm", new Employee());
	model.addAttribute("list",getlist());
		return "welcome";
	}
	
/*	@RequestMapping(value="edit.htm")
	public String Edit(Model model,@RequestParam int id)
	{
		
		Employee employee1 = Service.editEmployee(id);
		model.addAttribute("list",employee1);

		System.out.println("std--------------------" + employee1);

		
		
		return "welcome";

}
	*/
	
	
	@RequestMapping(value = "/edit.htm")
	public String editPage(Model model,@RequestParam int id) 
	{
		
		List<Employee> list=Service.editEmployee(id);
		model.addAttribute("list",list);
	
		return "edit";
	}
	
	
	
	@RequestMapping("/updateContact")
	public String updateEmployeeInoformation(Model model,@ModelAttribute("employeeSave") Employee employee,
			BindingResult result) {
		try {
			Service.updateEmployee(employee);
			model.addAttribute("list",getlist());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "welcome";
	
	
	
	
}
}
