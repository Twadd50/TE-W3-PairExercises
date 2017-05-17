package com.techelevator;

public class SavingsAccount extends BankAccount {

	@Override
	public DollarAmount withdraw(DollarAmount amountToWithdraw) {
		if(getBalance().toPennies() < 15000) {
			amountToWithdraw = amountToWithdraw.plus(new DollarAmount(200));
		}
		
		if(amountToWithdraw.toPennies() > getBalance().toPennies()) {
			return getBalance();
		} else {
			super.withdraw(amountToWithdraw);
		}
		return getBalance();
	}
}
