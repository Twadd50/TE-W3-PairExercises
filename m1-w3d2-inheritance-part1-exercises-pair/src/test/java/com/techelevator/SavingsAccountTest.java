package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SavingsAccountTest {

	SavingsAccount savingsAccount;

	@Before
	public void setUp() throws Exception {
		savingsAccount = new SavingsAccount();
	}

	@Test
	public void testWithdrawWhenBalanceBelow150() {
		savingsAccount.deposit(new DollarAmount(14000));
		DollarAmount amountToWithdraw = new DollarAmount(3000);
		assertEquals(10800, savingsAccount.withdraw(amountToWithdraw).toPennies());
	}
	
	@Test
	public void testWithdrawNotPossibleOverdraft() {
		DollarAmount amountToWithdraw = new DollarAmount(1);
		assertEquals(new DollarAmount(0), savingsAccount.withdraw(amountToWithdraw));
	}

	@Test
	public void testPositiveWithdraw() {
		savingsAccount.deposit(new DollarAmount(15000));
		assertEquals(1, savingsAccount.withdraw(new DollarAmount(14999)).toPennies());
	}

}
