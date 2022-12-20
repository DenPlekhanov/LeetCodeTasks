package org.example.leetcodetasks.task4;

public class Main4 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 3};
        int[] nums2 = new int[]{2, 4};
        double answer;
        Solution4 solution4 = new Solution4();
        answer = solution4.findMedianSortedArrays(nums1, nums2);
        System.out.println(answer);
    }
}
