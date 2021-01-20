package com.epam.TASKS2.Linear_Arrays.task4;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] ints = {1000, 5, 84, 2346, 268, 6, 246, 3572, 27, 2357};
        int max = 0;
        int maxPos = 0;
        int min = ints[0];
        int minPos = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > max) {
                max = ints[i];
                maxPos = i;
            } else if (ints[i] < min) {
                min = ints[i];
                minPos = i;
            }
        }
        ints[maxPos] = min;
        ints[minPos] = max;
        System.out.println(Arrays.toString(ints));
    }
}

