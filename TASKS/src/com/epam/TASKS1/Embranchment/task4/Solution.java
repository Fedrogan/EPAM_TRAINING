package com.epam.TASKS1.Embranchment.task4;

public class Solution {

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int x = 2;
        int y = 10;
        int z = 9;

        if (willComeIn(a, b, x, y, z)) {
            System.out.println("Кирпич проходит через отверстие");
        } else {
            System.out.println("Кирпич не проходит через отверстие");
        }

    }


    public static boolean willComeIn(int a, int b, int x, int y, int z) {
        return x <= a && z <= b || z <= a && x <= b ||
                y <= a && x <= b || x <= a && y <= b ||
                y <= a && z <= b || z <= a && y <= b;
    }
}
