package com.srk.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HomeController {
	@GetMapping("/first")
	public String first() {
		return "first request";
	}
	@GetMapping("/second")
	public String second() {
		return "second request";
	}
	@GetMapping("/add")
	public String add(@RequestParam("name") String name) {
		return "Hello"+ name;
	}
	@GetMapping("/add1")
	public String add1(@RequestParam("marks") int marks) {
		return "Your score is: "+ marks;
	}
	@GetMapping("/sum/{num1}/{num2}")
	public String add2(@PathVariable("num1") int num1,@PathVariable("num2") int num2) {
		return "sum is: "+(num1+num2);
	}
}
