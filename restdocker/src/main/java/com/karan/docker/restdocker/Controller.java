package com.karan.docker.restdocker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@RequestMapping("/hi")
	public String getname() {
		return "Hello Docker";
	}
}
