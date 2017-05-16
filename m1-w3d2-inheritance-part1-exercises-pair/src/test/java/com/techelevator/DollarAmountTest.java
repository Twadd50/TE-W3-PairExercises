package com.techelevator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DollarAmountTest {

	@Test
	public void testToStringMoreThan10Cents() {
		DollarAmount testAmount = new DollarAmount(3210);
		
		assertEquals("$32.10", testAmount.toString());
	}
	
	@Test
	public void testToStringLessThan10Cents() {
		DollarAmount testAmount = new DollarAmount(1);
		
		assertEquals("$0.01", testAmount.toString());
	}

}
