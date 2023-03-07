package org.example.leetcodetasks.task7_medium;

public class Solution7_version2 {
    public int reverse(int x) {
        StringBuilder sb = new StringBuilder();
        long xx = x;
        boolean isXPositive = true;

        if (x < 0) {
            isXPositive = false;
            xx = x*-1L;
        }

        sb.append(xx).reverse();

        long answer = Long.parseLong(String.valueOf(sb));
        if (!isXPositive) {
            answer *= -1;
        }

        if (answer <= -2147483648 || answer >= 2147483647) {
            return 0;
        }
        return (int) answer;
    }
}