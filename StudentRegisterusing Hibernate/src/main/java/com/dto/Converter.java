package com.dto;

import java.util.ArrayList;
import java.util.List;

import com.dao.Idao;
import com.model.Batch;
import com.model.Student;

public class Converter {

/*Idao idao;

	public  String getuniqueid(){
		
	
		int enrollno=idao.getMax();
	
			int x=enrollno;
			int a=1;
		     
			String s = Integer.toString(x);
			String s1 = Integer.toString(a);
			String stud1=a+"-"+x;
		
		return stud1;

}
*/	
	
	
	
	
	
	
	public static Student transferStudentFormToDto(Student student){
		
		
		Student stud=new Student();
		stud.setS_id(student.getS_id());
		stud.setName(student.getName());
		stud.setEnroll(student.getEnroll());
		List<Batch> batch_List = new ArrayList<Batch>();
		List<Batch> batch1 = student.getBatch_list();
		for(Batch batch:batch1)
		{
			Batch batch11=new Batch();
			batch11.setId(batch.getId());
			batch11.setGrade(batch.getGrade());
			batch11.setPercentage(batch.getPercentage());
			batch11.setYear(batch.getYear());
			batch11.setStudent(batch.getStudent());
			batch_List.add(batch11);
	
		}
		
		stud.setBatch_list(batch_List);
		return stud;
	}
	
	
}

