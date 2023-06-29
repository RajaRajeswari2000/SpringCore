package com.javaproject.springframework.interfaceInjection;

import org.springframework.stereotype.Component;

@Component
public class BankingServiceImp implements BankingServie {
	String accountno=" " ;
	String transferno =" ";
	double balance=1000;
	
	@Override
	public void transferAmmount(String accountNumber, String transferAccounNumber) {
if(accountno == accountNumber) {
		accountno = accountNumber;
		transferno = transferAccounNumber;}
	}
	public void withdraw(double amount) {
	balance=balance-amount;
	System.out.println(balance);
	}

}
