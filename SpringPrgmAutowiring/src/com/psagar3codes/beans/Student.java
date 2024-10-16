package com.psagar3codes.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {

	private int rollNo;
	private String name;
	
	@Autowired
	@Qualifier("getAddObj1")
	private Address address;
	
	@Autowired
	private Subjects sub;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void display() {
		System.out.println("Roll No :" + rollNo);
		System.out.println("Name :" + name);
		System.out.println("Address :" + address);
		System.out.println("Subjects :" + sub);

	}
}
