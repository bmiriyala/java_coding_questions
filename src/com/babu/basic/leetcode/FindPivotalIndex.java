package com.babu.basic.leetcode;

import java.util.Arrays;

/*
    Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1.
 */
public class FindPivotalIndex {
    public int pivotIndex(int[] nums) {

        int total_sum = Arrays.stream(nums).reduce(0, (a, b) -> a + b);
        int left_sum = 0;
        int right_sum = total_sum;
        for(int i = 0; i < nums.length; i++){
            right_sum = right_sum - nums[i];

            if(left_sum == right_sum){
                return i;
            }
            left_sum += nums[i];

        }
        return -1;
    }

    public static void main(String[] args) {
        FindPivotalIndex findPivotalIndex = new FindPivotalIndex();
        int[] array = {1,7,3,6,5,6};
        //Input: nums = [1,2,3] o/p: -1
        //Input: nums = [2,1,-1] o/p: 0
        int pivotalIndex = findPivotalIndex.pivotIndex(array);
        System.out.println(pivotalIndex);
    }
}
