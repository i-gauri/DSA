package com.test.algo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.algo.Sorting;

class TestSorting {

	@Test
	void testInsertionSort1() {
		int[] arr = { 3, 4, 2, 5, 1 };
		int[] exp = { 1, 2, 3, 4, 5 };
		int[] act = Sorting.insertion(arr);
		System.out.println(Arrays.toString(act));
		assertArrayEquals(exp, act);
	}

	@Test
	void testInsertionSort2() {
		int[] arr = { 3, 2, 6, 4, 5, 1, 2, 9, 7, 8 };
		int[] exp = { 1, 2, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] act = Sorting.insertion(arr);
		System.out.println(Arrays.toString(act));
		assertArrayEquals(exp, act);
	}

	@Test
	void testBubbleSort1() {
		int[] arr = { 3, 4, 2, 5, 1 };
		int[] exp = { 1, 2, 3, 4, 5 };
		int[] act = Sorting.bubble(arr);
		System.out.println(Arrays.toString(act));
		assertArrayEquals(exp, act);
	}

	@Test
	void testBubbleSort2() {
		int[] arr = { 3, 2, 6, 4, 5, 1, 2, 9, 7, 8 };
		int[] exp = { 1, 2, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] act = Sorting.bubble(arr);
		System.out.println(Arrays.toString(act));
		assertArrayEquals(exp, act);
	}

	@Test
	void testSelectionSort1() {
		int[] arr = { 3, 4, 2, 5, 1 };
		int[] exp = { 1, 2, 3, 4, 5 };
		int[] act = Sorting.selection(arr);
		System.out.println(Arrays.toString(act));
		assertArrayEquals(exp, act);
	}

	@Test
	void testSelectionSort2() {
		int[] arr = { 3, 2, 6, 4, 5, 1, 2, 9, 7, 8 };
		int[] exp = { 1, 2, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] act = Sorting.selection(arr);
		System.out.println(Arrays.toString(act));
		assertArrayEquals(exp, act);
	}

	@Test
	void testQuickSort1() {
		int[] arr = { 3, 4, 2, 5, 1 };
		int[] exp = { 1, 2, 3, 4, 5 };
		Sorting.quick(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
		assertArrayEquals(exp, arr);
	}

	@Test
	void testQuickSort2() {
		int[] arr = { 3, 2, 6, 4, 5, 1, 2, 9, 7, 8 };
		int[] exp = { 1, 2, 2, 3, 4, 5, 6, 7, 8, 9 };
		Sorting.quick(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
		assertArrayEquals(exp, arr);
	}

	@Test
	void testCountingSort1() {
		int[] arr = { 3, 4, 2, 5, 1 };
		int[] exp = { 1, 2, 3, 4, 5 };
		int[] act = Sorting.counting(arr);
		System.out.println(Arrays.toString(act));
		assertArrayEquals(exp, act);
	}

	@Test
	void testCountingSort2() {
		int[] arr = { 3, 2, 6, 4, 5, 1, 2, 9, 7, 8 };
		int[] exp = { 1, 2, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] act = Sorting.counting(arr);
		System.out.println(Arrays.toString(act));
		assertArrayEquals(exp, act);
	}

	@Test
	void testMergeSort1() {
		int[] arr = { 3, 4, 2, 5, 1 };
		int[] exp = { 1, 2, 3, 4, 5 };
		Sorting.mergesort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
		assertArrayEquals(exp, arr);
	}

	@Test
	void testMergeSort2() {
		int[] arr = { 3, 2, 6, 4, 5, 1, 2, 9, 7, 8 };
		int[] exp = { 1, 2, 2, 3, 4, 5, 6, 7, 8, 9 };
		Sorting.mergesort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
		assertArrayEquals(exp, arr);
	}
	
	@Test
	void testShellSort1() {
		int[] arr = { 3, 4, 2, 5, 1 };
		int[] exp = { 1, 2, 3, 4, 5 };
		int[] act = Sorting.shell(arr);
		System.out.println(Arrays.toString(act));
		assertArrayEquals(exp, act);
	}

	@Test
	void testShellSort2() {
		int[] arr = { 3, 2, 6, 4, 5, 1, 2, 9, 7, 8 };
		int[] exp = { 1, 2, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] act = Sorting.shell(arr);
		System.out.println(Arrays.toString(act));
		assertArrayEquals(exp, act);
	}
}
