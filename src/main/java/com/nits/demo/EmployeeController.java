package com.nits.demo;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	
	//Setting the index page to "/"
	@RequestMapping(value="/",method = RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView model = new ModelAndView("index");
		return model;
	}
	
	//Save the form 
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public ModelAndView save(@RequestParam("id") String id,@RequestParam("name") String name,@RequestParam("email") String email,@RequestParam("location") String location) {
		empService.saveForm(new Employee(id, name, email, location));
		ModelAndView model = new ModelAndView("UserDetails");
	    return model;
	}
	
	//Display all the database results in table
	@RequestMapping(value="/displayAll",method = RequestMethod.GET)
	public ModelAndView displayAll() {
		List<Employee> empList = empService.getEmployees();
		System.out.println("emplist "+empList);
		return new ModelAndView("employeesList","empList",empList);	
	}
	
	//Display data as per Id provided in URL
	@RequestMapping(value="/display/{id}",method = RequestMethod.GET)
	public ModelAndView displayOne(@PathVariable("id") String userId) {
		Optional<Employee> emp = empService.getEmpById(userId);
		if(emp.isPresent()) {
			return new ModelAndView("UserDetails","emp",emp.get());
		}else {
			return new ModelAndView("InvalidRequest");
		}
	}
}
