package com.epam.Cycles.task1;

import java.util.Scanner;

public class Summator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(summation(a));
    }

    public static int summation(int a) {
        int res = 0;
        for (int i = 0; i <= a; i++) {
            res += i;
        } return res;
    }
}
