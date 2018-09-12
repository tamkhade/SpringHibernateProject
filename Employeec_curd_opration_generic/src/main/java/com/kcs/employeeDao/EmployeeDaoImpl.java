package com.kcs.employeeDao;

import com.kcs.genericDao.AbstractGenericDao;
import com.kcs.model.Employee;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl extends AbstractGenericDao<Employee> implements EmployeeDao {

	public Integer getMaxSalary() {
		Criteria criteria = getSession().createCriteria(Employee.class).setProjection(Projections.max("empSalary"));
		Integer maxSalary = (Integer) criteria.uniqueResult();
		return maxSalary;
	}

	public List<Employee> getEmployeeByLike(String string) {
		Criteria criteria = getSession().createCriteria(Employee.class).add(Restrictions. like("empName",string,MatchMode.START));
		/*List<Employee> employeeList = new ArrayList<Employee>();
		for(Employee employee : employeeList)
		{
			
		}*/
		
		return criteria.list();
	}
}
