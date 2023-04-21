
package com.babu.common.questions;

public class FibinociSeriesTest {

	public static void main(String[] args) {
		//out put: 0 1 1 2 3 5 8 13 21 34 55 89 ....
		
		int n1=0,n2=1,n=10, n3;
		System.out.print(n1 +" "+ n2);
		
		for (int i = 0; i < n; i++) {
			n3 = n1+n2;
			
			n1=n2;
			n2=n3;
			System.out.print(" "+ n3);
		}
		
	}
}
