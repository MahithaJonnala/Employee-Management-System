package com.srk.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HomeController {
	@GetMapping("/firstrequest")
	public String firstrequest() {
		return "welcome to workshop";
	}
	@GetMapping("/secondrequest")
	public String secondrequest() {
		return "secondrequest";
	}

}
