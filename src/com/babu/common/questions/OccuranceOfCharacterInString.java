package com.babu.common.questions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class OccuranceOfCharacterInString {

	public static void main(String[] args) {
		String str = "My name is Babu";
		
		Arrays.stream(str.split(""))
        .map(String::toLowerCase)
        .collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()))
        .forEach((k, v) -> System.out.println(k + " = " + v));

	}

}
