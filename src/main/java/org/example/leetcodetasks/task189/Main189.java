package org.example.leetcodetasks.task189;

import java.util.Arrays;

public class Main189 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        int k = 10;

        Arrays.stream(nums).forEach(System.out::println);

        Solution189 solution189 = new Solution189();
        solution189.rotate(nums, k);
        System.out.println();
        Arrays.stream(nums).forEach(System.out::println);
    }
}