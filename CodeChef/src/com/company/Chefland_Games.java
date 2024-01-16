package com.company;

import java.util.Scanner;

public class Chefland_Games {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int r1 = sc.nextInt();
                int r2 = sc.nextInt();
                int r3 = sc.nextInt();
                int r4 = sc.nextInt();
                if (r1+r2+r3+r4 == 0){
                    System.out.println("IN");
                }
                else System.out.println("OUT");
            }
        }catch (Exception ignored){
        }
    }
}
