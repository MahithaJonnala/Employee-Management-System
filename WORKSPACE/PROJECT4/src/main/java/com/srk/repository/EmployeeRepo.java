package com.srk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.srk.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long>{


 

}