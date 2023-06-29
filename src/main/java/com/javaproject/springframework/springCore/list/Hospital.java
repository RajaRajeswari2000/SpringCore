package com.javaproject.springframework.springCore.list;
import java.util.List;
public class Hospital {
String name;
List<String> departments=List.of();
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<String> getDepartments() {
	return departments;
}
public void setDepartments(List<String> departments) {
	this.departments = departments;
}
}
