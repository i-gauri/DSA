package com.test.algo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.algo.Basics;

class TestBasics {

	@Test
	@DisplayName("Binary Exponentiation")
	void testBinaryExponentiation() {
		assertEquals(512, Basics.power(2, 9));
	}
}
