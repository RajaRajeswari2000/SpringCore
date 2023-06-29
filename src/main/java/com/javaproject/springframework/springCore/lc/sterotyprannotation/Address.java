package com.javaproject.springframework.springCore.lc.sterotyprannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("VKS apartment")
	private String firstline;
	@Value("Thanjavur")
	private String city;

	public String getFirstline() {
		return firstline;
	}

	public void setFirstline(String firstline) {
		this.firstline = firstline;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [firstline=" + firstline + ", city=" + city + "]";
	}

}
