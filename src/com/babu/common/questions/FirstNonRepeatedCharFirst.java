package com.babu.common.questions;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharFirst {

	public static void main(String[] args) {
		String inputStr ="teeter";

        for(char i :inputStr.toCharArray()){
        if ( inputStr.indexOf(i) == inputStr.lastIndexOf(i)) {
            System.out.println("First non-repeating character is: "+i);
            break;
        }
        }
        // other way
        String s = "hello";
        char ch = findFirstNonRepeatableChar(s);
        System.out.println( ch);

	}
	
	public static Character findFirstNonRepeatableChar(String str) {
        Map<Character,Integer> map = new LinkedHashMap<>();
        for (Character ch : str.toCharArray()) {
            map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);
        }
        return map.entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get().getKey();
} 

}
