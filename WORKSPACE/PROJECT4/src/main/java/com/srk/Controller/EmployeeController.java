package com.srk.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.srk.entity.Employee;
import com.srk.service.EmployeeService;
@RestController
	public class EmployeeController {

			@Autowired
			EmployeeService employeeService;
			//http://localhost:8080/savestd
			
			@PostMapping("/saveemp")
			public String saveEmployeeDetails(@RequestBody() Employee emp) {
				
				String str=employeeService.saveEmployee(emp);
				return str;
			}
			
			@DeleteMapping("/deleteemp")
			public String deleteEmpById(@RequestBody Employee emp) {
				
				String str=employeeService.deleteEmpById(emp.getEid());
				
				return str;
			}
			
			@GetMapping("/getallEmployees")
			public List<Employee> getEmployees(){
				
				List<Employee> emp=employeeService.getAllEmployees();
				
				return emp;
			}
			
			@PutMapping("/updateemp")
		    public String updateEmployeeDetails(@RequestBody Employee emp) {
				
				String str=employeeService.updateEmployee(emp);
				return str;
			}
			
		}
}
