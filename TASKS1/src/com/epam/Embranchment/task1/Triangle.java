package com.epam.Embranchment.task1;

public class Triangle{

    public static boolean isTriangle (int angle1, int angle2) {
        return angle1 + angle2 < 180 && angle1 + angle2 > 0;
    }

    public static boolean isRightTriangle (int angle1, int angle2) {
        return angle1 == 90 || angle2 == 90 || angle1 + angle2 == 90;
    }
}


