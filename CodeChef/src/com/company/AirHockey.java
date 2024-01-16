package com.company;

import java.util.Scanner;

public class AirHockey {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0){
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (a>=b){
                    System.out.println(7-a);
                }
                else System.out.println(7-b);
            }
        }catch (Exception e){
            return;
        }
    }
}
