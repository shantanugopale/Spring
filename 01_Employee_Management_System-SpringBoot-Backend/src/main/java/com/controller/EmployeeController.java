package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Employee;
import com.service.EmployeeService;

@RestController // It Returns Data
@RequestMapping("/emp-data") // To Maintain Single End-Point
@CrossOrigin("*")
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@PostMapping("/")
	public ResponseEntity<Employee> save(@RequestBody Employee emp) {
		return service.save(emp);
	}

	@GetMapping("/")
	public ResponseEntity<List<Employee>> getAllEmployee() {
		return service.getAllRecords();
	}

	@GetMapping("/{eid}")
	public ResponseEntity<Employee> getEmpById(@PathVariable int eid) {
		return service.getEmpById(eid);
	}

	@DeleteMapping("/{eid}")
	public ResponseEntity<Employee> deleteById(@PathVariable int eid) {
		return service.deleteById(eid);
	}

	@PutMapping("/")
	public ResponseEntity<Employee> updateRecord(@RequestBody Employee emp) {
		return service.updateRecord(emp);
	}

}
