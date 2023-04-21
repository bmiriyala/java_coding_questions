package com.babu.common.questions;

public class StringReverseTest {

	public static void main(String[] args) {
		// Java -> avaJ
		String str="Java";
		/*
		 * StringBuilder sb = new StringBuilder(str);
		 * System.out.println(sb.reverse().toString());
		 */
		int len = str.length();
		for (int i = len -1; i>= 0; i--) {
			System.out.print(str.charAt(i));
		}
		

	}

}
