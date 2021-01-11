package com.epam.Embranchment.task2;

public class Main {

    public static void main(String[] args) {
        System.out.println(max(34,5347,14,67));
        System.out.println(mathMax(34,5347,14,67));
    }

    public static int max(int a, int b, int c, int d) {
        int min1, min2;
        int max;
        if (a < b) {
            min1 = a;
        } else {
            min1 = b;
        }
        if (c < d) {
            min2 = c;
        } else {
            min2 = d;
        }
        if (min1 > min2) {
            max = min1;
        } else {
            max = min2;
        }
        return max;
    }

    public static int mathMax(int a, int b, int c, int d) {
        return Math.max(Math.min(a, b), Math.min(c, d));
    }
}

