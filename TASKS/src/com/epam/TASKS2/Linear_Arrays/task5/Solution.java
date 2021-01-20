package com.epam.TASKS2.Linear_Arrays.task5;


public class Solution {

    public static void main(String[] args) {
        int[] ints = {1, 1, 1, 2, 4, 6, 10, 1, 3, 2357};

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > i) {
                System.out.println(ints[i]);
            }
        }
    }
}
