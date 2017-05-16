package com.techelevator;

public class BankAccount {
	private String accountNumber;
	private DollarAmount balance;
	
	public BankAccount() {
		balance = new DollarAmount(0);
	}
	public DollarAmount deposit (DollarAmount amountToDeposit) {
		balance = balance.plus(amountToDeposit);
			return balance;
	}
	public DollarAmount withdraw(DollarAmount amountToWithdraw) {
		balance = balance.minus(amountToWithdraw);
		return balance;
	}
	public void transfer(BankAccount destinationAccount, DollarAmount transferAmount) {
		this.withdraw(transferAmount);
		destinationAccount.deposit(transferAmount);		
	}
		
	
	
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public DollarAmount getBalance() {
		return balance;
	}
	
	
}


