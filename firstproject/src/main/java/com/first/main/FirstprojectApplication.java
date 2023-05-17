package com.first.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.first.main.dl.EmployeeRepo;
import com.first.main.model.Employee;

@SpringBootApplication
public class FirstprojectApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(FirstprojectApplication.class, args);
		EmployeeRepo repo	=context.getBean(EmployeeRepo.class);
	
		Employee employee=new Employee();
		employee.setFirstname("sita");
		employee.setCityname("mandsaur");
		Employee e=repo.save(employee);
		System.out.println(e);
	}

}
