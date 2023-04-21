package com.babu.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheNumberOfOccurrenceOfEachWord {
    public static void main(String[] args) {
        String input = "the quick brown fox jumps right over the little lazy dog little";
        Map<String, Long> collect = Arrays.stream(input.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
                //.forEach((key, value) -> System.out.println(key + " " + value));
        System.out.println(collect);
    }

}
