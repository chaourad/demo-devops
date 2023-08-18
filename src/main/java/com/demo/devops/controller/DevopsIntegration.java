package com.demo.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevopsIntegration {
	
	@GetMapping
	public String message() {
		return "welcome ";
	}

}
