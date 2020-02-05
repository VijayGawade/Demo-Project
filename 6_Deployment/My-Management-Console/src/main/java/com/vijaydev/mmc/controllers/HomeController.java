package com.vijaydev.mmc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping({"/","/home","/index"})
	public String getHomePage() {
		System.out.println("Home Controller called... return home page");
		return "HomePage";
	}
}
