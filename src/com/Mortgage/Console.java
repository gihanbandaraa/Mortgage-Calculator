package com.Mortgage;

import java.util.Scanner;

public class Console {
    private static Scanner scanner = new Scanner(System.in);
    public static double readNum(String prompt, int Min, int Max) {

        double value = 0;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextDouble();

            if (value >= Min && value <= Max)
                break;
            System.out.println("Enter Number Between " + Min + " And " + Max);
        }
        return value;
    }
}
