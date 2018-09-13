package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.Idao;
import com.dto.Converter;
import com.model.Student;

public class ServiceImpl implements Iservice{
	@Autowired
	Idao idao;
	
	public List<Student> getStudentList() {
		return idao.getStudentList();
	}


	public Student addStudent(Student student) {
		
		
			return idao.addStudent((student));
		
	}

	public Student getStudent(int id) {
		return idao.getStudent(id);
	}


	public int getMax() {
		// TODO Auto-generated method stub
		return idao.getMax();
	}
}
