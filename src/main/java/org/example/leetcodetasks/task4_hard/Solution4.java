package org.example.leetcodetasks.task4_hard;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        double answer = IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2))
                .sorted()
                .skip(length / 2L - (length + 1) % 2)
                .limit(1L + ((length + 1) % 2))
                .mapToDouble(s -> s)
                .sum();

        return answer / (1 + ((length + 1) % 2));
    }
}
