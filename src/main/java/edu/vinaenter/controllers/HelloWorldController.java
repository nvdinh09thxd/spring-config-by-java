package edu.vinaenter.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.vinaenter.models.Country;
import edu.vinaenter.models.Student;

@Controller
public class HelloWorldController {
	
	@Autowired
	@Qualifier("country1")
	private Country country1;
	

	@Bean(name = "country3")
	public Country country33() {
		Country country = new Country("Da Nang 3");
		return country;
	}
	@Autowired
	@Qualifier("country3")
	private Country country3;
	
	@Autowired
	private Student student;

	@RequestMapping(method = RequestMethod.GET, value = "/hello")
	public String index(ModelMap map) {
		map.addAttribute("country1", country1);
		map.addAttribute("country3", country3);
		map.addAttribute("student", student);
		return "hello";
	}

}
