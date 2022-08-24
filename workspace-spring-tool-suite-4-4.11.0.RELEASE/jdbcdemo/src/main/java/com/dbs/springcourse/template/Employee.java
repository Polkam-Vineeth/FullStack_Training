package com.dbs.springcourse.template;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	private int id, salary;
	private String name;
	public Employee() {
		super();
	}

	public Employee(int id, int salary, String name) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	public void display() {
		System.out.println("Hey! This is Vineeth!!");
	}
}
