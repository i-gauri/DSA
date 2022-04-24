package com.algo;

public class Searching {

	public static int binary(int[] arr, int key) {
		int left = 0;
		int right = arr.length - 1;
		while (left <= right) {
			int mid = (right + left) / 2;
			if (arr[mid] == key)
				return mid;
			if (arr[mid] < key) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}
	
	public static int linear(int[] arr, int key) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
}
