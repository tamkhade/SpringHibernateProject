package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;

import com.model.Student;

public class DaoImpl implements Idao{
	@Autowired
	SessionFactory hibernateSessionFactory;

	public Student addStudent(Student student) {
		Session session =hibernateSessionFactory.openSession();
		session.saveOrUpdate(student);
		session.beginTransaction().commit();
		return student;
	}

	public Student getStudent(int id) {
		Session session = hibernateSessionFactory.openSession();
		return ( Student) session.load( Student.class, id);
	}

	public List<Student> getStudentList() {
		
			Session session = hibernateSessionFactory.openSession();
			List<Student> list = session.createCriteria(Student.class).list();
			return list;
			
	}

	public int getMax() {
		// TODO Auto-generated method stub
		
		Session session=hibernateSessionFactory.openSession();
		org.hibernate.Criteria criteria=session.createCriteria(Student.class)
				.setProjection(Projections.max("id"));
		Integer maxId=(Integer) criteria.uniqueResult();
		Student stud=(Student) session.load( Student.class,maxId);
		return stud.getEnroll();
	}
}
