package com.service;

import java.util.List;

import com.model.Student;

public interface StudentService {
	
	void saveStudent(Student stu);

	List<Student> loginCheck(String username, String password);

	List<Student> deleteById(int rno);

	Student getStudentById(int rno);

	List<Student> updateStudent(Student stu);
}
