package com.babu.stream;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindEachCharacterCountInGivenString {

	public static void main(String[] args) {
		String input = "Java Hungry Blog Alive is Awesome";

        input.chars() // Stream of String       
                                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase         
                                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count 
                                .entrySet()
                                .stream()
                                .forEach(entry -> System.out.println(entry.getKey() + "  " + entry.getValue()));

	}

}
