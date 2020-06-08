package com.example.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
@RestController
public class HelloWorldController {
	@RequestMapping(value="/welcome")
	public ModelAndView hello() {
		return new ModelAndView("welcome","msg","Welcome to SpringBoot");
	}

}
