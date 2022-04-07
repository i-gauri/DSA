package com.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Strings {
	public static boolean isAnagram(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;

		char[] arr1 = new char[s1.length()];
		char[] arr2 = new char[s2.length()];

		for (int i = 0; i < s1.length(); i++) {
			arr1[i] = s1.charAt(i);
			arr2[i] = s2.charAt(i);
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}

	public static Map<Character, Integer> frequency(String s1) {
		Map<Character, Integer> hMap = new HashMap<>();
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			hMap.put(ch, hMap.get(ch) == null ? 1 : hMap.get(ch) + 1);
		}
		return hMap;
	}
	
	public static boolean isAnagram2(String s1, String s2) {
		if(s1.length() != s2.length()) return false;
		Map<Character, Integer> f1 = frequency(s1);
		Map<Character, Integer> f2 = frequency(s2);
		for(char key: f1.keySet()) {
			if(!f1.get(key).equals(f2.get(key))) {
				return false;
			}
		}
		return true;
	}
}
