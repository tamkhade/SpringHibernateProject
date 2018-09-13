package com.jarvis.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jarvis.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private SessionFactory hibernateSessionFactory;

	public void addStudent(Student student) {
		Session session = hibernateSessionFactory.openSession();
		session.save(student);
		session.beginTransaction().commit();
		System.out.println("done");

	}

	public List<Student> getStudentList() {
		Session session = hibernateSessionFactory.openSession();
		return session.createCriteria(Student.class).list();
	}
	public Student studentEdit(long id) {
		Student student=null;
		try {
			
			Session session = hibernateSessionFactory.openSession();
			student=(Student) session.load(Student.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return student;
	}
	public void studentDelete(long id) {
		try {
			Session session = hibernateSessionFactory.openSession();
			Student student=(Student) session.load(Student.class, id);
			System.out.println(student.getFirstName());
			if(student!=null)
			{
				session.delete(student);
				session.beginTransaction().commit();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
