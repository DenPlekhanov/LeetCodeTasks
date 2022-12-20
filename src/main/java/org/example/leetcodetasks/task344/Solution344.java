package org.example.leetcodetasks.task344;

public class Solution344 {
    public void reverseString(char[] s) {
        char change;
        for (int i = 0; i < s.length/2; i++) {
            change = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = change;
        }
    }
}