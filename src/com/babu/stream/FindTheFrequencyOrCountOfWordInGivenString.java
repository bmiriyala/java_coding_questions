package com.babu.stream;

import java.util.Arrays;
import java.util.Collections;

public class FindTheFrequencyOrCountOfWordInGivenString {
    public static void main(String[] args) {
        String input = "the quick brown fox jumps right over the little lazy dog little";
        int length = Collections.frequency(Arrays.asList(input.split(" ")), "little");
        System.out.println(length);
    }
}
