package com.babu.stream;

import java.util.Arrays;
import java.util.Comparator;

public class WordThatHasTheSecondOrNthHighestLength {
    public static void main(String[] args) {
        String input = "I am interested123455 to grow in my organization";
        Arrays.stream(input.split(" "))
                .sorted(Comparator.comparing(String::length).reversed())
                .skip(1).findFirst().ifPresent(System.out::println);
    }
}
