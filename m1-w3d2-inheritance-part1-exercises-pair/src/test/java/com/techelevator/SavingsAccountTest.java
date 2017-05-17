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
		savingsAccount.deposit(new DollarAmount(10000));
		assertEquals(1, savingsAccount.withdraw(new DollarAmount(9999)).toPennies());
	}
	
	@Test
	public void testWithdrawWhenNegative() {
		savingsAccount.withdraw(new DollarAmount(1));
		assertEquals(-1001, savingsAccount.getBalance().toPennies());
		assertEquals(-1001, savingsAccount.withdraw(new DollarAmount(8000)).toPennies());
		assertEquals(-1001, savingsAccount.withdraw(new DollarAmount(7999)).toPennies());
		assertEquals(-9999, savingsAccount.withdraw(new DollarAmount(7998)).toPennies());
	}

}
