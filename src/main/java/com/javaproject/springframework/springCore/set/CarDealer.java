package com.javaproject.springframework.springCore.set;

import java.util.Set;
import java.util.TreeSet;

public class CarDealer {
	private String name;
	Set<String> models = new TreeSet<String>();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<String> getModels() {
		return models;
	}
	public void setModels(Set<String> models) {
		this.models = models;
	}
	

	
}
