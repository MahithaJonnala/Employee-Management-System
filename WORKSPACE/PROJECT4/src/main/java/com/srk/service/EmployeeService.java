package com.srk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srk.entity.Employee;
import com.srk.repository.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo employeeRepo;
	
	public String saveEmployee(Employee emp) {
		
		employeeRepo.save(emp);
		
		return "employee record inserted successfully";
	}

	public String deleteEmpById(long eid) {
		
		employeeRepo.deleteById(eid);
		return "Employee record deleted successfully";
	}

	public List<Employee> getAllEmployees() {
		
		List<Employee> emp=employeeRepo.findAll();
		return emp;
	}

	public String updateEmployee(Employee emp) {
		
		Employee emp1=employeeRepo.findById(emp.getEid()).get();
		
		emp1.setCompanyname(emp.getCompanyname());
		emp1.setEmail(emp.getEmail());
		emp1.setName(emp.getName());
		
		employeeRepo.save(emp1);
		return "Employee record updated successfully";
	}

}

