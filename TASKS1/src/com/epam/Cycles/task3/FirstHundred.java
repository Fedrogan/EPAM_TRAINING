package com.epam.Cycles.task3;

public class FirstHundred {
    public static void main(String[] args) {
        int res = 0;
        for (int i = 1; i < 101; i++) {
            int temp = (int) Math.pow(i, 2);
            res += temp;
        }
        System.out.println(res);
    }
}
