package ru.job4j.array;

public class RightShift {

    public static void shift(int[] nums, int count) {
        int[] tmp = new int[nums.length];
        for (int j = 0; j < nums.length; j++) {
            tmp[j] = nums[j];
        }
        for (int i = 0; i < nums.length; i++) {
            int numIndex = i - count >= 0 ? i - count : nums.length + i - count;
            nums[i] = tmp[numIndex];
        }
    }

    private static void shift(int[] nums) {
        int count = 1;
        int[] tmp = new int[nums.length];
        for (int j = 0; j < nums.length; j++) {
            tmp[j] = nums[j];
        }
        for (int i = 0; i < nums.length; i++) {
            int index = i - count >= 0 ? i - count : nums.length - count;
            nums[i] = tmp[index];
        }
    }

}
