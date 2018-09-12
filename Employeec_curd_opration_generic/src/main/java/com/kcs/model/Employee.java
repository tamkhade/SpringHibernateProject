package com.kcs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="employee")
public class Employee implements java.io.Serializable
{
	private static final long serialVersionUID = 4910225916550731446L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "empId", unique = true, nullable = false)
	private int empId;
	
	@Column(name = "empName", length = 50)
	private String empName;
	
	
	@Column(name = "empSalary")
	private Integer empSalary;
	
	private String empNames;
	
	public String getEmpNames() {
		return empNames;
	}

	public void setEmpNames(String empNames) {
		this.empNames = empNames;
	}

	public Employee() 
	{ }

	public Employee(int empId, String empName, Integer empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	
	public Employee(int empId) {
		super();
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(Integer empSalary) {
		this.empSalary = empSalary;
	}	
}