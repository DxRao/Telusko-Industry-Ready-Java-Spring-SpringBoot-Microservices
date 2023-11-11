package com.company.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MultiplyTest {

	@Test
	void test() {
		Multiply m = new Multiply();
		
		int actual = m.multiply(10, 3);
		
		int expected = 30;
		
		assertEquals(expected, actual);
	}

}
