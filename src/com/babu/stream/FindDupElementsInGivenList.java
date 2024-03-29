package com.babu.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDupElementsInGivenList {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> set = new HashSet<Integer>();
        int x = myList.stream()
              .filter(n -> !set.add(n)).findFirst().get()
              ;
		System.out.println(x);

	}

}
