package com.kcs.controller;
import java.util.List;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kcs.model.Employee;
import com.kcs.service.EmployeeService;
import com.kcs.validator.EmployeeFormValidator;

	@Controller
	public class EmployeeController 
	{
		
		@Resource
		EmployeeService employeeService;
		
		@InitBinder
		private void initBinder(WebDataBinder binder) {
			EmployeeFormValidator validator = new EmployeeFormValidator();
			binder.setValidator(validator);
		}
		
		@ModelAttribute("employeeList")
		private List<Employee> getList() 
		{
			
			System.out.println("---- All empss ----- \n"+employeeService.getAllEmployees());
			return employeeService.getAllEmployees();
		}

		@RequestMapping(value = "EmployeeList.hms")
		public String getEmployeeRegisterPage(ModelMap map) 
		{
			System.out.println("in Controollerrr");
			map.addAttribute("employee",new Employee());
			return "EmployeeRegister";
		}
		
		@RequestMapping(value = "/empRegister.hms", method = RequestMethod.POST)
		public String saveEmployee(ModelMap map, @ModelAttribute("employee") @Valid Employee employee,
				BindingResult bindingResult) {

			if (bindingResult.hasErrors()) {
				System.out.println("has error");
				return "EmployeeRegister";

			} else {
				Long result = employeeService.addNewEmployee(employee);
				if (result==1L) {
					map.addAttribute("employeeMsg", "Successfully saved");

				} 
				else if(result==-1L) 
				{
					map.addAttribute("employeeMsg", "Employee Already Exist");
				}
				map.addAttribute("employeeList", getList());
				map.addAttribute(new Employee());
				return "EmployeeRegister";
			}
		}
		
		@RequestMapping("/EmployeeDelete")
		public String deleteEmployee(@RequestParam Integer empId, ModelMap map, @ModelAttribute Employee employee) {
			System.out.println(empId);
			boolean result = employeeService.deleteEmployee(empId);

			if (result == true) {
				map.addAttribute("employeeMsg", "Successfully Deleted");
			} else {
				map.addAttribute("employeeMsg", "Something went wrong. Try again...");
			}

			map.addAttribute("employee", employee);
			map.addAttribute("employeeList", getList());
			return "EmployeeRegister";
		}
		
		@RequestMapping(value="/EmployeeEdit",method = RequestMethod.GET)
		public String editEmployee(@RequestParam Integer empId, ModelMap map) 
		{
			Employee employee = employeeService.getEmployee(empId);
			map.addAttribute("employee", employee);
			return "EmployeeRegister";
		}
		
		@RequestMapping(value="/EmployeeMaxSalary",method = RequestMethod.GET)
		public String MaxEmployeeSalary(@RequestParam Integer empId, ModelMap map) 
		{
			Integer maxSalary = employeeService.getMaxSalary();
			System.out.println("Maxx ----"+maxSalary);
			map.addAttribute("maxSalary", maxSalary);
			map.addAttribute(new Employee());
			map.addAttribute("employeeList", getList());
			return "EmployeeRegister";
		} 
		
		
		@RequestMapping(value="/EmployeeByName",method = {RequestMethod.GET,RequestMethod.POST})
		public String getEmployeeByName(@RequestParam String empNames, ModelMap map) 
		{
			System.out.println("Employeess to be Searched:"+ empNames);
			map.addAttribute("employeeNameList",employeeService.getEmployeeByLike(empNames));
			System.out.println("Employeess ----"+ employeeService.getEmployeeByLike(empNames));
			map.addAttribute(new Employee());
			map.addAttribute("employeeList", getList());
			return "EmployeeRegister";
			
			
		} 
		@RequestMapping(value = "/EmployeeUpdate.hms", method = RequestMethod.POST)
		public String updateEmployee(ModelMap map, @ModelAttribute("employee") @Valid Employee employee,
				BindingResult bindingResult) {

			if (bindingResult.hasErrors()) {
				System.out.println("has error");
				return "EmployeeRegister";

			} else 
			{
				System.out.println("in Update");
				boolean result = employeeService.updateEmployee(employee);
				System.out.println("after Update");
				if (result == true) 
				{
					
					map.addAttribute("employeeMsg", "Successfully Updated");

				} else {
					map.addAttribute("employeeMsg", "Employee Not Exist");
				}
				map.addAttribute("employeeList", getList());
				map.addAttribute(new Employee());
				return "EmployeeRegister";
			}
		}
}
