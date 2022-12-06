package com.babu.functionalinterface;

import java.util.function.Function;

public class FuntionTest {

	/*The Function interface represents a function (method) that takes a single parameter and returns a single value.
	 * 
	 * public interface Function<T,R> {

	    public <R> apply(T parameter);
	}
	 *Function<Long, Long> adder = (value) -> value + 3;
	 */
	public static void main(String[] args) {
		Function<String, String> subString = (value) -> value.substring(5);
		
		System.out.println(subString.apply("Test Function Interface"));

	}

}
