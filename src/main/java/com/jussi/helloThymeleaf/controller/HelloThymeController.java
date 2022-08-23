package com.jussi.helloThymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloThymeController {

	@RequestMapping("/hello")
	public String sayHello(@RequestParam(value="name") String name, @RequestParam(value="age") int age, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		
		return "hello";
	}
}
