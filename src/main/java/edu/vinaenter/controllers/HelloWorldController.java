package edu.vinaenter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {

	@RequestMapping(method = RequestMethod.GET, value = "/hello")
	public String index(ModelMap map) {
		map.addAttribute("msg", "Nguyen Van Dinh");
		return "hello";
	}

}
