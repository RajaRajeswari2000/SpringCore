package com.javaproject.springframework.springCore.autowiring.constructor;

public class Employees {
	private int id;
	private String name;
	private Address address;
	private Email mailid;

	public Employees(int id, String name, Address address, Email mailid) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.mailid = mailid;
	}

	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", address=" + address + ", mailid=" + mailid + "]";
	}

}
