package com.epam.TASKS1.Linear.task2;

import java.util.Scanner;

public class Calculation {
    private static double a;
    private static double b;
    private static double c;
    public static double result;

    private double calculate (double a, double b, double c) {
        double sqrt = Math.sqrt(Math.pow(b, 2) + 4 * a * c);
        return result = (b + sqrt) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
    }

    private void input () {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                a = Double.parseDouble(scanner.next());
            } catch (Exception e) {
                System.out.println("Введите действительное число");
                continue;
            }
            break;
        }
        while (true) {
            try {
                b = Double.parseDouble(scanner.next());
            } catch (Exception e) {
                System.out.println("Введите действительное число");
                continue;
            }
            break;
        }
        while (true) {
            try {
                c = Double.parseDouble(scanner.next());
            } catch (Exception e) {
                System.out.println("Введите действительное число");
                continue;
            }
            break;
        }
    }

    public static void main(String[] args) {
        Calculation calc = new Calculation();
        calc.input();
        result = calc.calculate(a, b, c);
        System.out.println(result);
    }
}

