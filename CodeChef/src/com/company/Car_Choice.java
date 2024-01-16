package com.company;

import java.util.Scanner;

public class Car_Choice {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int x1 = sc.nextInt();
                int x2 = sc.nextInt();
                int y1 = sc.nextInt();
                int y2 = sc.nextInt();
                float cost1 = (float) y1/x1;
                float cost2 = (float) y2/x2;
                if (cost1<cost2){
                    System.out.println("-1");
                }
                else if (cost1>cost2){
                    System.out.println("1");
                }
                else System.out.println("0");
            }
        }catch (Exception e){
            return;
        }
    }
}
