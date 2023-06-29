package com.javaproject.springframework.springCore.references;

public class Employees {
	private int id;
	private String name;
	private Address firstline;

	@Override
	public String toString() {
		return "Employees [address=" + firstline + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return firstline;
	}

	public void setAddress(Address firstline) {
		this.firstline = firstline;
	}
	
	

}
