package com.epam.Linear.task3;


public class TrigonometricCalculation {
    public static double x;
    public static double y;
    public static String typeOfCalc;

    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("Введите х:");
        x = input.inputXY();
        System.out.println("Введите y:");
        y = input.inputXY();
        System.out.println("Вы ввели радианы или градусы?");
        typeOfCalc = input.typeOfCalc();
        if (typeOfCalc.equals("градусы")) {
            DegreesCalculator dc = new DegreesCalculator();
            System.out.println(dc.calculateDeg(x, y));
        } else {
            RadiansCalculator rc = new RadiansCalculator();
            System.out.println(rc.calculateRad(x, y));
        }
    }
}

