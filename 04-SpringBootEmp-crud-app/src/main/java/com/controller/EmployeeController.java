package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
//	@RequestMapping("/save-emp")
	@PostMapping("/")
	public Employee save(@RequestBody Employee emp)
	{
		service.save(emp);
		return new Employee();
	}
	
//	@RequestMapping("/getAllEmp")
	@GetMapping("/")
	public List<Employee> getAllEmployee()
	{
		List<Employee> eList = service.getAllRecords();
		return eList;
	}
	
//	@RequestMapping("/getEmpById/{eid}")
	@GetMapping("/{eid}")
	public Employee getEmpById(@PathVariable int eid)
	{
		Employee emp = service.getEmpById(eid);
		return emp;
	}
	
//	@RequestMapping("/deleteById/{eid}")
	@DeleteMapping("/{eid}")
	public Employee deleteById(@PathVariable int eid)
	{
		Employee emp = service.deleteById(eid);
		return emp;
	}
	
//	@RequestMapping("/updateRecord")
	@PutMapping("/")
	public Employee updateRecord(@RequestBody Employee emp)
	{
		service.updateRecord(emp);
		return new Employee();
	}
	
}
