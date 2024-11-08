package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.dao.EmployeeRepository;
import com.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repo;

	public ResponseEntity<Employee> save(Employee emp) {

		if (repo.existsById(emp.getEid())) {
			return new ResponseEntity<Employee>(repo.save(emp), HttpStatus.ALREADY_REPORTED);
		} else {
			return new ResponseEntity<Employee>(repo.save(emp), HttpStatus.OK);
		}
	}

	public ResponseEntity<List<Employee>> getAllRecords() {

		return new ResponseEntity<List<Employee>>(repo.findAll(), HttpStatus.OK);
	}

	public ResponseEntity<Employee> getEmpById(int eid) {
		if (repo.existsById(eid)) {
			return new ResponseEntity<Employee>(repo.findById(eid).get(), HttpStatus.ACCEPTED);
		} else {
			return new ResponseEntity<Employee>(new Employee(), HttpStatus.BAD_REQUEST);
		}
	}

	public ResponseEntity<Employee> deleteById(int eid) {

		Optional<Employee> optional = repo.findById(eid);

		if (optional.isPresent()) {
			repo.deleteById(eid);
			return new ResponseEntity<Employee>(optional.get(), HttpStatus.ACCEPTED);
		} else {
			return new ResponseEntity<Employee>(new Employee(), HttpStatus.BAD_REQUEST);
		}
	}

	public ResponseEntity<Employee> updateRecord(Employee emp) {

		if (repo.existsById(emp.getEid())) {
			return new ResponseEntity<Employee>(repo.save(emp), HttpStatus.ACCEPTED);
		} else {
			return new ResponseEntity<Employee>(emp, HttpStatus.CONFLICT);
		}
	}
}