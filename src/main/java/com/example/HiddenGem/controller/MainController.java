package com.example.HiddenGem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
public class MainController {
	/*
	 * main test
	 */
	@GetMapping("/main")
	public String mainForm() {
		return "/main";
	}
}
