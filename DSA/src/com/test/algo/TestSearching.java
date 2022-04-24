package com.test.algo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.algo.Searching;

class TestSearching {

	@Test
	void test1() {
		int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		assertEquals(7, Searching.binary(arr, 7));
	}
	
	@Test
	void test2() {
		int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		assertEquals(0, Searching.binary(arr, 0));
	}
	
	@Test
	void test3() {
		int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		assertEquals(9, Searching.binary(arr, 9));
	}
	
	@Test
	void test4() {
		int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		assertEquals(-1, Searching.binary(arr, 10));
	}

}
