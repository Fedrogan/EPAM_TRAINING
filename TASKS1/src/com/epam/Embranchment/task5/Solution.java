package com.epam.Embranchment.task5;

public class Solution {

    public static void main(String[] args) {
        System.out.println(calculateFunc(2));
    }

    public static double calculateFunc(int x) {
        double result;
        if (x <= 3) {
            result = x * x - 3 * x + 9;
        } else {
            result = 1 / (Math.pow(x, 3) + 6);
        }
        return result;
    }
}
