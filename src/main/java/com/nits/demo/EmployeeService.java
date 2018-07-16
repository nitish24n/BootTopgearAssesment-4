package com.nits.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository empRepo;
	
	public void saveForm(Employee emp) {
		empRepo.save(emp);
	}
	
	public List<Employee> getEmployees() {
		List<Employee> empList = new ArrayList<>();
		empList = empRepo.findAll();
		return empList;
	}
	
	public Optional<Employee> getEmpById(String userId) {
		return empRepo.findById(userId);
	}

}
