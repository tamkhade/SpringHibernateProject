package com.service;

import java.util.List;

import com.model.Student;

public interface Iservice {

	
	
	public List<Student> getStudentList();
	public boolean addStudent(Student student);
	
	public Student getStudent(int id);
	public String getMaxEnroll();
	public Student addStudent1(Student student);
}
