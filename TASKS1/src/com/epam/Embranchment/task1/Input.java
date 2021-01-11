package com.epam.Embranchment.task1;

import java.util.Scanner;

public class Input {
    public static int angle;

    public static int input() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                angle = Integer.parseInt(scanner.nextLine());
                return angle;
            } catch (Exception e) {
                System.out.println("Введите угол в целых градусах");
            }
        }
    }
}
