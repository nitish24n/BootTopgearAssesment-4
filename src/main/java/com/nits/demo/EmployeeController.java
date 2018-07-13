package com.nits.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	
	@Autowired
	EmployeeRepository empRepo;
	
	@RequestMapping(value="/",method = RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView model = new ModelAndView("index");
		return model;
	}
	
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public ModelAndView save(@RequestParam("id") String id,@RequestParam("name") String name,@RequestParam("email") String email,@RequestParam("location") String location) {
		empRepo.save(new Employee(id, name, email, location));
		ModelAndView model = new ModelAndView("success");
	    return model;
	}
}
