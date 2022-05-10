package com.algo;

public class Basics {
	
	/**
	 * Implementation of binary exponentiation.
	 * @return
	 */
	public static long power (long base, long power) {
		long result = 1;
		while(power > 0) {
			if ((power & 1) == 1)
				result *= base;
			base *= base;
			power >>= 1;
		}
		return result;
	}
}
