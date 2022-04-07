package com.utils;

public class Utils {
	
	public static void swapArrayElements(int[] arr, int left, int right) {
		if(left == right) return;
		arr[left]  = arr[left] + arr[right];
		arr[right] = arr[left] - arr[right];
		arr[left]  = arr[left] - arr[right];
	}
}
