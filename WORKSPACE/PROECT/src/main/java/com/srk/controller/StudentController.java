package com.srk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.srk.model.Student;

@RestController
public class StudentController {
	@GetMapping("/display")
	public void saveStudentDetails(@RequestBody() Student std) {
		System.out.println("Student id: "+std.getStd_id());
		System.out.println("Student Name: "+std.getName());
		System.out.println("Student Gender: "+std.getGender());
		System.out.println("Student Email: "+std.getEmail());
	}
}
