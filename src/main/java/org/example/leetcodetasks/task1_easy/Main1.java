package org.example.leetcodetasks.task1_easy;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
//        int[] nums = new int[]{3, 2, 4};
//        int target = 6;
        System.out.println(Arrays.toString(solution.twoSum(nums, target)));
    }
}