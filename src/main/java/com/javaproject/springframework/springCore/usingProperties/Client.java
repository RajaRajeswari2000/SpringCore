package com.javaproject.springframework.springCore.usingProperties;

public class Client {
	private String url;
	private String userName;
	private String passWord;

	public Client(String url, String userName, String passWord) {
		super();
		this.url = url;
		this.userName = userName;
		this.passWord = passWord;
	}

	@Override
	public String toString() {
		return "Client [url=" + url + ", userName=" + userName + ", passWord=" + passWord + "]";
	}

}
