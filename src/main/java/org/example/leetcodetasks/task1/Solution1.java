package org.example.leetcodetasks.task1;

class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        int number1;
        int number2;
        int[] answer = new int[2];

        for (number1 = 0; number1 < nums.length; number1++) {
            for (number2 = number1 + 1; number2 < nums.length; number2++) {
                if (nums[number1] + nums[number2] == target) {
                    answer[0] = number1;
                    answer[1] = number2;
                    return answer;
                }
            }
        }
        return new int[0];
    }
}
