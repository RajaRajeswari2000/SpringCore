package com.javaproject.springframework.springCore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext cxt=new ClassPathXmlApplicationContext("com/javaproject/springframework/springCore/Config.xml");
			Employees empl=(Employees) cxt.getBean("emp");
			System.out.println(empl.getName());
		   System.out.println(cxt.getBean(Employees.class).getId());
		}
		}
	


