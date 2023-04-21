package com.babu.stream;

import java.util.Arrays;
import java.util.Comparator;

public class GivenANumericArrayRearrangeTheElementsFromSmallestPossibleValue {
    public static void main(String[] args) {
        int[] array = {1, 34, 3, 98, 9, 76, 45, 4};
        Arrays.stream(array).mapToObj(i-> i+"").sorted().forEach(System.out::print);

        //output:: 133444576998

        System.out.println("\n" + "========================");

        Arrays.stream(array).mapToObj(i-> i+"").sorted(Comparator.reverseOrder()).forEach(System.out::print);

        //output is: 989764543431
    }
}
