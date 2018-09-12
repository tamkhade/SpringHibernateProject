package com.dto;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.model.Batch;
import com.model.Student;

public class Dto {

	// public static Student transformstudent(Student student){

	/*
	 * Student stud=new Student(); List<Student> studentlist=new
	 * ArrayList<Student>();
	 * 
	 * stud.setS_id(student.getS_id()); stud.setEnroll(student.getEnroll());
	 * stud.setName(student.getName()); studentlist.add(stud);
	 * 
	 * 
	 * 
	 * 
	 * 
	 * Batch batch1=new Batch(); List<Batch> batchlist= new ArrayList<Batch>();
	 * List<Batch> newBatchlist = student.getBatch_list(); for(Batch
	 * b:newBatchlist) { Batch B2=new Batch(); B2.setId(b.getId());
	 * B2.setGrade(b.getGrade()); B2.setPercentage(b.getPercentage());
	 * B2.setYear(b.getYear()); B2.setStudentlist(studentlist);
	 * batchlist.add(B2);
	 * 
	 * }
	 * 
	 * 
	 * 
	 * }
	 */

	public static Student transformstudent(Student student) {
		Student s1 = new Student();
		s1.setName(student.getName());
		//s1.setS_id(student.getS_id());
		s1.setEnroll(student.getEnroll());

		List<Student> stuslist = new ArrayList<Student>();
		stuslist.add(s1);

		List<Batch> batch_list = new ArrayList<Batch>();

		List<Batch> newBatchlist = student.getBatch_list();
		for (Batch b : newBatchlist) {
			Batch B2 = new Batch();
		//	B2.setId(b.getId());
			B2.setGrade(b.getGrade());
			B2.setPercentage(b.getPercentage());
			B2.setYear(b.getYear());
			B2.setStudentlist(stuslist);

			batch_list.add(B2);
		}
		s1.setBatch_list(batch_list);

		return s1;

	}
	
	public static String combine(String no) {

		int year = Calendar.getInstance().get(Calendar.YEAR);
		

		if (no == null) {
			String x = "1";
			String y = String.valueOf(year);
			String z = "-";
			String n1 = x + z + y;
			return n1;

		} else {
			String i[] = no.split("-");
			String part1 = i[0];
			String part2 = i[1];
			int p1 = Integer.valueOf(part1);
			int p2 = Integer.valueOf(part2);
			int x1 = p1 + 1;
			
			if (year != p2) {
				String x="1";
				String y=String.valueOf(year);
				String z="-";
				String n1=x+z+y;
				return n1;
			}
			else{
				String s1 = String.valueOf(x1);
				String s2 = String.valueOf(p2);
				String s3 = "-";
				String s4 = s1 + s3 + s2;
				return s4;

			}
		}
	

	}


}
