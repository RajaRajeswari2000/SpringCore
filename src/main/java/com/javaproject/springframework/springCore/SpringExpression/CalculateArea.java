package com.javaproject.springframework.springCore.SpringExpression;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CalculateArea {

	@Value("#{0.98766}") // new double ()- putting object type using spEL ,
		//@Value("#{T(java.lang.Double).MAX_VALUE")	// T(java.lang.Integer).MAX_VALUE();-static method
	private double radius;
	@Value("#{'CIRCLE'.toLowerCase()}")
	private String shape;
	@Value("#{1+2>1?true:false}")
	private boolean answer;

	@Override
	public String toString() {
		return "CalculateArea [answer=" + answer + "]";
	}

	public double calculate() {
		System.out.println(shape);
		double area = Math.PI * Math.pow(radius, 2);
		
		return area;
		
	}

}
