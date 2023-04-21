package com.babu.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DivideTheListIntoEvenAndOddNumbersLists {
    public static void main(String[] args) {

        List<Integer> integerList = List.of(1,2,4,5,8,10);

        List<List<Integer>> lists = new ArrayList<>(integerList.stream()
                .collect(Collectors.groupingBy(key -> key % 2 == 0, Collectors.toList()))
                //.entrySet().stream().map(Map.Entry::getValue).collect(Collectors.toList());
                //.values().stream().collect(Collectors.toList());
                .values());
        System.out.println(lists);

        List<List<Integer>> listOfLists = integerList.stream()
                .collect(Collectors.partitioningBy(integerValue -> integerValue % 2 == 0))
                //.entrySet().stream().map(Map.Entry::getValue).toList();
                .values().stream().toList();
        listOfLists.forEach(System.out::println);

        Map<Boolean, List<Integer>> partitions = integerList.stream()
                .collect(Collectors.partitioningBy(x -> x % 2 == 0));
        List<Integer> evens = partitions.get(true);
        List<Integer> odds = partitions.get(false);


    }
}
