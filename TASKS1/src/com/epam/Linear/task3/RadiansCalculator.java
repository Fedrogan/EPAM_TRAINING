package com.epam.Linear.task3;

public class RadiansCalculator {

    public static double result;

    public double calculateRad (double x, double y) {
        double sinX = Math.sin(x);
        double sinY = Math.sin(y);
        double cosX = Math.cos(x);
        double cosY = Math.cos(y);
        double tgXY = Math.tan(x * y);

        result = ((sinX + cosY) / (cosX - sinY)) * tgXY;
        return result;
    }
}
