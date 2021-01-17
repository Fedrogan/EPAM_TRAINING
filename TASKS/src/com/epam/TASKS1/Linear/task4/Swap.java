package com.epam.TASKS1.Linear.task4;


public class Swap {
    static double x = 452.155;

    public static void main(String[] args) {
        String[] halfsOfNumber = Double.toString(x).split("\\.", 2);
        String temp = halfsOfNumber[1] + "." + halfsOfNumber[0];
        double result = Double.parseDouble(temp);
        System.out.println(result);
    }

    
    

}
