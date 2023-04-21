package com.babu.common.questions;

public class RemoveDupsFromString {

	public static void main(String[] args) {
		String input = "Mphasis is a good place to work";
		String result = "";
	    for (int i = 0; i < input.length(); i++) {
	    	String str = String.valueOf(input.charAt(i));
	        if(!result.contains(str)) {
	            result += str;
	        }
	    }
	    System.out.println(result);

	}

}
