package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Time_Conversion {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = n/3600;
        int mint = (int) ((((double)n/3600)-h)*60);
        int sec = (int) ((((((double)n/3600)-h)*60)-mint)*60);
        System.out.println(h+":"+mint+":"+sec);
    }
}
