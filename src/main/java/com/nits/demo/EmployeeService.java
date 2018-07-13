package com.nits.demo;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class EmployeeService {
	
	public ModelAndView save(Employee emp) {
		ModelAndView model = new ModelAndView("success");
		System.out.println("Inside Emp service");
	    return model;	    		
	}

}
