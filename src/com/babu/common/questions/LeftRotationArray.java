package com.babu.common.questions;

public class LeftRotationArray {

	public static void main(String[] args) {
		/*
		 * Time complexity : O(n) 
		   Auxiliary Space : O(d)
		 */
		
		int[] arr = {4, 3,  7, 10,  5, 6, 3 };
		int n=2;
				
		 //Rotate the given array by n times toward left  
        for(int i = 0; i < n; i++){  
            int j, first;  
            //Stores the first element of the array  
            first = arr[0];  
            for(j = 0; j < arr.length-1; j++){  
                //Shift element of array by one  
                arr[j] = arr[j+1];  
            }  
            //First element of array will be added to the end  
            arr[j] = first;  
        } 
        System.out.println("Array after left rotation: ");  
        for(int i = 0; i< arr.length; i++){  
            System.out.print(arr[i] + " ");  
        }  


	}

}
