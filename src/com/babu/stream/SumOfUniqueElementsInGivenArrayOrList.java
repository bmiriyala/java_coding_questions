package com.babu.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class SumOfUniqueElementsInGivenArrayOrList {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,5,5,8,8,7};
        int sum = Arrays.stream(arr).distinct().sum();
        System.out.println(sum);

        Stream.of(5,6,7,8,5,5,8,8,7).distinct().reduce(Integer::sum).ifPresent(System.out::println);
    }
}
