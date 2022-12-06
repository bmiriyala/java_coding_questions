package com.babu;

import java.util.Arrays;

public class AnagramsTest {

	public static void main(String[] args) {
		String str1 = "Angel";
		String str2 = "Angle";
		
		//String str3 = "Angles"; // Not Anagram example
		
		char[] wordArr = str1.toLowerCase().toCharArray();
		Arrays.sort(wordArr);
		
		char[] wordArr2 = str2.toLowerCase().toCharArray();
		Arrays.sort(wordArr2);
		
		//System.out.println(String.valueOf(wordArr).equals(String.valueOf(wordArr2)));
		
		if(String.valueOf(wordArr).equals(String.valueOf(wordArr2))) {
			System.out.println("Anagrams");
		} else System.out.println("Not an Anagrams");
		
	}

}
