package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {
	
	BankAccount b1;
	BankAccount b2;
	DollarAmount amountToDeposit;
	DollarAmount amountToWithdraw;
	DollarAmount amountToTransfer;

	@Before
	public void setUp() throws Exception {
		b1 = new BankAccount();
		b2 = new BankAccount();
		amountToDeposit = new DollarAmount(100);
		amountToWithdraw = new DollarAmount(100);
		amountToTransfer = new DollarAmount(50);
	}

	@Test
	public void testDeposit() {
		
		b1.deposit(amountToDeposit);
		assertEquals(new DollarAmount(100), b1.getBalance());
		b1.deposit(amountToDeposit);
		assertEquals(new DollarAmount(200), b1.getBalance());
		
	}

	@Test
	public void testWithdraw() {
		
		b1.deposit(amountToDeposit);
		b1.withdraw(amountToWithdraw);
		assertEquals(new DollarAmount(0), b1.getBalance());
		
	}

	@Test
	public void testTransfer() {
		
		b1.deposit(amountToDeposit);
		b1.transfer(b2, amountToTransfer);
		assertEquals(new DollarAmount(50), b1.getBalance());
		assertEquals(new DollarAmount(50), b2.getBalance());
		
		
	}

}
