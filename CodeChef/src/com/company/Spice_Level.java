package com.company;

import java.util.Scanner;

public class Spice_Level {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int x = sc.nextInt();
                if (x<4){
                    System.out.println("MILD");
                }
                else if (x<7){
                    System.out.println("MEDIUM");
                }
                else System.out.println("HOT");
            }
        }catch (Exception e){
            return;
        }
    }
}
