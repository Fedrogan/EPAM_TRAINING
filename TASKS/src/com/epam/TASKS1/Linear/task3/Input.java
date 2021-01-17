package com.epam.TASKS1.Linear.task3;

import java.util.Scanner;

public class Input {
    public double in;
    public String typeOfCalc;

    public double inputXY () {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                in = Double.parseDouble(scanner.next());
                scanner.nextLine();
                return in;
            } catch (Exception e) {
                System.out.println("Введите действительное число");
            }
        }
    }

    public String typeOfCalc() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            typeOfCalc = scanner.nextLine();
            if (typeOfCalc.toLowerCase().equals("градусы") || typeOfCalc.toLowerCase().equals("радианы")) {
                return typeOfCalc.toLowerCase();
            } else {
                System.out.println("Можно ввести только \"градусы\" или \"радианы\"");
            }
        }
    }
}

