package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.service.EmployeeService;

@SpringBootApplication
public class Application {

	@Autowired
	EmployeeService service;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
	}

}
