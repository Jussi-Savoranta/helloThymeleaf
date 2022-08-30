package com.jussi.helloThymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloThymeController {

	//@RequestMapping(value = "/hello", method = RequestMethod.GET)
	@GetMapping(value = "/hello") // shorter way but same as @RequesMapping(..GET)
	public String sayHello(@RequestParam(value="name") String name, @RequestParam(value="age") int age, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		
		return "hello";
	}
}
