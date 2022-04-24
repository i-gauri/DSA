package com.test.practice;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Map;

import org.junit.jupiter.api.Test;

import com.practice.Strings;

class TestStrings {

	@Test
	void testAnagram() {
		String s1 = "raca";
		String s2 = "care";
		assertTrue(Strings.isAnagram(s1, s2));
	}
	
	@Test
	void testFrequency() {
		String str = "success";
		Map<Character, Integer> frequency = Strings.frequency(str);
		System.out.println(frequency);
	}
	
	@Test
	void testAnagram2() {
		String s1 = "raca";
		String s2 = "care";
		assertFalse(Strings.isAnagram2(s1, s2));
	}

}
