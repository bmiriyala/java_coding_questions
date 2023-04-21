package com.babu.common.questions;

public class RemoveWhiteSpacesTest {

	public static void main(String[] args) {
		//Java is good to Learn
		
		String str ="Java is good to Learn";
		String[] arr = str.split(" ");
		String s = "";
		for (int i = 0; i < arr.length; i++) {
			s = s + arr[i].toString();
		}
		System.out.println(s);

	}

}
