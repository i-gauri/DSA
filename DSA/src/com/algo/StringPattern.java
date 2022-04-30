package com.algo;

import java.util.ArrayList;
import java.util.List;

public class StringPattern {
	
	private static final long PRIME = 73L;
	private static final int D = 256;

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
			if (p == lenPat) {
				return s - p;
			}
		}
		return -1;
	}
	
	/**
	 * Rehashing: hash(str[s+1...s+m]) = d(hash(str[s...s+m-1]) - str[s] * h) + str[s+m]) mod q;
	 * 	   Where:
	 * 		 hash(str[s+1...s+m]) : Hash of next window.
	 * 		 hash(str[s...s+m-1]) : Hash of current window.
	 * 			                d : Number of character in input alphabets.
	 *                          q : A prime number.
	 *                          h : d ^ (m - 1);
	 */
	
	public static List<Integer> rabin_karp(String str, String pattern) {
		int lenStr = str.length();
		int lenPat = pattern.length();
		long h = (long) (Math.pow(D, lenPat - 1) % PRIME);
		long hashStr = 0;
		long hashPat = 0;
		List<Integer> positions = new ArrayList<>();
		
		// Calculate hash of first slot of string and pattern.
		for(int i = 0; i < lenPat; i++) {
			hashStr = (D * hashStr + str.charAt(i)) % PRIME;
			hashPat = (D * hashPat + pattern.charAt(i)) % PRIME;
		}
		
		for(int i = 0; i <= (lenStr - lenPat); i++) {
			if (hashStr == hashPat) {
				int j = 0;
				while(j < lenPat) {
					if(str.charAt(i + j) != pattern.charAt(j)) {
						break;
					}
					j++;
				}
				if(j == lenPat) {
					positions.add(i);
				}
			}
			if(i < (lenStr - lenPat)) {
				// Calculate hash of next slot.
				hashStr = (D * (hashStr - str.charAt(i) * h) + str.charAt(i + lenPat)) % PRIME;
				if (hashStr < 0) hashStr += PRIME;
			}
		}
		return positions;
	}
}
