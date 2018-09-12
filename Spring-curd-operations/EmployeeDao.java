package com.dao;

import java.util.List;

import com.bean.Employee;

public interface EmployeeDao {
public Employee addemployee(Employee employee);
public List<Employee> getEmployeeList();
public Employee Deleteemployee(int id);
public List<Employee> editEmployee(int id);
public void updateEmployee(Employee employee);
	
	
}
