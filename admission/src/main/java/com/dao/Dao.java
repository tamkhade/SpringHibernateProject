package com.dao;

import java.util.List;

import javax.swing.text.StyledEditorKit.BoldAction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;

import com.model.Student;

public class Dao implements Idao {
	@Autowired
	SessionFactory hibernateSessionFactory;

	public boolean addStudent(Student student) {
	
		Session session =hibernateSessionFactory.openSession();
	
		session.saveOrUpdate(student);
		session.beginTransaction().commit();
		return session.beginTransaction().wasCommitted();
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
	
	public String getMaxEnroll(){
		Session session = hibernateSessionFactory.openSession();
		
		org.hibernate.Criteria criteria = session
			    .createCriteria(Student.class)
			    .setProjection(Projections.max("id"));
			Integer maxId = (Integer)criteria.uniqueResult();
			Student stud= ( Student) session.load( Student.class, maxId);
			System.out.println(stud.getEnroll());
			return stud.getEnroll();
	}

	public Student addStudent1(Student student) {
		// TODO Auto-generated method stub
		System.out.println("sucess");
		Session session =hibernateSessionFactory.openSession();
		session.saveOrUpdate(student);
		System.out.println("sucess");
		session.beginTransaction().commit();
		return student;
	}

}
