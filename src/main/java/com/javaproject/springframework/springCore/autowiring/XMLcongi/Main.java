package com.javaproject.springframework.springCore.autowiring.XMLcongi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext(
				"com/javaproject/springframework/springCore/autowiring/XMLcongi/RefConfig.xml")) {
		    System.out.println(cxt.getBean(Employees.class).getName());
			System.out.println(cxt.getBean(Employees.class).getId());
			System.out.println(cxt.getBean(Employees.class).toString());
			System.out.println(cxt.getBean(Employees.class).getAddress());
			System.out.println(cxt.getBean(Employees.class).getMailid());
			/*Employees employee = (Employees) cxt.getBean("employee");// introducing bean scope
			System.out.println(employee.getId());
			System.out.println(employee.getAddress());*/
			
		
		}
	}
}
