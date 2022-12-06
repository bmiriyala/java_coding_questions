package com.babu;

public class PrintNumbersWithOutForLoop {

	public static void main(String[] args) {
		
		
		test(1);

	}
	static void test(int i){
		if(i<=100) {
			System.out.println(i++);
			test(i);
		}
			
	}

}
