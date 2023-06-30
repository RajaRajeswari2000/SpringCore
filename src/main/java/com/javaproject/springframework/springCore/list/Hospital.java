package com.javaproject.springframework.springCore.list;
import java.util.List;
import java.util.LinkedList;
public class Hospital {
List<String> name=new LinkedList<String>();
List<String> departments=List.of();
public List<String> getName() {
	return name;
}
public void setName(List<String> name) {
	this.name = name;
}
public List<String> getDepartments() {
	return departments;
}
public void setDepartments(List<String> departments) {
	this.departments = departments;
}

}