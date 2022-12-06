package com.babu.stream;

import java.util.Arrays;
import java.util.List;

public class FindAllNumbersStartWithGivenNumbersInList {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
		int number = 1;
        myList.stream()
              .map(s -> s + "") // Convert integer to String
              .filter(s -> s.startsWith(String.valueOf(number)))
              .forEach(System.out::println);

	}

}
