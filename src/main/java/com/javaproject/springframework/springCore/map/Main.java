package com.javaproject.springframework.springCore.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext(
				"com/javaproject/springframework/springCore/map/MapConfig.xml");
		System.out.println(cxt.getBean(Customer.class).getId());
		System.out.println(cxt.getBean(Customer.class).getProducts());
		System.out.println(cxt.getBean(Customer.class).getItemsidAndName());

	}

}
