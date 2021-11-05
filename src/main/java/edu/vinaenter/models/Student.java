package edu.vinaenter.models;

public class Student {

	Country address;

	public Student(Country address) {
		this.address = address;
	}

	public Country getAddress() {
		return address;
	}

	public void setAddress(Country address) {
		this.address = address;
	}

	public void init() {
		System.out.println("init");
	}

	public void destroy() {
		System.out.println("destroy");
	}

}