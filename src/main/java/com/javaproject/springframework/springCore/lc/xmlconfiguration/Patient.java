package com.javaproject.springframework.springCore.lc.xmlconfiguration;

public class Patient {
	private String patientId;

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		System.out.println("spring started to put the date into object");
		this.patientId = patientId;
	}

	public void initial() {
		System.out.println("starting initialization");

	}

	public void destroyBefore() {
		System.out.println("getting destroy before container destroyed object");
	}
}
