package com.javaproject.springframework.springCore.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext(
				"com/javaproject/springframework/springCore/list/Configuration.xml");
		System.out.println(cxt.getBean(Hospital.class).getName());
		System.out.println(cxt.getBean(Hospital.class).getDepartments());
		System.out.println(cxt.getBean(Hospital.class).getDepartments().getClass());// get the type of list
	}

}
