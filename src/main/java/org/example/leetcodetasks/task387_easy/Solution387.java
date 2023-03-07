package org.example.leetcodetasks.task387_easy;

public class Solution387 {
    public int firstUniqChar(String s) {
        if (s.length() == 1) {
            return 0;
        }
        char[] array = s.toCharArray();
        int answer = -1;

        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array.length; k++) {
                if (array[i] != array[k] && i != k) {
                    answer = i;
                }
                if (array[i] == array[k] && i != k) {
                    answer = -1;
                    break;
                }
            }
            if (answer != -1) {
                return answer;
            }
        }
        return answer;
    }
}



