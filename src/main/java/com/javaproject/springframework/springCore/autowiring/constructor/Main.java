package com.javaproject.springframework.springCore.autowiring.constructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext(
				"com/javaproject/springframework/springCore/autowiring/constructor/RefConfig.xml")) {
			Employees employee = (Employees) cxt.getBean("employees");// introducing bean scope
			System.out.println(employee.toString());
			//System.out.println(employee.getAddress());
			
		
		}
	}
}
