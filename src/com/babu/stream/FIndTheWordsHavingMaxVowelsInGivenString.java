package com.babu.stream;

import java.util.Arrays;

public class FIndTheWordsHavingMaxVowelsInGivenString {
    public static void main(String[] args) {
        // Maximum Number of Vowels: 2
        String input = "The quick brown fox jumps right over the little lazy dog.";
        Arrays.stream(input.split(" "))
                .filter(e -> e.replaceAll("[^aeiouAEIOU]", "").length() == 2)
                .forEach(System.out::println);

        //output Words: quick, over, little  ( because each word has maximum of 2 vowels)
    }
}
