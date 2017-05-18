package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer {
	
	private String name;
	private String address;
	private String phoneNumber;
	private BankAccount[] accounts;
	
	
	List<BankAccount> listOfAccounts = new ArrayList<>();
	

	
	public void addAccount(BankAccount newAccount) {
		listOfAccounts.add(newAccount);
		}
	
	public boolean isVip() {
		int totalMoney = 0;
		for(BankAccount account : listOfAccounts) {
			totalMoney += account.getBalance().toPennies();
		}
		if (totalMoney >= 2500000) {
			return true;
		} 
			return false;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public BankAccount[] getAccounts() {
		accounts = listOfAccounts.toArray(new BankAccount[listOfAccounts.size()]);
		return accounts;
	}
	

}
