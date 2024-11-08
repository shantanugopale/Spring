package com;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.dao.EmployeeRepository;
import com.model.Employee;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		
		EmployeeRepository repo = context.getBean(EmployeeRepository.class);
		
//		findAll(repo);
		
//		findByNameAndAge(repo);
		
//		findByNameOrAge(repo);
		
//		findByName(repo);
		
//		findByNameIs(repo);
		
//		findByNameEquals(repo);
		
//		findBySalaryBetween(repo);
		
//	 	findByAgeLessThan(repo);
		
//		findByLessThanEqual(repo);
	 	
//	 	findByGreaterThan(repo);
	 	
//	 	findByGreaterThanEqual(repo);
		 
//		findByAgeAfter(repo);
		
//		findByAgeBefore(repo);
		
//		findByNameLike(repo);
		
//		findByNameIgnoreCase(repo);
		
//		findByAgeIn(repo);
		
	}

	private static void findByAgeIn(EmployeeRepository repo) {
		List<Integer> ageList = Arrays.asList(30, 29, 28);
		List<Employee> eList = repo.findByAgeIn(ageList);
		System.out.println(eList);
	}

	private static void findByNameIgnoreCase(EmployeeRepository repo) {
		List<Employee> eList = repo.findByNameIgnoreCase("Alice");
		System.out.println(eList);
	}

	private static void findByNameLike(EmployeeRepository repo) {
		List<Employee> eList =  repo.findByNameLike("G%");
		System.out.println(eList);
	}

	private static void findByAgeBefore(EmployeeRepository repo) {
		List<Employee> eList =  repo.findByAgeBefore(30);
		System.out.println(eList);
	}

	private static void findByAgeAfter(EmployeeRepository repo) {
		List<Employee> eList =  repo.findByAgeAfter(30);
		System.out.println(eList);
	}

	private static void findByGreaterThanEqual(EmployeeRepository repo) {
		List<Employee> eList =  repo.findByAgeGreaterThanEqual(30);
	 	System.out.println(eList);
	}

	private static void findByGreaterThan(EmployeeRepository repo) {
		List<Employee> eList =  repo.findByAgeGreaterThan(30);
	 	System.out.println(eList);
	}

	private static void findByLessThanEqual(EmployeeRepository repo) {
		List<Employee> eList =  repo.findByAgeLessThanEqual(30);
	 	System.out.println(eList);
	}

	private static void findByAgeLessThan(EmployeeRepository repo) {
		List<Employee> eList =  repo.findByAgeLessThan(30);
	 	System.out.println(eList);
	}

	private static void findBySalaryBetween(EmployeeRepository repo) {
		List<Employee> eList =  repo.findBySalaryBetween(30000.0, 55000.0);
		System.out.println(eList);
	}

	private static void findByNameEquals(EmployeeRepository repo) {
		List<Employee> eList = repo.findByNameEquals("Charlie");
		System.out.println(eList);
	}

	private static void findByNameIs(EmployeeRepository repo) {
		List<Employee> eList = repo.findByNameIs("Eve");
		System.out.println(eList);
	}

	private static void findByName(EmployeeRepository repo) {
		List<Employee> eList = repo.findByName("Bob");
		System.out.println(eList);
	}

	private static void findByNameOrAge(EmployeeRepository repo) {
		List<Employee> eList = repo.findByNameOrAge("Alice", 28);
		System.out.println(eList);
	}

	private static void findByNameAndAge(EmployeeRepository repo) {
		List<Employee> eList = repo.findByNameAndAge("Alice", 28);
		System.out.println(eList);
	}

	private static void findAll(EmployeeRepository repo) {
		List<Employee> eList = repo.findAll();
		System.out.println(eList);
	}

}
