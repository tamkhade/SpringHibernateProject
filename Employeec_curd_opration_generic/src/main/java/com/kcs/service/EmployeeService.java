package com.kcs.service;

import java.util.List;

import com.kcs.model.Employee;

public interface EmployeeService
{
	List<Employee> getAllEmployees();

	Long addNewEmployee(Employee employee);

	boolean deleteEmployee(Integer Id);
	
	Employee getEmployee(Integer Id);
	
	boolean updateEmployee(Employee employee);
	
	Integer getMaxSalary();
	
	List<Employee> getEmployeeByLike(String string);
}
