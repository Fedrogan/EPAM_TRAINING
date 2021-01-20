package com.epam.TASKS2.Linear_Arrays.task6;

import java.math.BigInteger;

public class Solution {


    public static void main(String[] args) {
        double result = 0;
        double[] doubles = {1, 1.2, -54, Math.sqrt(4261), 0, 1515.13535636, Double.MAX_VALUE,
                            Double.MIN_VALUE, 124, 1661, 1346, 131, 3471, 357, 13, 734, 7, 34,
                            346, 163, 46, 134, 761, 37, 134, 713, 471, 347, 134, 1516, 155, 1};
        for (int i = 2; i < doubles.length; i++) {
            BigInteger bI = BigInteger.valueOf(i);
            boolean probablePrime = bI.isProbablePrime((int) Math.log(i));
            if (probablePrime) {
                result += doubles[i];
            }
        }
        System.out.println(result);
    }
}

