package com.babu;

public class PrintNextGreaterNumber {

	public static void main(String[] args) {
		int[] array = {4, 3,  7, 10,  5, 6, 3 };
		boolean isNotGreater = true;
		for(int i=0; i< array.length; i++){
			for(int j=i+1; j< array.length; j++){
				isNotGreater = true;
		        if(array[i] < array[j]){
		        	isNotGreater = false;
					System.out.println(array[i] + " greater number is: " + array[j]);
					break;
				}
			}
			if(isNotGreater) {
				System.out.println(array[i] + " greater number is: " + -1);
			}
		}


	}

}
