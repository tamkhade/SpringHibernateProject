package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bean.Employee;
import com.dao.EmployeeDao;
import com.dao.*;
import com.bean.Employee;

public class EmployeeServicesImpl implements EmployeeServices {

	
	
	@Autowired
	EmployeeDao employeedao;
	
	public List<Employee> getEmployeeList() {
		return employeedao.getEmployeeList();
	}

	public Employee addEmployee(Employee employee) {
	 return	employeedao.addemployee(employee);
		
	}

	public List<Employee> editEmployee(int id) {
		
		return employeedao.editEmployee(id);
	}

	public Employee DeleteEmployee(int id) {
		
		return employeedao.Deleteemployee(id);
	}

	public void updateEmployee(Employee employee){
		 employeedao.updateEmployee(employee);
		
		
	}

}
