package com.babu.basic.leetcode;

import java.util.HashSet;

public class FIndTripletForAGivenValue {
    public static void main(String[] args) {
        int[] array = { 1, 4, 45, 6, 10, 8 };
        int sum = 22;
        int arr_size = array.length;

        boolean isHavingTriplet = find3Numbers(array, arr_size, sum);
        System.out.println("\nIs it Triplet ?? -> " +isHavingTriplet);
    }

    private static boolean find3Numbers(int[] array, int arr_size, int sum) {
        // Fix the first element as array[i]
        for (int i = 0; i < arr_size - 2; i++) {

            // Find pair in sub array, array[i+1..n-1] with sum equal to sum - array[i]
            HashSet<Integer> hs = new HashSet<Integer>();
            int curr_sum = sum - array[i];
            for (int j = i + 1; j < arr_size; j++)
            {
                if (hs.contains(curr_sum - array[j]))
                {
                    System.out.print("Triplet is " + array[i] + ", " + array[j] + ", " + (curr_sum - array[j]));
                    return true;
                }
                hs.add(array[j]);
            }
        }

        // If we reach here, then no triplet was found
        return false;
    }
}
