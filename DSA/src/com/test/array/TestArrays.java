package com.test.array;

import static org.junit.jupiter.api.Assertions.*;

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
}
