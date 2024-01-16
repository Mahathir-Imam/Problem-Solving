package com.company;

import java.util.Scanner;

public class The_Cooler_Dilemma2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while(tc-->0){
                long x = sc.nextInt();
                long y = sc.nextInt();
                if (y%x == 0){
                    System.out.println((y/x)-1);
                }
                else if (y%x != 0){
                    System.out.println(y/x);
                }
            }
        }catch (Exception e){
            return;
        }
    }
}
