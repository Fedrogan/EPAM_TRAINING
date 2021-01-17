package com.epam.TASKS1.Cycles.task2;

public class Solution {

    public static void main(String[] args) {
        int a = -5;
        int b = 10;
        double h = 0.5;

        for (double i = a; i <= b; ) {
            System.out.println(func(i));
            i += h;
        }

    }

    public static double func(double x) {
        if (x > 2) {
            return x;
        } else {
            return -x;
        }
    }
}
