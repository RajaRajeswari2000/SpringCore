package com.javaproject.springframework.interfaceInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext(
				"com/javaproject/springframework/interfaceInjection/NewFile.xml");
		cxt.getBean(BankingServiceImp.class).transferAmmount("raji0503","indra0809");
		cxt.getBean(BankingServiceImp.class).withdraw(600);
		}
}
