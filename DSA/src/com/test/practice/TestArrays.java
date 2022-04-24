package com.test.practice;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.practice.Array;

class TestArrays {

	@Test
	void testLeftShift() {
		int[] arr = { 0, 1, 2, 3, 4 };
		int[] exp = { 4, 0, 1, 2, 3 };
		int[] act = Array.leftShift(arr, 4);
		System.out.println(Arrays.toString(act));
		assertArrayEquals(exp, act);
	}

	@Test
	void testRotate() {
		int[] arr = { 0, 1, 2, 3, 4 };
		int[] exp = { 3, 4, 0, 1, 2 };
		int[] act = Array.rotate(arr, -8);
		System.out.println(Arrays.toString(act));
		assertArrayEquals(exp, act);
	}

	@Test
	void testRemoveDuplicates() {
		int[] arr = { 2, 2, 2, 2, 2, 2 };
		int[] exp = { 2 };
		int[] act = Array.removeDuplicate(arr);
		System.out.println(Arrays.toString(act));
		assertArrayEquals(exp, act);
	}

	@Test
	void testGetDuplicates() {
		int[] arr = { 2, 2, 3, 3, 1, 2, 2, 4, 4 };
		int[] exp = { 2, 3, 4 };
		int[] act = Array.getDuplicate(arr);
		System.out.println(Arrays.toString(act));
		assertArrayEquals(exp, act);
	}

	@Test
	void testGetUnique() {
		int[] arr = { 1, 1, 2, 3, 4 };
		int[] exp = { 2, 3, 4 };
		int[] act = Array.getUniques(arr);
		System.out.println(Arrays.toString(act));
		assertArrayEquals(exp, act);
	}

	@Test
	void testReverseCopy() {
		int[] arr = { 1, 1, 2, 3, 4 };
		int[] exp = { 4, 3, 2, 1, 1 };
		int[] act = Array.reverseCopy(arr);
		System.out.println(Arrays.toString(act));
		assertArrayEquals(exp, act);
	}

	@Test
	void testReverse() {
		int[] arr = { 5, 1, 1, 2, 3, 4 };
		int[] exp = { 4, 3, 2, 1, 1, 5 };
		int[] act = Array.reverse(arr);
		System.out.println(Arrays.toString(act));
		assertArrayEquals(exp, act);
	}

	@Test
	void test1() {
		int[] arr = { 0, 1, 2, 3, 4, 4, 4, 5, 6, 7 };
		int[] act = Array.firstAndLastOccranceInSortedArray(arr, 4);
		int[] exp = { 4, 6 };
		System.out.println(Arrays.toString(act));
		assertArrayEquals(exp, act);
	}

	@Test
	void test2() {
		int[] arr = { 0, 0, 2, 3, 4, 4, 4, 5, 6, 7 };
		int[] act = Array.firstAndLastOccranceInSortedArray(arr, 0);
		int[] exp = { 0, 1 };
		System.out.println(Arrays.toString(act));
		assertArrayEquals(exp, act);
	}

	@Test
	void test3() {
		int[] arr = { 1, 2, 3, 4, 7, 7, 7 };
		int[] act = Array.firstAndLastOccranceInSortedArray(arr, 7);
		int[] exp = { 4, 6 };
		System.out.println(Arrays.toString(act));
		assertArrayEquals(exp, act);
	}

	@Test
	void test4() {
		int[] arr = { 1, 2, 3, 4, 7, 8, 9 };
		int[] act = Array.firstAndLastOccranceInSortedArray(arr, 4);
		int[] exp = { 3, 3 };
		System.out.println(Arrays.toString(act));
		assertArrayEquals(exp, act);
	}

	@Test
	void test5() {
		int[] arr = { 1, 2, 3, 4, 7, 8, 9 };
		int[] act = Array.firstAndLastOccranceInSortedArray(arr, 6);
		int[] exp = { -1, -1 };
		System.out.println(Arrays.toString(act));
		assertArrayEquals(exp, act);
	}
}
