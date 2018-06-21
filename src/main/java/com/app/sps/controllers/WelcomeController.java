package com.app.sps.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@RequestMapping("/")
	public String welcomeToApplicaton()
	{
		return "Welcome To Application";
	}

}
