package com.epam.TASKS2.Linear_Arrays.task1;

import java.util.Scanner;

public class Solution {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print(getSumm());
    }


    private static int [] arrayInitialize() {
        System.out.println("Задать размер и значения массива");
        int[] numbers = new int[scanner.nextInt()];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    private static int summ(int[] numbers) {
        System.out.println("Ввести делитель");
        int k = scanner.nextInt();
        int summ = 0;
        for (int number : numbers) {
            if (number % k == 0) {
                summ += number;
            }
        }
        return summ;
    }

    public static int getSumm() {
        return Solution.summ(arrayInitialize());
    }
}
