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
		checkingAccount.deposit(new DollarAmount(10000));
		assertEquals(1, checkingAccount.withdraw(new DollarAmount(9999)).toPennies());
	}
	
	@Test
	public void testWithdrawWhenNegative() {
		checkingAccount.withdraw(new DollarAmount(1));
		assertEquals(-1001, checkingAccount.getBalance().toPennies());
		assertEquals(-1001, checkingAccount.withdraw(new DollarAmount(8000)).toPennies());
		assertEquals(-1001, checkingAccount.withdraw(new DollarAmount(7999)).toPennies());
		assertEquals(-9999, checkingAccount.withdraw(new DollarAmount(7998)).toPennies());
	}
	
	
}
