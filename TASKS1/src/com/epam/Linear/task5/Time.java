package com.epam.Linear.task5;

//import java.time.LocalTime;
//import java.time.LocalTime;
//import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Time {
    private static long seconds;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            seconds = scanner.nextLong();
            if (seconds < Math.pow(10, 18)) {
                long hrs = seconds / 3600;
                byte min = (byte) ((seconds % 3600) / 60);
                byte sec = (byte) ((seconds % 3600) % 60);
                printResult(hrs, min, sec);
            } else {
                System.out.printf("С момента Большого взрыва прошло меньше времени, чем Вы ввели :)");
            }
        } catch (Exception e) {
            System.out.printf("Вы ввели слишком большое число");
        }
    }

    public static void printResult (long hrs, int min, int sec) {
        if (hrs < 10 && min < 10 && sec < 10) {
            System.out.printf("0%dч 0%dмин 0%dс%n", hrs, min, sec);
        } else if (hrs < 10 && min < 10 && sec > 10) {
            System.out.printf("0%dч 0%dмин %dс%n", hrs, min, sec);
        } else if (hrs < 10 && min > 10 && sec > 10) {
            System.out.printf("0%dч %dмин %dс%n", hrs, min, sec);
        } else if (hrs < 10 && min > 10 && sec < 10) {
            System.out.printf("0%dч %dмин 0%dс%n", hrs, min, sec);
        } else if (hrs > 10 && min < 10 && sec < 10) {
            System.out.printf("%dч 0%dмин 0%dс%n", hrs, min, sec);
        } else if (hrs > 10 && min < 10 && sec > 10) {
            System.out.printf("%dч 0%dмин %dс%n", hrs, min, sec);
        } else if (hrs > 10 && min > 10 && sec < 10) {
            System.out.printf("%dч %dмин 0%dс%n", hrs, min, sec);
        } else {
            System.out.printf("%dч %dмин %dc%n", hrs, min, sec);
        }

        /*LocalTime localTime = LocalTime.of((int)hrs, min, sec);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HHч mmмин ssс");
        String text = dtf.format(localTime);
        System.out.println(text);*/

        /*if (seconds <= 86399) {
            System.out.println(anotherTime(seconds));
        }*/
    }

    /*public static LocalTime anotherTime(long seconds) {
        return LocalTime.ofSecondOfDay(seconds);
    }*/

}
