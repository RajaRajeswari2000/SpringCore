package com.javaproject.springframework.springCore.lc.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext cxt = new ClassPathXmlApplicationContext(
				"com/javaproject/springframework/springCore/lc/annotaion/Config.xml");
		System.out.println(cxt.getBean(Patient.class).getPatientId());
		cxt.registerShutdownHook();
	}
}