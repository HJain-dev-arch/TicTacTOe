package com.example.db.controller;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="empcourseassign")
public class Course {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String courseId;
	private int months;
	private String type;
	private String platform;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="emp_id")
	private Employee employee;
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(String courseId, int months, String type, String platform,Employee employee) {
		this.courseId = courseId;
		this.months = months;
		this.type = type;
		this.platform = platform;
		this.employee = employee;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public int getMonths() {
		return months;
	}
	public void setMonths(int months) {
		this.months = months;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}
