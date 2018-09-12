package com.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.model.Batch;
import com.model.Student;

public class DioImpl implements Idao {

	@Autowired
	SessionFactory hibernateSessionFactory;

	public boolean addstudent(Student student) {
		Session session = hibernateSessionFactory.openSession();
		session.saveOrUpdate(student);
		session.beginTransaction().commit();

		return session.beginTransaction().wasCommitted();

	}

	public String getMaxEnroll() {
		Session session = hibernateSessionFactory.openSession();

		org.hibernate.Criteria criteria = session.createCriteria(Student.class)
				.setProjection(Projections.max("id"));
		Integer maxId = (Integer) criteria.uniqueResult();
		if (maxId == 0) {
			String max = null;
			return max;
		} else {
			Student stud = (Student) session.load(Student.class, maxId);
			System.out.println(stud.getEnroll());
			return stud.getEnroll();
		}
	}

	public List<Student> searchyear(String enroll) {

		Session session = hibernateSessionFactory.openSession();

		/*Query qry = session.createQuery("select * from student where enroll like '%2017';");
*/
		
		Criteria criteria=session.createCriteria(Student.class);
		criteria.add((Restrictions.like("enroll", "%2017")));
		List list=criteria.list();
		
	/*	List<Student> list1 = qry.list();*/
		session.beginTransaction().commit();
		System.out.println(""+list);
		return list;
	}
}
