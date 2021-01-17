package com.epam.TASKS1.Cycles.task7;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        delimiter(m, n);
    }

    public static void delimiter(int m, int n) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = m; i <= n; i++) {
            System.out.println("Делители для числа " + i + ":");
            for (int j = 2; j <=i; j++) {
                if (i % j == 0 && i / j != 1) {
                    res.add(j);
                }
            }
            if (!res.isEmpty()) {
                System.out.println(res);
                res.clear();
            } else {
                System.out.println("Для данного числа нет делителей.");
            }
        }
    }
}
