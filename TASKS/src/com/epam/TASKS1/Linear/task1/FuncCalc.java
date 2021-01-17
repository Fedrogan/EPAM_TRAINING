package com.epam.TASKS1.Linear.task1;

import java.util.Scanner;

public class FuncCalc {
    private static double z;
    private static double a;
    private static double b;
    private static double c;
    public static double result;

    private double calculate (double a, double b, double c) {
        z = ((a - 3) * b / 2) + c;
        return z;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            c = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Ошибка ввода");
            e.printStackTrace();
        }

        FuncCalc funcCalc = new FuncCalc();
        result = funcCalc.calculate(a, b, c);
        System.out.println(result);

    }
}
