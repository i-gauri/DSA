package com.algo.sorting;

import com.practice.Array;
import com.utils.Utils;

/**
 * 
 * @author GauriK
 *
 */
public class Sorting {

	public static int[] insertion(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int current = arr[i];
			int j = i;
			while (j > 0 && arr[j - 1] > current) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = current;
		}
		return arr;
	}

	public static int[] bubble(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int swapCount = 0;
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					Utils.swapArrayElements(arr, j, j + 1);
					swapCount++;
				}
			}
			if (swapCount == 0)
				break;
		}
		return arr;
	}

	public static int[] selection(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					Utils.swapArrayElements(arr, i, j);
				}
			}
		}
		return arr;
	}

	public static void quick(int[] arr, int left, int right) {
		if (!(left < right))
			return;
		int pivot = partition(arr, left, right);
		quick(arr, left, pivot - 1);
		quick(arr, pivot + 1, right);
	}

	private static int partition(int[] arr, int left, int right) {
		int currentPosition = left;
		int swapPosition = left - 1;
		while (currentPosition < right) {
			if (arr[currentPosition] < arr[right]) {
				Utils.swapArrayElements(arr, ++swapPosition, currentPosition);
			}
			currentPosition++;
		}
		Utils.swapArrayElements(arr, ++swapPosition, right);
		return swapPosition;
	}

	public static int[] counting(int[] arr) {
		int max = Array.findMax(arr);
		int[] cumulativeArray = new int[max + 1];
		int[] result = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			cumulativeArray[arr[i]]++;
		}
		for (int i = 1; i < cumulativeArray.length; i++) {
			cumulativeArray[i] += cumulativeArray[i - 1];
		}
		for (int i = 0; i < arr.length; i++) {
			result[--cumulativeArray[arr[i]]] = arr[i];
		}
		return result;
	}

	public static void mergesort(int[] arr, int left, int right) {
		if (left < right) {
			int middle = (left + right) / 2;
			mergesort(arr, left, middle);
			mergesort(arr, middle + 1, right);
			merge(arr, left, middle, right);
		}
	}

	private static int[] merge(int[] arr, int left, int middle, int right) {
		int size1 = middle - left + 1;
		int size2 = right - middle;

		int[] arr1 = new int[size1];
		int[] arr2 = new int[size2];

		for (int i = left, index = 0; i <= middle; i++, index++) {
			arr1[index] = arr[i];
		}

		for (int i = middle + 1, index = 0; i <= right; i++, index++) {
			arr2[index] = arr[i];
		}

		int i = 0, j = 0, index = left;

		while (i < size1 && j < size2) {
			if (arr1[i] < arr2[j]) {
				arr[index++] = arr1[i++];
			} else {
				arr[index++] = arr2[j++];
			}
		}

		while (i < size1) {
			arr[index++] = arr1[i++];
		}

		while (j < size2) {
			arr[index++] = arr2[j++];
		}
		return arr;
	}

	public static int[] shell(int[] arr) {
		for (int gap = arr.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < arr.length; i++) {
				int current = arr[i];
				int j = i;
				while (j > 0 && arr[j - 1] > current) {
					arr[j] = arr[j - 1];
					j--;
				}
				arr[j] = current;
			}
		}
		return arr;
	}
	
	/*public static int[] radix(int[] arr) {
		
	}*/
}
