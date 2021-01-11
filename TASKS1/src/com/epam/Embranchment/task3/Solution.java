package com.epam.Embranchment.task3;

public class Solution {

    public static void main(String[] args) {
        int[] a = {2, 1};
        int[] b = {4, 1};
        int[] c = {6, 1};
        pointsIsOnOneLine(a, b, c);
    }

    public static void pointsIsOnOneLine( int[] a, int[] b, int[] c){
        int x1 = a[0];
        int x2 = b[0];
        int x3 = c[0];
        int y1 = a[1];
        int y2 = b[1];
        int y3 = c[1];
        if ((y1 - y2) * x3 + (x2 - x1) * y3 + (x1 * y2 - x2 * y1) == 0) {
            System.out.println("Точки лежат на одной прямой");
        } else {
            System.out.println("Точки не лежат на одной прямой");
        }
    }
}

