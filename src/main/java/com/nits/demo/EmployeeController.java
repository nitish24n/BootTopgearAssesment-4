package com.nits.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class EmployeeController {
	
	@RequestMapping(value="/",method = RequestMethod.GET)
	public String home() {
		return "index";
	}
	
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public ModelAndView save(@RequestParam("id") String id,@RequestParam("name") String name,@RequestParam("email") String email,@RequestParam("location") String location) {
		System.out.println("Saving the form...!!");
		ModelAndView model = new ModelAndView("success");
	    System.out.println("Model and view ---- "+name+ "   "+ id);
	    return model;
	    		
	}
}
