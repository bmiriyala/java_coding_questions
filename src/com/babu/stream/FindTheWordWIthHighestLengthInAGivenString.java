package com.babu.stream;

import java.util.Arrays;
import java.util.Comparator;

public class FindTheWordWIthHighestLengthInAGivenString {
    public static void main(String[] args) {
        String input = "I am interested123455 to grow in my organization";
        Arrays.stream(input.split(" ")).max(Comparator.comparing(String::length)).ifPresent(System.out::println);
    }
}
