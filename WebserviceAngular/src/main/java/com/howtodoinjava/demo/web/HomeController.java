package com.howtodoinjava.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/home")
	public void getEmployeeById() {

		System.out.println("Hello");

	}

}
