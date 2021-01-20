package com.epam.TASKS2.Linear_Arrays.task3;


public class Solution {

    public static void main(String[] args) {
        int[] ints = {1, -5, 84, 0, 268, -6, 246, -3572, 27, 2357};
        int countPositives = 0;
        int countNegatives = 0;
        int countZeros = 0;
        for (int i : ints) {
            if (i > 0) {
                countPositives++;
            } else if (i == 0) {
                countZeros++;
            } else {
                countNegatives++;
            }
        }
        System.out.println(countPositives);
        System.out.println(countNegatives);
        System.out.println(countZeros);
    }
}
