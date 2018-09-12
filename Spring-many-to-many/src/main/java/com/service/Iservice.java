package com.service;

import java.util.List;

import com.model.Student;

public interface Iservice {

	
	public boolean addstudent(Student student);
	public String getMaxEnroll();
	public List<Student> searchyear(String enroll);
}
