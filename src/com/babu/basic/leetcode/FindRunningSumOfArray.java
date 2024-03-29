package com.babu.basic.leetcode;

import java.util.Arrays;

/*
    Input: nums = [1,2,3,4]
    Output: [1,3,6,10]
    Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 */
public class FindRunningSumOfArray {
    public int[] runningSum(int[] nums) {

        for(int i = 1; i < nums.length; i++){
            nums[i]  = nums[i - 1] + nums[i];
        }
        return nums;
    }
    public static void main(String[] args) {
        FindRunningSumOfArray findRunningSumOfArray = new FindRunningSumOfArray();
            int[] nums = {1,2,3,4};
        int[] runningSumArray = findRunningSumOfArray.runningSum(nums);
        Arrays.stream(runningSumArray).forEach(System.out::println);
    }
}
