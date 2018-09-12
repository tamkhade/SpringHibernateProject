package com.dto;

import java.util.ArrayList;
import java.util.List;

import com.model.Batch;
import com.model.Student;

public class Dto {

	/*public static Student transformstudent(Student student){
		
		Student s1=new Student();
		s1.setName(student.getName());
		s1.setS_id(student.getS_id());
		s1.setEnroll(student.getEnroll());
		
		List<Batch> list=new ArrayList<Batch>();
		
		List<Batch> list1=student.getBatch_list();
		System.out.println(list1);
		for(Batch list2:list1){
			
			Batch b1=new Batch();
		
			b1.setGrade(list2.getGrade());
			b1.setId(list2.getId());
			b1.setPercentage(list2.getPercentage());
			b1.setYear(list2.getYear());
			b1.setStudent(s1);
			
		 list.add(b1);
			
		}
		
		s1.setBatch_list(list);
		return s1;
	}
	
*/	
	public static Student transformstudent(Student student){
		Student s1= new Student();
		s1.setName(student.getName());
		if(student.getS_id()!=0){
		s1.setS_id(student.getS_id());}
		s1.setEnroll(student.getEnroll());
		
		List<Batch> batch_list = new ArrayList<Batch>();
		
		List<Batch> newBatchlist=student.getBatch_list();
		for(Batch b:newBatchlist){
			Batch B2=new Batch();
			if(b.getId()!=0){
			B2.setId(b.getId());}
			B2.setGrade(b.getGrade());
			B2.setPercentage(b.getPercentage());
			B2.setYear(b.getYear());
			B2.setStudent(s1);
			
			batch_list.add(B2);
		}
		s1.setBatch_list(batch_list);
		System.out.println(s1.toString());
		return s1;
		
	}

	
	
	
	
	
	
	
	
	
}
