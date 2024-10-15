package com.psagar3codes.beans;

public class Student {

	private int rollNo;
	private String name;
	private Address address;
	
	public Student(int rollNo, String name, Address address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}
	
	public void display() {
		System.out.println("Roll No :"+rollNo);
		System.out.println("Name :"+name);
		System.out.println("Address :"+address);

	}
}
