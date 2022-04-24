package com.test.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.algo.StringPattern;

class TestStringPattern {

	@Test
	void testfindSubstring1() {
		String str = "abbebefgac";
		String ptr = "bebe";
		assertEquals(2, StringPattern.findSubstring(str, ptr));
	}

	@Test
	void testfindSubstring2() {
		String str = "abbebefgac";
		String ptr = "bcac";
		assertEquals(-1, StringPattern.findSubstring(str, ptr));
	}

	@Test
	void testfindSubstring3() {
		String str = "abbebefgac";
		String ptr = "abbe";
		assertEquals(0, StringPattern.findSubstring(str, ptr));
	}

	@Test
	void testfindSubstring4() {
		String str = "abbebefgac";
		String ptr = "fgac";
		assertEquals(6, StringPattern.findSubstring(str, ptr));
	}

	@Test
	void testfindSubstring5() {
		String ptr = "abbebefgac";
		String str = "fgac";
		assertEquals(-1, StringPattern.findSubstring(str, ptr));
	}

	@Test
	void testfindSubstring6() {
		String str = "abbebefgac";
		String ptr = "bbebefgac";
		assertEquals(1, StringPattern.findSubstring(str, ptr));
	}

	@Test
	void testFailureTable1() {
		String pattern = "abcdabca";
		int[] table = { 0, 0, 0, 0, 1, 2, 3, 1 };
		assertArrayEquals(table, StringPattern.failureTable(pattern));
	}

	@Test
	void testFailureTable2() {
		String pattern = "aabaabaaa";
		int[] table = { 0, 1, 0, 1, 2, 3, 4, 5, 2 };
		assertArrayEquals(table, StringPattern.failureTable(pattern));
	}
	
	@Test
	void testKMP1() {
		String str = "abbebefgac";
		String ptr = "bebe";
		assertEquals(2, StringPattern.kmp(str, ptr));
	}

	@Test
	void testKMP2() {
		String str = "abbebefgac";
		String ptr = "bcac";
		assertEquals(-1, StringPattern.kmp(str, ptr));
	}

	@Test
	void testKMP3() {
		String str = "abbebefgac";
		String ptr = "abbe";
		assertEquals(0, StringPattern.kmp(str, ptr));
	}

	@Test
	void testKMP4() {
		String str = "abbebefgac";
		String ptr = "fgac";
		assertEquals(6, StringPattern.kmp(str, ptr));
	}

	@Test
	void testKMP5() {
		String ptr = "abbebefgac";
		String str = "fgac";
		assertEquals(-1, StringPattern.kmp(str, ptr));
	}

	@Test
	void testKMP6() {
		String str = "abbebefgac";
		String ptr = "bbebefgac";
		assertEquals(1, StringPattern.kmp(str, ptr));
	}
}
