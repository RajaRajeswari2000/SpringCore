package com.javaproject.springframework.springCore.map;

import java.util.Map;

public class Customer {
	private String id;
	private Map<Integer, String> products = Map.of();
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Map<Integer, String> getProducts() {
		return products;
	}
	public void setProducts(Map<Integer, String> products) {
		this.products = products;
	}

	

}