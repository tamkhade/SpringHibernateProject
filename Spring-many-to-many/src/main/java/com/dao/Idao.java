package com.dao;

import java.util.List;

import com.model.Batch;
import com.model.Student;

public interface Idao {
	
	public boolean addstudent(Student student);
	public String getMaxEnroll();
	public List<Student> searchyear(String enroll);
}
