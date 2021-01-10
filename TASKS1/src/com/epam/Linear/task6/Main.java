package com.epam.Linear.task6;

import java.util.Scanner;

public class Main {
    static double x;
    static double y;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        x = Double.parseDouble(scanner.nextLine());
        y = Double.parseDouble(scanner.nextLine());
        System.out.println(isInside(x, y));
    }

    public static boolean isInside (double x, double y) {
        if (y == -1 && x == 0) {
            return false;
        } else {
            return y >= 0 && y <= 4 && x >= -2 && x <= 2 || y >= -3 && y <= 0 && x >= -4 && x <= 4;
        }
    }
}
