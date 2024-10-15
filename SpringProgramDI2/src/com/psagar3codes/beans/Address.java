package com.psagar3codes.beans;

public class Address {
	private int houseNo;
	private String city;
	private int pinCode;
	
	
	public Address(int houseNo, String city, int pinCode) {
		super();
		this.houseNo = houseNo;
		this.city = city;
		this.pinCode = pinCode;
	}


	@Override
	public String toString() {
		return "houseNo=" + houseNo + ", city=" + city + ", pinCode=" + pinCode;
	}
}
