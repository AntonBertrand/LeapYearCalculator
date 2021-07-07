package com.company;

public class Main {

    public static void main(String[] args) {
        int test = 1924 % 400;
        System.out.println(test);

        boolean answer = LeapYearCalculator.isLeapYear(1924);
        System.out.println(answer);


    }
}
