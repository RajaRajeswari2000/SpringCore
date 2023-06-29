package com.javaproject.springframework.springCore.lc.sterotyprannotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext cxt = new ClassPathXmlApplicationContext(
				"com/javaproject/springframework/springCore/lc/sterotyprannotation/SteroConfig.xml");
		System.out.println(cxt.getBean(Patient.class).getPatientId());
		System.out.println(cxt.getBean(Patient.class).getPatientname());
		System.out.println(cxt.getBean(Patient.class).getDoctorList());
		System.out.println(cxt.getBean(Patient.class).toString());
		cxt.registerShutdownHook();
	}
}