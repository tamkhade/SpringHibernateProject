package com.service;

import java.util.List;

import com.dao.Idao;
import com.dto.Dto;
import com.model.Student;

public class Service implements Iservice{

	
	Idao idao;
	
	
	

	public List<Student> getStudentList() {
		return idao.getStudentList();
	}


	public boolean addStudent(Student student) {
		
	
		System.out.println("successful");
			return idao.addStudent(Dto.transformstudent(student));
			
		
	}

	public Student getStudent(int id) {
		return idao.getStudent(id);
	}
	
	public String getMaxEnroll(){
		//dto.createEnrollno();
		return idao.getMaxEnroll();
	}


	


	public Student addStudent1(Student student) {
		// TODO Auto-generated method stub
		return idao.addStudent1(student);
	}
	
	
}
