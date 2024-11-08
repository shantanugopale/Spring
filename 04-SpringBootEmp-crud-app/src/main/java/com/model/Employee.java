package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	private int eid;
	private String name;
	private long mono;
	private double salary;
	private int age;

	public Employee() {
	}

	public Employee(int eid, String name, long mono, double salary, int age) {
		super();
		this.eid = eid;
		this.name = name;
		this.mono = mono;
		this.salary = salary;
		this.age = age;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMono() {
		return mono;
	}

	public void setMono(long mono) {
		this.mono = mono;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", mono=" + mono + ", salary=" + salary + ", age=" + age
				+ "]";
	}
}
