package com.company;

import java.util.Scanner;

public class Olympic_Rankings {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int g1 = sc.nextInt();
                int s1 = sc.nextInt();
                int b1 = sc.nextInt();
                int g2 = sc.nextInt();
                int s2 = sc.nextInt();
                int b2 = sc.nextInt();
                int total1 = g1+s1+b1;
                int total2 = g2+s2+b2;
                if (total1>total2){
                    System.out.println("1");
                }
                else System.out.println("2");
            }
        }catch (Exception e){
            return;
        }
    }
}
