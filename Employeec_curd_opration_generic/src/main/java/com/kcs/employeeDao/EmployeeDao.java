package com.kcs.employeeDao;

import java.util.List;

import com.kcs.genericDao.GenericDao;
import com.kcs.model.*;

public interface EmployeeDao extends GenericDao<Employee>
{
	Integer getMaxSalary();
	
	List<Employee> getEmployeeByLike(String string);
}
