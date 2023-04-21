package com.babu.common.questions;

import java.util.stream.IntStream;

public class PrintAllPermutationsOfGivenString {

    public static void permutation(String str) {
        permutation("", str);
    }
    private static void permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0) System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
        }
    }

    // java 8 stream example
    private static void stringPermuteAndPrint(String prefix, String str) {
        int n = str.length();
        if (n == 0) {
            System.out.print(prefix + " ");
        } else {
            IntStream.range(0, n).parallel().forEach(
                    i -> stringPermuteAndPrint(prefix + str.charAt(i), str.substring(i + 1, n) + str.substring(0, i)));
        }
    }

    public static void main(String[] args) {
        permutation("abc");
    }
}
