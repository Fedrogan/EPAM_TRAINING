package com.epam.Cycles.task6;

public class CodeTable {
    public static void main(String[] args) {
        printCodeTable();
    }

    static void printCodeTable() {
        for (int i = 0; i <= 255; i++) {
            System.out.println((char) i + " - " + i );
        }
    }
}
