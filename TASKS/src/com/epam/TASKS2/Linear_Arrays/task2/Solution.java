package com.epam.TASKS2.Linear_Arrays.task2;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        int[] ints = {1, 5, 84, 2346, 268, 6, 246, 3572, 27, 2357};
        Scanner scanner = new Scanner(System.in);
        int z = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > z) {
                ints[i] = z;
                count++;
            }
        }
        System.out.println(count);
    }
}
