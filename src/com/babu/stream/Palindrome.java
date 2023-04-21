package com.babu.stream;

import java.util.stream.IntStream;

public class Palindrome {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        String stringInput = "radar";
        boolean isPalindrome = palindrome.isPalindrome(stringInput);
        System.out.println("String palindrome test:: " + isPalindrome);
        int intInput = 122;
        boolean isPalindrome2 = palindrome.isPalindrome(String.valueOf(intInput));
        System.out.println("int palindrome test:: " + isPalindrome2);

    }

    private  boolean isPalindrome(String input) {
        return IntStream.range(0, input.length() / 2)
                .noneMatch(index -> input.charAt(index) != input.charAt(input.length() - index - 1));
    }

}