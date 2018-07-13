package com.nits.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository empRepo;
	
	public void saveForm(Employee emp) {
		empRepo.save(emp);
	}
	
	public List getEmployees() {
		System.out.println("Inside getEmployeess serveice --------------");
		List<Employee> empList = new ArrayList<>();
		empList = empRepo.findAll();
		System.out.println(empList);
		return empList;
	}

}
