package com.babu;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {
		//Java is good to Learn
		String str = "Java is good to Learn";
		String s= "J";
		String duplicates="";
		for (int i = 1; i < str.length(); i++) {
			String st = new StringBuilder().append(str.charAt(i)).toString();
			boolean b = !s.contains(st);
			
			if(st.equals(" ") || b) {
				s = s + st;
				
			} else {
				duplicates = duplicates + st;
			}
		}
		System.out.println("Duplicate chars are:: " + duplicates);
		System.out.print("Without Duplicate chars:: " + s);
	}

}
