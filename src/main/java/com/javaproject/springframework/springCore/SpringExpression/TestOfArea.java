package com.javaproject.springframework.springCore.SpringExpression;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestOfArea {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext(
				"com/javaproject/springframework/springCore/SpringExpression/ConfigurationFile.xml");
		System.out.println(cxt.getBean(CalculateArea.class).toString());
		double area = cxt.getBean(CalculateArea.class).calculate();
		System.out.println(area);
		System.out.println(cxt.getBean(CalculateArea.class).toString());
	}

}
