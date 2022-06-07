package com.example.db.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DBController {
	
	@Autowired
	EmployeeServices service;
	
	
	@RequestMapping("/employees")
	public ResponseEntity<List<Employee>> getEmployee()
	{
		return service.getAllEmployees();
	}
	@RequestMapping("/employees/{empName}/courses")
	public List<Course> getEmployee(@PathVariable(value="empName") String empName)
	{
		return service.getEmployees(empName);
	}
	@RequestMapping(method=RequestMethod.POST,value="/EmpAdd")
	public void addEmployee(@RequestBody Employee employee)
	{
		service.addEmployee(employee);
	}
	
	/*@RequestMapping(method=RequestMethod.POST,value="/course/create")
	public void addEmployeeCourse(@RequestBody Employee employee)
	{
		employee.getCourse().forEach((courses)->{
			System.out.println(courses.getCourseId());});
	}
	@RequestMapping(method=RequestMethod.POST,value="/create")
	/*public void addCourse(@RequestBody List<Course> course)
	{
		course.forEach((courses)->{
			System.out.println(courses.getCourseId()+" "+courses.getTopic());});
	}*/
	@RequestMapping(method=RequestMethod.POST,value="/employeeName/{empId}/course")
	public ResponseEntity<List<Course>> addCourse(@PathVariable(value="empId") int empId, @RequestBody List<Course> course)
	{
		return service.addEmployeeCourse(empId,course);
		//return new ResponseEntity<>(,HttpStatus.CREATED);
	}
}
