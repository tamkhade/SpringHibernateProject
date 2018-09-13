package com.jarvis.dao;

import java.util.List;

import com.jarvis.model.Student;

public interface StudentDao {
	public void addStudent(Student student);

	public List<Student> getStudentList();
	public Student studentEdit(long id);
	public void studentDelete(long id);


}
