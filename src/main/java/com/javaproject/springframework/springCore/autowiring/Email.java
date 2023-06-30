package com.javaproject.springframework.springCore.autowiring;

public class Email {
	private String mailId;

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	@Override
	public String toString() {
		return "Email [mailId=" + mailId + "]";
	}

}
