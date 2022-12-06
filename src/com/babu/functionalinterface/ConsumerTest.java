package com.babu.functionalinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {

	/*
	 * A Consumer is a functional interface that accepts a single input and returns no output. 
	 * void accept(T t);
	 * 
	 */
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Consumer<Integer> consumer = (item) -> list.add(item);
		for(int i =0; i< 100; i++) {
			consumer.accept(i);
		}
		
			
		System.out.println(list);

	}

}
