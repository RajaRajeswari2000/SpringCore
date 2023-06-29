package com.javaproject.springframework.interfaceInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public interface BankingServie {
	
@Autowired
	void transferAmmount(String accountNumber, String transferAccounNumber);
}
