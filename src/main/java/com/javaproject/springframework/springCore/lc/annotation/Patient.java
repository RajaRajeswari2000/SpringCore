package com.javaproject.springframework.springCore.lc.annotation;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Patient {
	private String patientId;

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + "]";
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	@PostConstruct
	public void initial() {
		System.out.println("starting initialization");

	}
@PreDestroy
	public void destroyBefore() {
		System.out.println("getting destroy before container destroyed object");
	}

public char[] getPatientId() {
	// TODO Auto-generated method stub
	return null;
}
	
	

}
