package com.company;

import java.util.Scanner;

public class Greater_Average {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                float a = sc.nextFloat();
                float b = sc.nextFloat();
                float c = sc.nextFloat();
                if ((a+b)/2 > c){
                    System.out.println("YES");
                }
                else System.out.println("NO");
            }
        }catch (Exception e){
            return;
        }
    }
}
