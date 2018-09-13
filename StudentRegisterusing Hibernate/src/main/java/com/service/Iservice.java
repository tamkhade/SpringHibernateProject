package com.service;

import java.util.List;

import com.model.Student;

public interface Iservice {
	public List<Student> getStudentList();
	public Student addStudent(Student student);
	
	public Student getStudent(int id);
	public int getMax();
}
