package com.test.sb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/")
public class HomeController {

	@GetMapping("/home")
	public String hello() {
		return new String("Hello world!");
	}
}
