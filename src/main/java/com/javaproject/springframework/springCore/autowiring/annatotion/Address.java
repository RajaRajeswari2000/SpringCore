package com.javaproject.springframework.springCore.autowiring.annatotion;

public class Address {
	private String firstline;
	private String city;
	private String country;

	public String getFirstline() {
		return firstline;
	}

	public void setFirstline(String firstline) {
		this.firstline = firstline;
	}

	@Override
	public String toString() {
		return "Address [firstline=" + firstline + ", city=" + city + ", country=" + country + "]";
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
