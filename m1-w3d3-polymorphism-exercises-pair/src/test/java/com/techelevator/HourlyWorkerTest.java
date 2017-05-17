package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HourlyWorkerTest {
	
	HourlyWorker hourlyWorker;

	@Before
	public void setUp() throws Exception {
		hourlyWorker = new HourlyWorker("Tyler", "Waddington", 20.00);
	}

	@Test
	public void testCalculateWeeklyPay39Hours() {
		assertEquals(800.00, hourlyWorker.calculateWeeklyPay(40), 0.00);
		assertEquals(780.00, hourlyWorker.calculateWeeklyPay(39), 0.00);
		assertEquals(830.00, hourlyWorker.calculateWeeklyPay(41), 0.00);
	}

}
