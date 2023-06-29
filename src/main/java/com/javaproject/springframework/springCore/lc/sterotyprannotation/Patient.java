package com.javaproject.springframework.springCore.lc.sterotyprannotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Patient {
	@Value("8797")
	private String patientId;
	@Value("Raja Rajeswari")
	private String patientname;
	@Value("#{doctorsList}")
	private List<String> doctorList = List.of();
	@Autowired
	private Address doctorAddress;

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		System.out.println("spring started to put the date into object");
		this.patientId = patientId;
	}

	public String getPatientname() {
		return patientname;
	}

	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}

	public List<String> getDoctorList() {
		return doctorList;
	}

	public void setDoctorList(List<String> doctorList) {
		this.doctorList = doctorList;
	}

	public Patient(Address doctorAddress) {
		super();
		this.doctorAddress = doctorAddress;
	}

	@Override
	public String toString() {
		return "Patient [doctorAddress=" + doctorAddress + "]";
	}

	

}
