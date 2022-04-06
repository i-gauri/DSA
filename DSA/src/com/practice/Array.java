package com.practice;

public class Array {
	
	public static int[] leftShift(int[] arr, int factor) {
		int[] result = new int[arr.length];
		int g = 0;
		for (int i = factor; i < arr.length; i++) {
			result[g] = arr[i];
			g++;
		}
		for (int i = 0; i < factor; i++) {
			result[g] = arr[i];
			g++;
		}
		return result;
	}

	// How to rotate an array left and right by a given factor ?
	public static int[] rotate(int[] arr, int factor) {
		factor %= arr.length;
		if (factor == 0)
			return arr;
		int[] result = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int index = factor + i;
			if (index < 0) {
				index += arr.length;
			}
			if (index >= arr.length) {
				index -= arr.length;
			}
			result[index] = arr[i];
		}
		return result;
	}

	public static int findMax(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int[] removeDuplicate(int[] arr) {
		int[] ca = new int[findMax(arr) + 1];
		int size = 0;
		for (int i = 0; i < arr.length; i++) {
			if (ca[arr[i]] == 0)
				size++;
			ca[arr[i]]++;
		}
		int index = 0;
		int[] result = new int[size];
		for (int i = 0; i < arr.length; i++) {
			int key = ca[arr[i]];
			if (key != 0) {
				result[index++] = arr[i];
				ca[arr[i]] = 0;
			}
		}
		return result;
	}
	
	public static int[] getDuplicate(int[] arr) {
		int[] ca = new int[findMax(arr) + 1];
		int size = 0;
		for (int i = 0; i < arr.length; i++) {
			if(ca[arr[i]] == 1) size++;
			ca[arr[i]]++;
		}
		int index = 0;
		int[] result = new int[size];
		for (int i = 0; i < arr.length; i++) {
			int key = ca[arr[i]];
			if (key > 1) {
				result[index++] = arr[i];
				ca[arr[i]] = 0;
			}
		}
		return result;
	}
	
	public static int[] getUniques(int[] arr) {
		int[] ca = new int[findMax(arr) + 1];
		int size = 0;
		for(int i = 0; i < arr.length; i++) {
			ca[arr[i]]++;
			if(ca[arr[i]] == 1) {
				size++;
			}
			else if(ca[arr[i]] > 1) {
				size--;
			}
		}
		int index = 0;
		int[] result = new int[size];
		for(int i = 0; i < arr.length; i++) {
			int key = ca[arr[i]];
			if(key == 1) {
				result[index++] = arr[i];
			}
		}
		return result;
	}
	
	// How do you find all pairs of an integer array whose sum is equal to a given number?
	
}
