package com.javaproject.springframework.springCore.lc.springinterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean, DisposableBean {
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

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("starting initialization");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("getting destroy before container destroyed object");

	}
}
