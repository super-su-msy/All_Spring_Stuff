package com.karan.ssl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BuildHttpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuildHttpsApplication.class, args);
	}
	
	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable String name) {
	return "Howdy " + name + ", have a good day!!";
	}
}
