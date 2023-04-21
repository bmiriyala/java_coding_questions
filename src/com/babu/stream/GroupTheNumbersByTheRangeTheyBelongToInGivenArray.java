package com.babu.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupTheNumbersByTheRangeTheyBelongToInGivenArray {
    public static void main(String[] args) {
        //List<Integer> integerList = List.of(2,34,54,23,33,20,59,11,19,37);
        Map<Integer, List<Integer>> listMap = Stream.of(2, 34, 54, 23, 33, 20, 59, 11, 19, 37)
                .collect(Collectors.groupingBy(i -> i / 10 * 10));
        System.out.println(listMap);
    }

}
