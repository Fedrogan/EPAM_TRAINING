package com.epam.TASKS1.Cycles.task4;

import java.math.BigInteger;

public class FirstTwoHundred {
    public static void main(String[] args) {
        BigInteger res = BigInteger.valueOf(1);
        for (long i = 1; i <= 200; i++) {
            res = res.multiply(BigInteger.valueOf((long)Math.pow(i, 2)));
        }
        System.out.println(res);
    }
}
