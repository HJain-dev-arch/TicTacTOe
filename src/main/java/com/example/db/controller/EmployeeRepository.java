package com.example.db.controller;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface EmployeeRepository extends CrudRepository<Employee,Integer>{
	public Employee findByEmpName(String name);
	
	@Query("Seclect * from Employ left join empcourseassign on Employ.empId=empcourseassign.id")
	public List<Employee> getAllRegistered();
	
}
