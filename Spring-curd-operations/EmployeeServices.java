package com.service;

import java.util.List;

import com.bean.Employee;

public interface EmployeeServices {
	
	
	
	public List<Employee> getEmployeeList();

	 
	public Employee addEmployee(Employee employee);

	public List<Employee> editEmployee(int id);

	public Employee DeleteEmployee(int id);
	
	public void updateEmployee(Employee employee);

}
