package com.simplilearn.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.model.Greet;

@RestController
// @Controller + @ResonseBody
public class GreetController {

	// @GetMapping("/greetMe")
	@RequestMapping(value = "/greetMe", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Greet greet() {
		Greet greet = new Greet();

		greet.setMessage("Hey Learners!");
		greet.setName("Simplilearn");

		return greet;
	}

	@RequestMapping(value = "/calculate", method = RequestMethod.GET)
	public Integer calculate() {
		int a = 5;
		int b = 0;
		int c = a / b;

		return c;
	}

}
