package org.example.leetcodetasks.task7_medium;

public class Solution7 {
    public int reverse(int x) {
        long xx = x;
        boolean isAnswerPositive = true;
        if (x < 0) {
            isAnswerPositive = false;
            xx = xx * -1L;
        }

        char[] array = String.valueOf(xx).toCharArray();
        System.out.println(array);
        char change;
        for (int i = 0; i < array.length / 2; i++) {
            change = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = change;
        }

        double answer = Double.parseDouble(String.valueOf(array));
        if (!isAnswerPositive) {
            answer = answer * -1;
        }
        if (answer <= -2147483648 || answer >= 2147483647) {
            return 0;
        }
        return (int) answer;
    }
}