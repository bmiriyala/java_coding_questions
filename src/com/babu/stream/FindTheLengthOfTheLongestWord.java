package com.babu.stream;

import java.util.Arrays;

public class FindTheLengthOfTheLongestWord {
    public static void main(String[] args) {
        String input = "I am interested123455 to grow in my organization";
        int asInt = Arrays.stream(input.split(" ")).mapToInt(String::length).max().getAsInt();
        System.out.println( asInt );
    }
}
