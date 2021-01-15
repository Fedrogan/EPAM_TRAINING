package com.epam.Cycles.task5;

import java.util.Scanner;

public class Solution {
    public static double e;

    public static void main(String[] args) {
        e = new Scanner(System.in).nextDouble();
        System.out.println(summ(numberSeries()));
    }

    public static double[] numberSeries() {
        double[] res = new double[new Scanner(System.in).nextInt()];
        for (int i = 0; i < res.length; i++) {
            res[i] = (1 / Math.pow(2, i)) + (1 / Math.pow(3, i));
        }
        return res;
    }

    public static double summ(double[] res) {
        double result = 0;
        for (double re : res) {
            if (Math.abs(re) >= e) {
                result = result + re;
            }
        }
        return result;
    }
}
