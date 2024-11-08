package com.dao;

import java.util.List;

import com.model.Student;


public interface StudentDao {
	void saveStudent(Student stu);

	List<Student> getAllStudent();

	List<Student> deleteById(int rno);

	Student getStudentById(int rno);

	List<Student> updateStudent(Student stu);
}
