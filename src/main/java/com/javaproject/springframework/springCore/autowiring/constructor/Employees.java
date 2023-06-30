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

	public Email getMailid() {
		return mailid;
	}

	public void setMailid(Email mailid) {
		this.mailid = mailid;
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
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", address=" + address + ", mailid=" + mailid + "]";
	}

}
