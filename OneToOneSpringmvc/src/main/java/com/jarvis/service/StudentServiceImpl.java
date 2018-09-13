package com.jarvis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.jarvis.dao.StudentDao;
import com.jarvis.model.Student;

public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentDao studentdao;

	public void addStudent(Student student) {
		studentdao.addStudent(student);

	}

	public List<Student> getStudentList() {

		return studentdao.getStudentList();

	}
	public Student studentEdit(long id) {
		
		return studentdao.studentEdit(id);
	}
	public void studentDelete(long id) {
		studentdao.studentDelete(id);
		
	}
}
