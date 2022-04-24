package com.test.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.practice.Matrix;

class TestMatrix {

	@Test
	void testMatrix1() {
		int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		assertThrows(Exception.class, () -> new Matrix(arr, 3, 3));
	}

	@Test
	void testMatrix2() {
		int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
		try {
			Matrix m = new Matrix(arr, 3, 3);
			System.out.println(m);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	void testMatrix3() {
		int[] arr1 = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] arr2 = { 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		try {
			Matrix m1 = new Matrix(arr1, 3, 3);
			Matrix m2 = new Matrix(arr2, 3, 3);
			
			Matrix m3 = m1.sum(m2);
			System.out.println(m3);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
