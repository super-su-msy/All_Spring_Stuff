package com.karan.ssl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/con")
public class HomeController {

	@RequestMapping("/all")
	public String Getname() {
		return "Karan";
	}
}
