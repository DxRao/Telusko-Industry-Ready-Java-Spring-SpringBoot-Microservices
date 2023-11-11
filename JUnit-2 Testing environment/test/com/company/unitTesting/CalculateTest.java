package com.company.unitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateTest {

	@Test
	public void test() {
		Calculate c = new Calculate();
		int actual = c.add(10, 5);
		int expectedResult = 15;
		assertEquals(expectedResult, actual);
	}

}
