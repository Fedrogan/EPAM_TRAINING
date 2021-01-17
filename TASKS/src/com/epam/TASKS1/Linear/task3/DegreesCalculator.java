package com.epam.TASKS1.Linear.task3;

public class DegreesCalculator {

    public static double result;

    public double calculateDeg (double x, double y) {
        double sinX = Math.sin(Math.toRadians(x));
        double sinY = Math.sin(Math.toRadians(y));
        double cosX = Math.cos(Math.toRadians(x));
        double cosY = Math.cos(Math.toRadians(y));
        double tgXY = Math.tan(Math.toRadians(x * y));

        result = ((sinX + cosY) / (cosX - sinY)) * tgXY;
        return result;
    }
}
