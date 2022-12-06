package com.babu.functionalinterface;

import java.util.function.Predicate;

public class PredicateTest {

	/*
	 * Predicate, represents a simple function that takes a single value as parameter, and returns true or false
	 * public interface Predicate<T> {
	    boolean test(T t);
	}
	 *Predicate predicate = (value) -> value != null;
	 *
	 *predicate.test("test")
	 */
	public static void main(String[] args) {
		Predicate<String> predicate = (value) -> value != null;
		System.out.println(predicate.test("predicate"));
		
		Predicate<Integer> intPredicate = (value) -> value % 2 == 0;
		System.out.println(intPredicate.test(10));

	}

}
