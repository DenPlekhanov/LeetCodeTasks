package org.example.leetcodetasks.task435_medium;

public class Main435 {
    public static void main(String[] args) {
        Solution435 solution = new Solution435();
        int[][] intervals = new int[][]{{1, 22}, {2, 3}, {3, 14}, {1, 1}};

        int answer = solution.eraseOverlapIntervals(intervals);
        System.out.println(answer);
    }
}