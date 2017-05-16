package com.techelevator;

public class CheckingAccount extends BankAccount {

	@Override
	public DollarAmount withdraw(DollarAmount amountToWithdraw) {
		if(amountToWithdraw.isGreaterThan(getBalance())) {
			amountToWithdraw = amountToWithdraw.plus(new DollarAmount(1000));
			if(getBalance().minus(amountToWithdraw).isGreaterThan(new DollarAmount(-10000))) {
				super.withdraw(amountToWithdraw);
			}
		} else {
			super.withdraw(amountToWithdraw);
		}
		return getBalance();
	}
	
}
