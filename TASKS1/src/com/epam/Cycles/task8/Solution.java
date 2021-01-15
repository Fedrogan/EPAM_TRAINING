package com.epam.Cycles.task8;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        long y = scanner.nextLong();
        identicalNumbers(x, y);
    }


    public static ArrayList<Character> identicalNumbers(long x, long y) {
        ArrayList<Character> res = new ArrayList<>();
        for (int i = 0; i < Long.toString(x).length(); i++) {
            for (int j = 0; j < Long.toString(y).length(); j++) {
                if (Long.toString(x).charAt(i) == Long.toString(y).charAt(j) && !res.contains(Long.toString(x).charAt(i))) {
                    res.add(Long.toString(x).charAt(i));
                }
            }
        } return res;
    }
}


