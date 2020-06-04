package com.springboot.example.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public class HomeController {
	
	@RequestMapping("/hi")
	public String Hello() {
		return "Hi Springboot";
	}
	
	@RequestMapping("/students")
	public StudentBean allStudents() {
		return new StudentBean(1,"First");
		
	}

}
