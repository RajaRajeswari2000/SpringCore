package com.javaproject.springframework.springCore.usingProperties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFileClient {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext(
				"com/javaproject/springframework/springCore/usingProperties/ClientConfig.xml");
		System.out.println(cxt.getBean(Client.class).toString());

	}

}
