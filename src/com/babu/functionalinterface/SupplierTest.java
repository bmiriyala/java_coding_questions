package com.babu.functionalinterface;

import java.util.function.Supplier;

public class SupplierTest {

	/*
	 * Supplier, It represents a function which does not take in any argument but produces a value of type T.
	 * T get()
	 *  Supplier<Double> randomValue = () -> Math.random();
	 *  randomValue.get();
	 */
	public static void main(String[] args) {
		
		Supplier<String> strSupplier = () -> "Supplier Test";
		
		System.out.println(strSupplier.get());
		
		Supplier<Integer> intSupplier = () -> 10;
		
		System.out.println(intSupplier.get());
	}

}
