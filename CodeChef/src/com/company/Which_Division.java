package com.company;

import java.util.Scanner;

public class Which_Division {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int r = sc.nextInt();
                if (r>=2000){
                    System.out.println("1");
                }
                else if (r>=1600){
                    System.out.println("2");
                }
                else {
                    System.out.println("3");
                }
            }
        }catch (Exception e){
            return;
        }
    }
}
