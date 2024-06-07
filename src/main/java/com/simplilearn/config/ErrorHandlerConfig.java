package com.simplilearn.config;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorHandlerConfig {

	@ExceptionHandler(value = Exception.class)
	public String arithmaticHandler() {
		return "Internal Server error, please contact administrator";
	}
}
