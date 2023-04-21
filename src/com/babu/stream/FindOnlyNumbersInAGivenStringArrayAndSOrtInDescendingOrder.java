package com.babu.stream;

import java.util.Arrays;

public class FindOnlyNumbersInAGivenStringArrayAndSOrtInDescendingOrder {
    public static void main(String[] args) {
        String[] inputArray = {"abc","xyz", "10","9","99"};
        Arrays.stream(inputArray).filter( str -> str.chars().allMatch(Character::isDigit)).forEach(System.out::println);
    }
}
