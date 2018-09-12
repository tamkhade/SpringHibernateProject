package com.dao;

import java.util.ArrayList;
import java.util.List;

import javax.management.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.bean.Employee;



public class EmployeeDaoImpl implements EmployeeDao{
@Autowired
SessionFactory hibernateSessionFactory;

public List<Employee> getEmployeeList()
{
	Session session = hibernateSessionFactory.openSession();
	List<Employee> lst = session.createCriteria(Employee.class).list();
	return lst;	
}

public Employee addemployee(Employee emplyoee)
{
	
	Session session=hibernateSessionFactory.openSession();
	session.saveOrUpdate(emplyoee);
	session.beginTransaction().commit();
	return emplyoee;
}
	
public List<Employee> editEmployee(int id)


{
	List<Employee> list=null;
	Session session=hibernateSessionFactory.openSession();

	Employee employee=(Employee) session.load(Employee.class,id);
	list=new ArrayList<Employee>();
	list.add(employee);
	session.flush();
	return list;
	
}



public Employee Deleteemployee(int id)
{
	Session session =hibernateSessionFactory.openSession();
	Employee student =(Employee) session.load(Employee.class, id);
	session.delete(student);
	session.beginTransaction().commit();
	session.flush();
    return student;

}

public void updateEmployee(Employee employee) {
	try {
		Session session = hibernateSessionFactory.openSession();
		System.out.println(employee.getId());
		session.saveOrUpdate(employee);
		session.beginTransaction().commit();
		 System.out.println("Command successfully executed....");
		 
		 
	} catch (Exception e) {
		e.printStackTrace();
	}
		
		 
		 
	
	
	/*Session session =hibernateSessionFactory.openSession();	 Query qry = (Query) session.createQuery("update Employee e set e.name=? e.address=? e.age=? e.salary=? where e.id=?");
	 System.out.println(qry);
	 ((org.hibernate.Query) qry).setParameter(0,employee.getName());
	 ((org.hibernate.Query) qry).setParameter(1,employee.getAddress());
	 ((org.hibernate.Query) qry).setParameter(2,employee.getAge());
	 ((org.hibernate.Query) qry).setParameter(3,employee.getSalary());
	 ((org.hibernate.Query) qry).setParameter(4,employee.getId());
	 int res = ((org.hibernate.Query) qry).executeUpdate();
	 
	*/
}
}