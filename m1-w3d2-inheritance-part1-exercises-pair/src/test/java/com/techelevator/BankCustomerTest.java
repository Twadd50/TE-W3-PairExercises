package com.techelevator;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class BankCustomerTest {
	
	CheckingAccount bank1;
	CheckingAccount bank2;
	BankCustomer customer1;
	List<BankAccount> listOfActual;
	

	@Before
	public void setUp() throws Exception {
		bank1 = new CheckingAccount();
		bank2 = new CheckingAccount();
		customer1 = new BankCustomer();
		listOfActual = new ArrayList<>();
		
		
	}

	@Test
	public void testAddAccount() {
		BankAccount[] expectedAccounts = { bank1, bank2 };
		customer1.addAccount(bank1);
		customer1.addAccount(bank2);
		assertArrayEquals(expectedAccounts, customer1.getAccounts());
	}
	
	@Test
	public void isVip() {
		
		CheckingAccount checking1 = new CheckingAccount();
		checking1.deposit(new DollarAmount(499999));
		
		CheckingAccount checking2 = new CheckingAccount();
		checking2.deposit(new DollarAmount(2000000));
		
		CheckingAccount checking3 = new CheckingAccount();
		checking3.deposit(new DollarAmount(1));
		
		CheckingAccount checking4 = new CheckingAccount();
		checking4.deposit(new DollarAmount(1));
		
		
		customer1.addAccount(checking1);
		assertFalse(customer1.isVip());
		customer1.addAccount(checking2);
		assertFalse(customer1.isVip());
		customer1.addAccount(checking3);
		assertTrue(customer1.isVip());
		customer1.addAccount(checking4);
		assertTrue(customer1.isVip());
		
	}

}
