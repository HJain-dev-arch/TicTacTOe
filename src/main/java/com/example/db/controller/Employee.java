package com.example.db.controller;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Employ")
public class Employee extends AuditModel{
	
	@Id
	private int empId;
	private String empName;
	private String empDesignation;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<Course> course;
	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public Employee(int empId,String empName, String empDesignation, List<Course> course) {
		this.empId=empId;
		this.empName = empName;
		this.empDesignation = empDesignation;
		this.course = course;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
