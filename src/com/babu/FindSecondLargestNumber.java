package com.babu;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		//int arr[] = { 256,56,28, 16, 51, 95, 256, 95, 52, 256, 86, 256, 36, 95, 256, 5 ,72 };
		int arr[] = { 100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
		int largest = 0,secondLargest =0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > largest) {
				secondLargest = largest;
                largest = arr[i];
			}else if (arr[i] > secondLargest)
            {
                secondLargest = arr[i];
            }
		}
		System.out.println("Second largest number is:" + secondLargest);
        System.out.println("Largest Number is: "  +largest);

	}

}
