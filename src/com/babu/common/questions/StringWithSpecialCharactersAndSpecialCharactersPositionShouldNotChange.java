package com.babu.common.questions;

import java.util.stream.IntStream;

public class StringWithSpecialCharactersAndSpecialCharactersPositionShouldNotChange {
    public static String reverseString(String input) {

        String reversedString = new StringBuffer(input.replaceAll("[^a-zA-Z]", "")).reverse().toString();
        String replacedString = input.replaceAll("[a-zA-Z]", "_");

        char[] ch = reversedString.toCharArray();
        for(char c:ch) {
            replacedString = replacedString.replaceFirst("_", String.valueOf(c));
        }
        System.out.println("-------> " + replacedString);
        return replacedString;
    }


    public static void main(String[] args) {
        String input = "Swa$pn&il";
        String[] arr = input.split("");
        String regex = "[^0-9a-zA-Z]";

        StringBuilder reversed=new StringBuilder(input.replaceAll(regex, "")).reverse();

        IntStream.range(0, input.length()-1)
                .filter(i->arr[i].matches(regex))
                .forEach(i->reversed.insert(i, arr[i]));

        System.out.println(reversed);
    }
}
