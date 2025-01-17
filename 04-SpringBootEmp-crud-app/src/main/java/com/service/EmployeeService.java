package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmployeeRepository;
import com.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repo;
	
	public void save(Employee emp) {
		repo.save(emp);
	}

	public List<Employee> getAllRecords() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public Employee getEmpById(int eid) {
		return repo.findById(eid).get();
	}

	public Employee deleteById(int eid) {
		Employee emp = repo.findById(eid).get();
		repo.deleteById(eid);
		return emp;
	}

	public void updateRecord(Employee emp) {
		repo.save(emp);
	}

	

	

}
