package com.company;

import java.time.LocalDate;
import java.util.Scanner;

import static java.lang.System.out;

public class Date_Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();
        LocalDate date = LocalDate.of(year,month,day);
        out.println(date.getDayOfWeek());
    }
}
