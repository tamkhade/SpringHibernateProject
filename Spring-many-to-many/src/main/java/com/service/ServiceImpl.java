package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.Idao;
import com.dto.Dto;
import com.model.Batch;
import com.model.Student;

public class ServiceImpl implements Iservice {

	@Autowired
	Idao idao;

	public boolean addstudent(Student student) {
		return idao.addstudent(Dto.transformstudent(student));
	}

	public String getMaxEnroll() {
		return idao.getMaxEnroll();
	}
	public List<Student> searchyear(String enroll){
		return idao.searchyear(enroll);
	}
}
