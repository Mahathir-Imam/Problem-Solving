package com.company;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int rat = sc.nextInt();
                if (rat>=1900){
                    System.out.println("Division 1");
                }
                else if (rat>=1600){
                    System.out.println("Division 2");
                }
                else if (rat>=1400){
                    System.out.println("Division 3");
                }
                else {
                    System.out.println("Division 4");
                }
            }
        }catch (Exception e){
            return;
        }
    }
}
