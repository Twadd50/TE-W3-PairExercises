package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CheckingAccountTest {

	CheckingAccount checkingAccount;

	@Before
	public void setUp() throws Exception {
		checkingAccount = new CheckingAccount();
	}

	@Test
	public void testWithdrawPossibleOverdraft() {
		DollarAmount amountToWithdraw = new DollarAmount(2000);
		assertEquals(-3000, checkingAccount.withdraw(amountToWithdraw).toPennies());
	}
	
	@Test
	public void testWithdrawNotPossibleOverdraft() {
		DollarAmount amountToWithdraw = new DollarAmount(11000);
		assertEquals(new DollarAmount(0), checkingAccount.withdraw(amountToWithdraw));
	}
	
	@Test
	public void testPositiveWithdraw() {
		checkingAccount.deposit(new DollarAmount(15000));
		assertEquals(1, checkingAccount.withdraw(new DollarAmount(14999)).toPennies());
	}
}
