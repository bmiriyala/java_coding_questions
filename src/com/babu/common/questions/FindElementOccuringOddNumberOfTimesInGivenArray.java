package com.babu.common.questions;

public class FindElementOccuringOddNumberOfTimesInGivenArray {
    int getOddOccurrence(int ar[], int ar_size)
    {
        int i;
        int res = 0;
        for (i = 0; i < ar_size; i++) {
            res = res ^ ar[i];
        }
        return res;
    }

   /* static int getOddOccurrence(int arr[], int arr_size)
    {
        int i;
        for (i = 0; i < arr_size; i++) {
            int count = 0;
            for (int j = 0; j < arr_size; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count % 2 != 0)
                return arr[i];
        }
        return -1;
    }*/

    public static void main(String[] args)
    {
        FindElementOccuringOddNumberOfTimesInGivenArray occur = new FindElementOccuringOddNumberOfTimesInGivenArray();
        int array[] = new int[] { 2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2 };
        int n = array.length;
        System.out.println(occur.getOddOccurrence(array, n));
    }
}
