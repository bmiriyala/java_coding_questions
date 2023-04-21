package com.babu.stream;

import java.util.Arrays;

public class RemoveDuplicatesFromStringAndReturnInSameOrder {
    public static void main(String[] args) {
        String input = "dabfcadef"; // output-> dabfce
        input.chars().distinct().mapToObj(c-> (char)  c).forEach(System.out::print);
        //or
        //Arrays.stream(input.split("")).distinct().forEach(System.out::print);

    }
}
