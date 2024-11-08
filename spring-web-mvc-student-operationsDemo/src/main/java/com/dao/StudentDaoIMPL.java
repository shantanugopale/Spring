package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Student;

@Repository
public class StudentDaoIMPL implements StudentDao {

	@Autowired
	private SessionFactory factory;

	public void saveStudent(Student stu) {

		System.out.println("Student Dao Called....");
		Session session = factory.openSession();
		session.save(stu);
		session.beginTransaction().commit();
		System.out.println("Record Saved..!");
	}

	public List<Student> getAllStudent() {
		Session session = factory.openSession();
		String hql = "from Student";
		Query q = session.createQuery(hql);
		return q.getResultList();
	}

	public List<Student> deleteById(int rno) {
		Session session = factory.openSession();
		Student stu = session.get(Student.class, rno);
		session.delete(stu);
		session.beginTransaction().commit();
		return getAllStudent();
	}

	public Student getStudentById(int rno) {
		Session session = factory.openSession();
		Student stu = session.get(Student.class, rno);
		return stu;
	}

	public List<Student> updateStudent(Student stu) {
		Session session = factory.openSession();
		session.update(stu);
		session.beginTransaction().commit();
		return getAllStudent();
	}

}
