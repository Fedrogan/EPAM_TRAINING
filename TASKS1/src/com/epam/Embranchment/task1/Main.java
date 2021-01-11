package com.epam.Embranchment.task1;

import static com.epam.Embranchment.task1.Input.input;
import static com.epam.Embranchment.task1.Triangle.isRightTriangle;
import static com.epam.Embranchment.task1.Triangle.isTriangle;

public class Main {

    public static int angle1;
    public static int angle2;

    public static void main(String[] args) {
        System.out.println("Введите первый угол");
        angle1 = input();
        System.out.println("Введите второй угол");
        angle2 = input();
        if (isTriangle(angle1, angle2)) {
            System.out.print("Треугольник существует и он ");
            if (isRightTriangle(angle1, angle2)) {
                System.out.println("прямоугольный.");
            } else {
                System.out.println("не прямоугольный.");
            }
        } else {
            System.out.println("Прямоугольник не существует!");
        }
    }
}
