package org.example.leetcodetasks.task435;

import java.util.Arrays;

class Solution435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        int answer = 0;
        Arrays.sort(intervals, (o1, o2) -> Integer.compare(o1[1], o2[1]));
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < end) {
                answer++;
            } else
                end = intervals[i][1];
        }

        return answer;
    }
}
