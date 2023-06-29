package com.javaproject.springframework.springCore.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext(
				"com/javaproject/springframework/springCore/set/setConfig.xml");
		System.out.println(cxt.getBean(CarDealer.class).getName());
		System.out.println(cxt.getBean(CarDealer.class).getModels());
		System.out.println(cxt.getBean(CarDealer.class).getModels().getClass());
	}

}
