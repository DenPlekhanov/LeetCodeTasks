package org.example.leetcodetasks.task189;

public class Solution189 {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] tempArr = nums.clone();

        for (int i = 0; i < tempArr.length; i++) {
            nums[(i + k) % nums.length] = tempArr[i];
        }
    }
}