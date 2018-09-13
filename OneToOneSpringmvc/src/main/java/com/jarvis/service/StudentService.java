package com.jarvis.service;

import java.util.List;

import com.jarvis.model.Student;

public interface StudentService {
	public void addStudent(Student student);

	public List<Student> getStudentList();
	public Student studentEdit(long id);
	public void studentDelete(long id);
}
