package com.epam.TASKS2.Multidimensional_Arrays.task1;


public class Solution {
    static int[][] integers = new int[(int) (Math.random()*20)] [(int) (Math.random()*20)];

    public static void main(String[] args) {
        fillArray();
        print(integers);

    }

    static void print(int[][] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 && array[i].length != 0) {
                if (array[i][0] > array[i][array[i].length - 1]) {
                    count++;
                    for (int j = 0; j < array[i].length; j++) {
                        System.out.print(array[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }
        if (count == 0) {
            System.out.println("Нет столбцов, удовлетворяющих заданное условие!");
        }
    }

    static void fillArray() {
        for (int i = 0; i < integers.length; i++) {
            for (int j = 0; j < integers[i].length; j++) {
                integers[i][j] = (int) (Math.random() * 200);
            }
        }
    }
}
