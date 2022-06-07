package com.example.db.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServices {

	@Autowired
	EmployeeRepository employee;

	@Autowired
	CourseRepository coursee;

	public ResponseEntity<List<Employee>> getAllEmployees() {
		List<Employee> employees = new ArrayList<>();
		employee.findAll().forEach(employees::add);
		return new ResponseEntity<>(employees, HttpStatus.OK);
	}

	public void addEmployee(Employee emp) {
		employee.save(emp);
	}

	public ResponseEntity<List<Course>> addEmployeeCourse(int Id, List<Course> course) {
		List<Course> employees = new ArrayList<>();
		employees = employee.findById(Id).get().getCourse();
		for (Course courses : course) {
			employees.add(courses);
			coursee.save(courses);
		}
		employee.findById(Id).get().setCourse(employees);
		return new ResponseEntity<>(employees, HttpStatus.CREATED);
	}

	public List<Course> getEmployees(String empName) {
		List<Course> employees = new ArrayList<>();
		employees = employee.findByEmpName(empName).getCourse();
		// coursee.findByEmployeeEmpName(empName).forEach(employees::add);
		return employees;
	}
}
