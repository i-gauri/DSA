package com.algo;

public class StringPattern {

	/**
	 * Naive method to find the position of pattern in a given string.
	 * 
	 * @param str
	 * @param pattern
	 * @return
	 */
	public static int findSubstring(String str, String pattern) {
		int lenStr = str.length();
		int lenPat = pattern.length();
		
		for(int i = 0; i <= (lenStr - lenPat); i++) {
			int j = 0;
			while(j < lenPat) {
				if(str.charAt(i + j) != pattern.charAt(j)) {
					break;
				}
				j++;
			}
			if(j == lenPat) return i;
		}
		return -1;
	}
	
	public static int[] failureTable (String pattern) {
		int[] table = new int[pattern.length()];
		table[0] = 0;
		int i = 1, j = 0;
		while(i < pattern.length()) {
			if (pattern.charAt(i) == pattern.charAt(j)) {
				table[i] = j + 1;
				i++;
				j++;
			}
			else {
				if (j == 0) {
					table[i] = 0;
					i++;
				}
				else {
					j = table[j - 1];
				}
			}
		}
		return table;
	}
	
	public static int kmp(String str, String pattern) {
		int lenStr = str.length();
		int lenPat = pattern.length();
		int[] table = failureTable(pattern);
		int s = 0, p = 0;
		while (s < lenStr && p < lenPat) {
			if(str.charAt(s) == pattern.charAt(p)) {
				s++;
				p++;
			}
			else {
				if(p == 0) { s++; }
				else { p = table[p - 1]; }
			}
			if (p ==lenPat) {
				return s - p;
			}
		}
		return -1;
	}
}
