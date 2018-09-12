package com.kcs.service;

import org.apache.log4j.Logger;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.kcs.employeeDao.EmployeeDao;
import com.kcs.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	final static Logger logger = Logger.getLogger(EmployeeServiceImpl.class);

	@Autowired
	EmployeeDao employeeDao;

	public List<Employee> getAllEmployees() {
		logger.debug("Getting all employees...");
		return employeeDao.findAll();
	}

	/**
	 * Add new employee if it in not already exists
	 * 
	 * @param employee:
	 *            Employee to add
	 */
	@Transactional(readOnly = false)
	public Long addNewEmployee(Employee employee) {

		Employee emp = new Employee();
		emp.setEmpName(employee.getEmpName());
		emp.setEmpSalary(employee.getEmpSalary());

		List<Employee> emplList = employeeDao.findAllByExample(emp);

		if (emplList == null || emplList.isEmpty()) 
		{
			int id = (Integer) employeeDao.save(employee);
			logger.debug("Id of new Employee -------------- " + id);
			if(id!=0 || id>0)
			{
				return 1L;
			
			}
			else
			{
				return 0L;
			}
		}
		else 
		{
		
			logger.debug("Employee " + emp + " already exists");
			return -1L;
		}
	}

	/**
	 * Return maximum salary given to any employee
	 * 
	 * @return max salary
	 */
	public Integer getMaxSalary() {
		return employeeDao.getMaxSalary();
	}

	public boolean deleteEmployee(Integer Id) 
	{
		logger.debug("Deleting Employee....");
		return employeeDao.deletebyId(Id);
	}

	public Employee getEmployee(Integer id) 
	{
		logger.debug("getting employee object....");
		return employeeDao.findById(id);
	}

	public boolean updateEmployee(Employee employee) 
	{
		logger.debug("getting employee object....");
		return employeeDao.update(employee);
	}

	public List<Employee> getEmployeeByLike(String string) {
		return employeeDao.getEmployeeByLike(string);
	}
}
