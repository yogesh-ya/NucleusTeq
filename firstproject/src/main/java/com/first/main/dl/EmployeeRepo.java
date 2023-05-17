package com.first.main.dl;

import org.springframework.data.jpa.repository.JpaRepository;

import com.first.main.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
