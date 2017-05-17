package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SalaryWorkerTest {
	
	SalaryWorker salaryWorker;

	@Before
	public void setUp() throws Exception {
		salaryWorker = new SalaryWorker("Connor", "McDevitt", 52000.00);
	}

	@Test
	public void testCalculateWeeklyPay() {
		assertEquals(1000.00, salaryWorker.calculateWeeklyPay(10), 0.00);
	}

}
