package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.StudentRepository;
import com.model.Student;

@Service
public class StudentServiceIMPL implements StudentService {

	@Autowired
	private StudentRepository repo;

	public void saveStudent(Student stu) {
		System.out.println("StudentService Called......" + stu);
		repo.save(stu);
	}

	public List<Student> loginCheck(String username, String password) {
		if (username.equals("Shantanu") && password.equals("1234")) {
			return repo.findAll();
		} else {

			return new ArrayList<Student>();
		}

	}

	public List<Student> deleteById(int rno) {

		repo.deleteById(rno);
		return repo.findAll();
	}

	public Student getStudentById(int rno) {

		return repo.findById(rno).get();
	}

	public List<Student> updateStudent(Student stu) {
		repo.save(stu);
		return repo.findAll();
	}
}
