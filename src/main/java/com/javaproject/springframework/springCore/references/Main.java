package com.javaproject.springframework.springCore.references;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext(
				"com/javaproject/springframework/springCore/references/RefConfig.xml")) {
			// System.out.println(cxt.getBean(Employees.class).getName().hashCode());
			// System.out.println(cxt.getBean(Employees.class).getId());
			// System.out.println(cxt.getBean(Employees.class).toString().hashCode());
			Employees employee = (Employees) cxt.getBean("employee");// introducing bean scope
			System.out.println(employee.hashCode());
			Employees employee1 = (Employees) cxt.getBean("employee");
			System.out.println(employee1.hashCode());
			Employees employee2 = (Employees) cxt.getBean("employee");
			System.out.println(employee2.getAddress().hashCode());
			Employees employee3 = (Employees) cxt.getBean("employee");
			System.out.println(employee3.getAddress().hashCode());
		}
	}
}
